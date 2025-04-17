<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>러뉴얼 홈</title>
<link rel="stylesheet" href="/css/common.css" type="text/css" />
<script src="/js/jquery-3.7.1.min.js" type="text/javascript"></script>
<script src="/js/common.js" type="text/javascript"></script>
</head>

<body>
	<div class="wrapper">
		<jsp:include page="/WEB-INF/views/common/component/learnualheader.jsp" />

		<div class="super-main">
			<div class="super-main-header">
				<h1>러뉴얼 관리자 기능 바로가기</h1>
			</div>
			<div class="super-main-wrapper">
				<div class="super-fn-area">
					<div class="academy-manage-area">
						<a class="btn-academy-manage btn" href="#">
							<div class="icon-img">image</div>
							<h2>학원 관리</h2>
						</a>
					</div>
					<div class="academy-manager-manage-area">
						<a class="btn-academy-manager-manage btn" href="#">
							<div class="icon-img">image</div>
							<h2>학원 관리자 관리</h2>
						</a>
					</div>
					<div class="menu-manage-area">
						<a class="btn-menu-manage btn" href="#">
							<div class="icon-img">image</div>
							<h2>메뉴 관리</h2>
						</a>
					</div>
					<div class="notice-area">
						<a class="btn-notice btn" href="#">
							<div class="icon-img">image</div>
							<h2>러뉴얼 공지사항</h2>
						</a>
					</div>
				</div>
			</div>
		</div>

		<jsp:include page="/WEB-INF/views/common/component/learnualfooter.jsp" />
	</div>

</body>
</html>
