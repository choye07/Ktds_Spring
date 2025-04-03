<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member Regist</title>
<link rel="stylesheet" href="/css/common.css" type="text/css" />
<script src="/js/jquery-3.7.1.min.js" type="text/javascript"></script>
<script src="/js/common.js" type="text/javascript"></script>
</head>
<body>
	<div class="member-regist-wrapper">
		<h1>회원가입</h1>
		<form:form modelAttribute="memberRegistRequestVO"
			class="member-regist-form">
			<div class="grid">
				<label for="email">이메일</label>
				<div>
                <input type="email" id="email" name="email"
                  required />
                <form:errors path="email" element="div" cssClass="error" />
            </div>
				<label for="name">이름</label>
				<div>
					<input type="text" name="name" id="name" required />
					<form:errors path="name" element="div" cssClass="error"></form:errors>
				</div>
				<label for="password">비밀번호</label>
				<div>
					<input type="password" name="password" id="password" required />
					<form:errors path="password" element="div" cssClass="error"></form:errors>
				</div>
				<label for="confirmPassword">비밀번호 재입력</label>
				<div>
					<input type="password" name="confirmPassword" id="confirmPassword"
						required />
					<form:errors path="confirmPassword" element="div" cssClass="error"></form:errors>
				</div>
				<div class="btn-group">
					<div class="right-align">
						<button type="submit" class="regist-button">등록</button>
						<button type="button" class="cancel-button">취소(뒤로가기)</button>
					</div>
				</div>
			</div>
		</form:form>
	</div>
</body>
</html>