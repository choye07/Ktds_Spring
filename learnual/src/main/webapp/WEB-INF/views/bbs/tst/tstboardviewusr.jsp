<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="/css/common.css" type="text/css" />
<script src="/js/jquery-3.7.1.min.js" type="text/javascript"></script>
<script src="/js/common.js" type="text/javascript"></script>
<title>exam-board-view(회원)</title>
</head>

<body>
	<div class="exam-list board student">
		<div class="board-header">
			<h1>시험 게시판</h1>
			<div class="board-toolbox">
				<!-- 학습관리자(강사)에게만 노출되는 박스 -->
				<div style="display: none" class="board-tutor-toolbox">
					<div class="btn-add-exam">
						<a href="#">시험 제출 +</a>
					</div>
				</div>
			</div>
		</div>

		<div class="board-body">
			<div class="board-list-top">
				<div>시험 내용</div>
				<div>정규 시험 날짜</div>
				<div>강사명</div>
				<div>작성 시간</div>
			</div>
			<!-- 시험 목록 -->
			<ul class="board-list-wrapper">
				<li><a href="#">
						<div class="board-list-title">자바 기초 시험</div>
						<div class="board-list-submitTime">2025.03.29</div>
						<div class="board-list-writer">박성연</div>
						<div class="board-list-time">2025.03.26</div>
				</a></li>
				<li><a href="#">
						<div class="board-list-title">1차 종합 시험 (25기 풀스택 전문가 양성 과정)</div>
						<div class="board-list-submitTime">2025.04.11</div>
						<div class="board-list-writer">장민창</div>
						<div class="board-list-time">2025.04.10</div>
				</a></li>
			</ul>

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
</body>

</html>