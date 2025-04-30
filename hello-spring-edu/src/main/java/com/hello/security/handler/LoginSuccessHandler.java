package com.hello.security.handler;

import java.io.IOException;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.hello.member.dao.MemberDao;
import com.hello.member.vo.MembersVO;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginSuccessHandler implements AuthenticationSuccessHandler {
	
	private MemberDao memberDao;
	
	public LoginSuccessHandler(MemberDao memberDao ) {
		this.memberDao = memberDao;
	}

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		// 인증정보 (authentication: UsernamePasswordAhthenticationToken에서 사용자 아이디(이메일)을 가여온다.
			MembersVO memberVO = (MembersVO) authentication.getPrincipal();
			String authenticateEmail = memberVO.getEmail();
			
		// 데이터베이스에 인증 성공 기록을 남긴다.
			this.memberDao.updateLoginSuccess(authenticateEmail);
		// nextUrl(파라미터)이 있을 경우 해당 경로로 이동시킨다.
			String nextUrl =request.getParameter("nextUrl");
			if(nextUrl !=null && nextUrl.length()>0) {
				if(nextUrl.equals("/member/do-login")) {
					nextUrl="/board/list";
				}
				response.sendRedirect(nextUrl);
				return;
			}
			
		// nextUrl이 없을 경우 /board/list로 이동시킨다.
			response.sendRedirect("/board/list");
		
	}

}
