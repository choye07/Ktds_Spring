package com.hello.beans.interceptors;

import java.io.PrintWriter;

import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.HandlerInterceptor;

import com.google.gson.Gson;
import com.hello.common.vo.AjaxResponse;
import com.hello.member.vo.MembersVO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class CheckSessionInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		// Session의 여부를 확인한다.
		HttpSession session = request.getSession();
		MembersVO memberVO = (MembersVO) session.getAttribute("__LOGIN_USER__");

		// Session이 없다면, 로그인 페이지를 노출시킨다.
		// 동시에 컨트롤러 실행은 못하게 한다.
		if (memberVO == null) {

			// TODO ajax cll일 떄는 "Accesss Denied" 메시지를 브라우저에게 보내도록 하기!
			// 현직 개발자들에게도 골치 아픈 문제
			// 골치가 안 아프려면
			// Full Ajax로 만들거나
			// Full Template으로 만들거나
			// Template + Ajax를 동시에 사용할 때 처리하는 기준 자체가 모호하다.
			// URL에 Ajax 티를 낸다.
			// /reply/59 ==> /ajax/reply/59

			// 사용자가 요청한 URL에서 Path만 가져온다.
			String requestPath = request.getRequestURI();
			if (requestPath.startsWith("/ajax")) {
				AjaxResponse ajaxResponse = new AjaxResponse(HttpStatus.UNAUTHORIZED.value(), "Access Denied");

				// ajaxResponse를 JSON으로 변환해야한다.
				// 객체 -> JSON, JSON-> 객체 변환시키는 유틸리티를 Google에서 만들어서 배포하는 중이다!
				// GSON Library

				Gson gson = new Gson();
				String json = gson.toJson(ajaxResponse);

				// json 데이터를 브라우저(클라이언트)에게 보내준다.
				response.setContentType("application/json");
				response.setContentLength(json.length());
				PrintWriter printWriter = response.getWriter();
				printWriter.append(json);
				printWriter.flush();
				return false;

			}
			// 뷰 리졸버가 없어서 직접 path를 지정해줘야한다.
			String path = "/WEB-INF/views/member/memberlogin.jsp";
			RequestDispatcher requestDispatcher = request.getRequestDispatcher(path);

			// 페이지 보여주기
			// forward: URL은 변경되지 않지만, 화면은 바뀌는 응답 형태
			// Spring version : forward:/member/login
			requestDispatcher.forward(request, response);
			return false;
		}

		// true => controller 실행 아니면 실행 ㄴㄴ
		return true;
	}

}
