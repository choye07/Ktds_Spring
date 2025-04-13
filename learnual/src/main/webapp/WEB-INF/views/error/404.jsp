<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<jsp:include page="/WEB-INF/views/layout/header.jsp" />
<h1>Page Not Found!</h1>
<c:if test="${not empty cause }">
	<h3>${cause}</h3>
</c:if>
<jsp:include page="/WEB-INF/views/layout/footer.jsp" />