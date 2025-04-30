package com.hello.security.handler;

import java.io.IOException;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import com.hello.member.dao.MemberDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginFailureHandler implements AuthenticationFailureHandler {

	private MemberDao memberDao;
	
	public LoginFailureHandler(MemberDao memberDao) {
		this.memberDao= memberDao;
	}

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {
		
		//1. 요청 정보에서 로그인 아이디(이메일)을 가져온다.
		String email = request.getParameter("email");
		
		
		//- 로그인 실패 정보를 데이터 베이스에 기록한다. (BadCredentialException 일때만)
		// 아이디는 맞는데 비밀번호가 틀렸을 경우
		if(exception instanceof BadCredentialsException) {
			this.memberDao.updateLoginFailCount(email);
			this.memberDao.updateBlock(email);
		}
		
		//2. error 메세지를 가져온다.
			String errorMessage = exception.getMessage();
		
		//3. 로그인 페이지를 보여줄 준비를 한다.
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/member/memberlogin.jsp");
			
		
		//4. 로그인 페이지에 보내줄 에러 메세지를 넣어준다 (Model 느낌으로~)
			request.setAttribute("errorMessage", errorMessage);
			request.setAttribute("email", email);
			request.setAttribute("nextUrl", request.getParameter("nextUrl"));
		
		//5. 로그인 페이지를 보여준다.
			rd.forward(request, response);
	}
}
