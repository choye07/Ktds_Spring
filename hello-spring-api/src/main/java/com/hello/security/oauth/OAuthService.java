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
public class OAuthService implements OAuth2UserService<OAuth2UserRequest, OAuth2User>{

//	@Autowired
//	private OAuth2UserService <OAuth2UserRequest, OAuth2User> oAuthRequestor;
	
	@Autowired
	private MemberDao memberDao;
	
	
	/**
	 * OAuth 채널에게 로그인을 요청.
	 * 요청된 결과를 받아온다.
	 */
	@Override
	public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
		//1. OAuth 토큰 인증 요청 (https://nid.naver.com/oauth2.0/token)
		//2. 개인정보 받아온다. (https://openapi.naver.com/v1/nid/me)
		OAuth2UserService <OAuth2UserRequest, OAuth2User> oAuthRequestor = new DefaultOAuth2UserService();
		OAuth2User oAuth2User = oAuthRequestor.loadUser(userRequest);
		
		//DB에 oAuth2User를 등록한다.
		String provider = userRequest.getClientRegistration().getRegistrationId();
		OAuth2UserInfo oAuthUser2Info = null;
//	    - 2. Provider가 Naver라면 NaverOauthUser로 생성
		if(provider.equals("naver")) {
			oAuthUser2Info = new NaverUserInfo(oAuth2User.getAttributes());
		}
//		- 2. Provider가 Google이 라면 GoogleOauthUser로 생성
		else if(provider.equals("google")) {
			oAuthUser2Info = new GoogleUserInfo(oAuth2User.getAttributes());
			
		}
//		- 3. oAuthUser를 DB에 저장한다.
		OAuthMemberVO oAuthMemberVO = new OAuthMemberVO();
		oAuthMemberVO.setEmail(oAuthUser2Info.getEmail());
		oAuthMemberVO.setName(oAuthUser2Info.getName());
		oAuthMemberVO.setProvider(provider);
		int oAuthUserConut = this.memberDao.selectCountOAuthMember(oAuthMemberVO);
		
		if(oAuthUserConut==0) {
			this.memberDao.insertOAuthMember(oAuthMemberVO);
//		- 4. oAuthUser에게 Action을 할당한다.
			MembersVO membersVO = new MembersVO();
			membersVO.setEmail(oAuthUser2Info.getEmail());
			membersVO.setName(oAuthUser2Info.getName());
			membersVO.setActionList(oAuthMemberVO.getActionList());
			membersVO.setRole("ROLE_USER");
			this.memberDao.insertActions(membersVO);
		}
		//3. 인증객체를 전달한다. (OAuthUserDetails)
//		  - 1. OAUTH_MEMBERS에서 가입한 정보를 조회한다.
		OAuthMemberVO verifiedOAuthMemberVO=  this.memberDao.selectOAuthMember(oAuthMemberVO);
//		  - 2. 조회된 결과를 OAuthUserDetails로 만들어서 변환한다.
		return new OAuthUserDetails(verifiedOAuthMemberVO, oAuthUser2Info);
	}
	
}
