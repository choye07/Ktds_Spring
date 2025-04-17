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

		<div class="home-main">
			<div class="visual">main visual</div>

			<div class="contents">

				<div class="learnual-notice board">
					<div class="board-header">
						<h1>러뉴얼 공지사항 작성하기</h1>
					</div>
					<form id="learnual-notice-form">
						<div class="author-area form-group">
							<label for="author">작성자</label> <input type="text" id="author"
								name="author" required />
						</div>
						<div class="ntcTtl-area form-group">
							<label for="ntcTtl">제목</label> <input type="text" id="ntcTtl"
								name="ntcTtl" required />
						</div>
						<div class="ntcCtt-area form-group">
							<label for="ntcCtt">내용</label>
							<textarea id="ntcCtt" name="ntcCtt" rows="5" required></textarea>
						</div>
						<div class="btn-area">
							<button type="button" class="btn-list btn"
								onclick='location.href="/ntc/list"'>목록 보기</button>
							<button type="button" class="btn-submit btn">작성 완료</button>
						</div>
					</form>
				</div>

			</div>

		</div>

		<jsp:include page="/WEB-INF/views/common/component/learnualfooter.jsp" />
	</div>

</body>

</html>