package com.hello.common.util;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.hello.member.vo.MembersVO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public abstract class AuthUtil {

	private AuthUtil() {}
	
	public static MembersVO getMember() {
		SecurityContext securityContext = SecurityContextHolder.getContext();
		Authentication authentication = securityContext.getAuthentication();
		MembersVO memberVO = (MembersVO) authentication.getPrincipal();
		return memberVO;
	}
	
	public static String getEmail() {
		MembersVO memberVO = (MembersVO) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return memberVO.getEmail();
	}
	
	public static HttpServletRequest getRequest() {
		ServletRequestAttributes servletRequestAttribute = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		return servletRequestAttribute.getRequest();
	}
	
	public static HttpServletResponse getResponse() {
		ServletRequestAttributes servletRequestAttribute = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		return servletRequestAttribute.getResponse();
	}
	
	public static void logout() {
		LogoutHandler logoutHandler = new SecurityContextLogoutHandler();
		logoutHandler.logout(getRequest(), getResponse(), SecurityContextHolder.getContext().getAuthentication());
	}
	
}
