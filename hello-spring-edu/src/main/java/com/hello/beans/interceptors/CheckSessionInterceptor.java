package com.hello.beans.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;

import com.hello.member.vo.MembersVO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class CheckSessionInterceptor implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		//Session의 여부를 확인한다.
		HttpSession session =request.getSession();
		MembersVO memberVO = (MembersVO)session.getAttribute("__LOGIN_USER__");
		
		//Session이 없다면, 로그인 페이지를 노출시킨다.
		//동시에 컨트롤러 실행은 못하게 한다.
		if(memberVO == null) {
			
			//TODO ajax cll일 떄는 "Accesss Denied" 메시지를 브라우저에게 보내도록 하기!
			//뷰 리졸버가 없어서 직접 path를 지정해줘야한다.
			String path = "/WEB-INF/views/member/memberlogin.jsp";
			RequestDispatcher requestDispatcher = request.getRequestDispatcher(path);
			
			// 페이지 보여주기
			//forward: URL은 변경되지 않지만, 화면은 바뀌는 응답 형태
			//Spring version : forward:/member/login
			requestDispatcher.forward(request, response);
			return false;
		}
		
		//true => controller 실행 아니면 실행 ㄴㄴ
		return true;
	}

}
