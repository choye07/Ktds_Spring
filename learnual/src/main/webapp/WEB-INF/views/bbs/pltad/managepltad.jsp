<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>플랫폼 관리자 관리</title>
<link rel="stylesheet" href="/css/common.css" type="text/css" />
<script src="/js/jquery-3.7.1.min.js" type="text/javascript"></script>
<script src="/js/common.js" type="text/javascript"></script>
</head>

<body>
	<div class="wrapper">
		<jsp:include page="/WEB-INF/views/common/component/learnualheader.jsp" />

		<div class="managepltad-main manage-board">
			<div class="manage-board-wrapper">
				<div class="manage-board-header">
					<h1>플랫폼 관리자 관리</h1>
				</div>
				<div class="board-toolbox">
					<div class="board-toolbox-left">
						<div class="btn-select">
							<a href="#">선택</a>
						</div>
						<div class="btn-delete">
							<a href="#">삭제</a>
						</div>
					</div>
					<div class="board-toolbox-right">
						<div class="btn-add">
							<a href="#">추가</a>
						</div>
					</div>
				</div>

				<div class="manage-board-body">
					<div class="list-top">
						<div>아이디</div>
						<div>비밀번호</div>
						<div>이름</div>
						<div>권한</div>
					</div>
					<!-- 플랫폼 관리자 리스트 뿌리는 영역 -->
					<ul class="list-wrapper">
						<li><a href="#">
								<div class="item-data1">Kim@gmail.com</div>
								<div class="item-data2">********</div>
								<div class="item-data3">김대표</div>
								<div class="item-data4">플랫폼관리자-기관대표</div>
						</a></li>
						<li><a href="#">
								<div class="item-data1">Song@naver.com</div>
								<div class="item-data2">********</div>
								<div class="item-data3">송담당자</div>
								<div class="item-data4">플랫폼관리자-강좌담당</div>
						</a></li>
					</ul>
					<!-- 페이지네이션 -->
					<ul class="pagination">
						<li><a href="#">이전</a></li>
						<li><a href="#">1</a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">4</a></li>
						<li><a href="#">5</a></li>
						<li><a href="#">다음</a></li>
					</ul>
				</div>
			</div>
		</div>

		<jsp:include page="/WEB-INF/views/common/component/learnualfooter.jsp" />
	</div>

</body>
</html>
