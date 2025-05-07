<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="sec"	uri="http://www.springframework.org/security/tags"%>
<link rel="stylesheet" href="/css/common.css" type="text/css" />
<div class="login-status-wrapper">
	<ul>

		<sec:authorize access="!isAuthenticated()">
			<li><a href="/member/regist">회원가입</a></li>
			<li><a href="/member/login">로그인</a></li>
		</sec:authorize>
		<sec:authorize access="isAuthenticated()">
		<sec:authentication property="principal.email" var="authenticatedEmail"/>
		<sec:authentication property="principal.role" var="role"/>
			<li class="authenticated" data-email="${authenticatedEmail}" data-role="${role}"><a href="/member/mypage"><sec:authentication property="principal.name"/> </a>
				(<sec:authentication property="principal.email"/>)</li>
			<li><a href="/member/do-logout">로그아웃</a></li>
		</sec:authorize>

	</ul>
</div>