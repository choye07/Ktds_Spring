<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="/css/common.css" type="text/css" />
<script src="/js/jquery-3.7.1.min.js" type="text/javascript"></script>
<script src="/js/common.js" type="text/javascript"></script>
</head>
<body>
<jsp:include page="/WEB-INF/views/member/loginstatus.jsp"></jsp:include>
	<h1>Login</h1>
       <form:form class="login-form" modelAttribute="memberLoginRequestVO">
               <input type="hidden" class="next-url" name="nextUrl"/>
           <div>
               <label for="email">이메일</label>
               <input type="email" 
                      name="email" 
                      id="email" 
                      value="${userInput.email}"/>
               <form:errors path="email" element="div" cssClass="error" />
           </div>
           <div>
               <label for="password">비밀번호</label>
               <input type="password" name="password" id="password" />
               <form:errors path="password" element="div" cssClass="error" />
           </div>
           
           <c:if test="${not empty errorMessage}">
               <div class="error">
                   ${errorMessage}
               </div>
           </c:if>
           <button type="submit" class="login-button">로그인</button>
       </form:form>
</body>
</html>