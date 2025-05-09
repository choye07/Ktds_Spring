package com.hello.security.oauth.user;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.core.user.OAuth2User;

import com.hello.member.vo.ActionVO;
import com.hello.member.vo.MembersVO;
import com.hello.member.vo.OAuthMemberVO;

/**
 * OAuth 인증 객체
 * 	- Spring Security Login의 인증객체 = SecurityUser : UserDetails
 *  - OAuth Login 인증 객체 = OAuthUserDetails : OAuth2User
 * 응답이 왔을 때 이루어짐
 */
public class OAuthUserDetails implements OAuth2User {

	private OAuthMemberVO oAuthMemberVO;
	
	/**
	 * 개발자가 만든 인터페이스 사용자의 정보를 받아오기 위한 것.
	 */
	private OAuth2UserInfo oAuth2UserInfo;
	
	
	public OAuthUserDetails(OAuthMemberVO oAuthMemberVO, OAuth2UserInfo oAuth2UserInfo) {
		this.oAuthMemberVO = oAuthMemberVO;
		this.oAuth2UserInfo = oAuth2UserInfo;
	}

	@Override
	public Map<String, Object> getAttributes(){
		return this.oAuth2UserInfo.getAttributes();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// 권한/역할 정보는 데이터베이스에서 관리.
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();
		
		// 역할 부여 (ROLE)
		authorities.add(new SimpleGrantedAuthority(this.oAuthMemberVO.getRole()));
		
		// 권한 부여 (ACTION)
		for (ActionVO actionVO : this.oAuthMemberVO.getActionList()) {
			authorities.add(new SimpleGrantedAuthority(actionVO.getActionId()));
		}
		
		return authorities;
	}

	@Override
	public String getName() {
		return this.oAuthMemberVO.getName();
	}

	public OAuthMemberVO getmembersVO() {
		return oAuthMemberVO;
	}

	public void setmembersVO(OAuthMemberVO oAuthMemberVO) {
		this.oAuthMemberVO = oAuthMemberVO;
	}

	public OAuth2UserInfo getoAuth2UserInfo() {
		return oAuth2UserInfo;
	}

	public void setoAuth2UserInfo(OAuth2UserInfo oAuth2UserInfo) {
		this.oAuth2UserInfo = oAuth2UserInfo;
	}
	

	
}
