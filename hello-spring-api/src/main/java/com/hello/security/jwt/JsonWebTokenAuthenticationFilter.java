package com.hello.security.jwt;

import java.io.IOException;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import com.google.gson.Gson;
import com.hello.common.vo.ApiResponse;
import com.hello.member.vo.MembersVO;
import com.hello.security.SecurityUser;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JsonWebTokenAuthenticationFilter extends OncePerRequestFilter {

	private JsonWebTokenProvider jwtProvider;
	
	public JsonWebTokenAuthenticationFilter(JsonWebTokenProvider jwtProvider) {
		this.jwtProvider = jwtProvider;
	}
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, 
									HttpServletResponse response, 
									FilterChain filterChain)
			throws ServletException, IOException {
		
		
		System.out.println("JsonWebTokenAuthenticationFilter 동작됨.");
		System.out.println("Request 분석 코드.");
		
		// 인증이 필요한 부분에 JWT 인증을 수행시킨다.
		// Request header로 전달된 Authorization 값을 읽어온다.
		String jsonWebToken = request.getHeader("Authorization"); 
		
		if(jsonWebToken == null || jsonWebToken.length() ==0) {
			ApiResponse apiResponse = new ApiResponse(403,null);
			apiResponse.addError("authoization", "인증이 필요합니다.");
			
			Gson gson = new Gson();
			String authorizationError = gson.toJson(apiResponse);
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().append(authorizationError).flush();
			return;
		}
		
		// TODO Exception Handling.
		MembersVO memberVO = jwtProvider.extractMembersVOFromJsonWebToken(jsonWebToken);
		SecurityUser user = new SecurityUser(memberVO);
		
		// 일회성 인증정보 생성.
		Authentication oneTimeAuthentication = 
				new UsernamePasswordAuthenticationToken(memberVO, null, user.getAuthorities());
		
		// SecurityContext에 적재. (Response가 되는 순간 인증정보는 사라진다.)
		SecurityContextHolder.getContext().setAuthentication(oneTimeAuthentication);
		
		// 현재 필터 이후의 필터들을 수행시킨다.
		filterChain.doFilter(request, response);
		
		System.out.println("Response 분석 코드.");
	}

}
