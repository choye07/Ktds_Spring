package com.hello.security.oauth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserService;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import com.hello.member.dao.MemberDao;
import com.hello.member.vo.MembersVO;
import com.hello.member.vo.OAuthMemberVO;
import com.hello.security.oauth.user.OAuth2UserInfo;
import com.hello.security.oauth.user.OAuthUserDetails;
import com.hello.security.oauth.user.providers.GoogleUserInfo;
import com.hello.security.oauth.user.providers.NaverUserInfo;

/**
 * OAuth 채널별로 요청을 하고 응답을 받아온다.
 * 받아온 응답을 OAuth2UserInfo(NaverUserInfo, GoogleUserInfo)로 분석하고
 * 분석한 결과를 OAuthUserDetails에 전달해서 인증을 완성한다.
 */
@Service
public class OAuthService implements OAuth2UserService<OAuth2UserRequest, OAuth2User> {

//	@Autowired
//	private OAuth2UserService<OAuth2UserRequest, OAuth2User> oAuthRequestor;
	
	@Autowired
	private MemberDao memberDao;
	
	/**
	 * OAuth 채널에게 로그인을 요청.
	 * 요청된 결과를 받아온다.
	 */
	@Override
	public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
		OAuth2UserService<OAuth2UserRequest, OAuth2User> oAuthRequestor = new DefaultOAuth2UserService();
		
		// 1. OAuth 토큰 인증 요청. (https://nid.naver.com/oauth2.0/token)
		// 2. 개인정보 받아온다. (https://openapi.naver.com/v1/nid/me)
		OAuth2User oAuth2User = oAuthRequestor.loadUser(userRequest);
		
		// DB에 oAuthUser를 등록한다.
		//  - 1. Provider가 누군지 알아야 한다. (Naver, Google)
		String provider = userRequest.getClientRegistration().getRegistrationId();
		
		//  - 2. Provider가 Naver라면 NaverOAuthUser로 생성.
		OAuth2UserInfo oAuth2UserInfo = null;
		if (provider.equals("naver")) {
			oAuth2UserInfo = new NaverUserInfo(oAuth2User.getAttributes());
		}
		//  - 2. Provider가 Google이라면 GoogleOAuthUser로 생성.
		else if (provider.equals("google")) {
			oAuth2UserInfo = new GoogleUserInfo(oAuth2User.getAttributes());
		}
		
		//  - 3. oAuthUser를 DB에 저장한다.
		OAuthMemberVO oAuthMemberVO = new OAuthMemberVO();
		oAuthMemberVO.setEmail(oAuth2UserInfo.getEmail());
		oAuthMemberVO.setName(oAuth2UserInfo.getName());
		oAuthMemberVO.setProvider(provider);
		
		int oAuthUserCount = this.memberDao.selectCountOAuthMember(oAuthMemberVO);
		if (oAuthUserCount == 0) {
			this.memberDao.insertOAuthMember(oAuthMemberVO);
			//  - 4. oAuthUser에게 Action을 할당한다.
			MembersVO membersVO = new MembersVO();
			membersVO.setEmail(oAuth2UserInfo.getEmail());
			membersVO.setRole("ROLE_USER");
			this.memberDao.insertActions(membersVO);
		}
		
		// 3. 인증객체를 전달한다. (OAuthUserDetails)
		//  - 1. OAUTH_MEMBERS에서 가입한 정보를 조회한다.
		OAuthMemberVO verifiedOAuthMember = this.memberDao.selectOAuthMember(oAuthMemberVO);
		
		//  - 2. 조회된 결과를 OAuthUserDetails로 만들어서 반환한다.
		return new OAuthUserDetails(verifiedOAuthMember, oAuth2UserInfo);
	}

}