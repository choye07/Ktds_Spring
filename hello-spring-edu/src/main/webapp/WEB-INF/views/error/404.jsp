<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="/WEB-INF/views/member/loginstatus.jsp" />
	<h1>Page Not Found!</h1>
	<c:if test="${not empty cause }">
    <h3>${cause}</h3>
	</c:if>
</body>
</html>