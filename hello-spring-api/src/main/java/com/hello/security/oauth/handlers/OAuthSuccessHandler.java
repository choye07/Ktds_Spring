package com.hello.security.oauth.handlers;

import java.io.IOException;
import java.time.Duration;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.hello.member.vo.MembersVO;
import com.hello.member.vo.OAuthMemberVO;
import com.hello.security.jwt.JsonWebTokenProvider;
import com.hello.security.oauth.user.OAuthUserDetails;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * oAuth 인증 성공한 사용자에게 JsonWebToken 을 발급시켜주는 역할.
 */
public class OAuthSuccessHandler implements AuthenticationSuccessHandler {

	private JsonWebTokenProvider jwtProvider;
	
	public OAuthSuccessHandler(JsonWebTokenProvider jwtProvider) {
		this.jwtProvider = jwtProvider;
	}
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		
		// 1. Authentication 객체에서 OAuth2User 객체를 불러온다.
		OAuth2User oAuth2User = (OAuth2User) authentication.getPrincipal();
		
		// 2. OAuth2User 객체에서 OAuthMemberVO 객체를 불러온다.
		OAuthUserDetails oAuthUserDetails = (OAuthUserDetails) oAuth2User;
		OAuthMemberVO oAuthMemberVO = oAuthUserDetails.getmembersVO();
		
		// 3. OAuthMemberVO 객체를 MembersVO 객체로 변환시킨다.
		MembersVO membersVO = new MembersVO();
		membersVO.setEmail(oAuthMemberVO.getEmail());
		membersVO.setName(oAuthMemberVO.getName());
		membersVO.setRole(oAuthMemberVO.getRole());
		membersVO.setActionList(oAuthMemberVO.getActionList());
		
		// 4. MembersVO 객체로 JWT 발급한다.
		String jsonWebToken = this.jwtProvider.generateJsonWebToken(membersVO, Duration.ofDays(30));
		
		// 5. JWT를 사용자에게 전달한다.
		response.sendRedirect("http://localhost:3000?jwt=" + jsonWebToken);
	}

}