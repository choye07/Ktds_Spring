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
<title>exam-board-view(학습관리자)</title>
</head>

<body>
	<div class="exam-view board tutor">
		<div class="board-header">
			<h1>시험 게시판</h1>
			<div class="board-toolbox">
				<div class="board-tutor-toolbox">
					<div class="btn-go-list">
						<a href="#">목록 보기</a>
					</div>
					<div class="btn-modify">
						<a href="#">시험 수정</a>
					</div>
					<div class="btn-confirm">
						<a href="#">시험 확정</a>
					</div>
					<div class="btn-delete">
						<a href="#">시험 삭제</a>
					</div>
				</div>
			</div>
		</div>

		<div class="board-body">
			<div class="board-wrapper">
				<div class="board-info">
					<label>시험명</label>
					<div class="board-list-title">자바 기초 시험</div>
					<label>정규 시험 날짜</label>
					<div class="board-list-submitTime">2025.03.29</div>
					<label>강사명</label>
					<div class="board-list-writer">박성연</div>
					<label>조회수</label>
					<div class="board-list-time">2025.03.26</div>
					<div class="exam-url-area">
						<div class="response-url-area">
							<label>응답 URL</label>
							<div class="input-box response-url">
								<input class="response-url-input" type="text"
									value="http://google.com/forms/응답URL">
								<button class="btn-edit">수정</button>
								<button class="btn-save">저장</button>
							</div>
						</div>
						<!-- 제출 URL div는 강사만 노출 -->
						<div class="edit-url-area">
							<label>편집 URL</label>
							<div class="input-box edit-url">
								<input class="edit-url-input" type="text"
									value="http://google.com/forms/제출URL">
								<button class="btn-edit">수정</button>
								<button class="btn-save">저장</button>
							</div>
						</div>
					</div>

				</div>
				<div class="board-content">
					<h2>시험 응시자 명단</h2>
					<!-- 시험 응시 학생 명단 header -->
					<div class="exam-usr-header">
						<div>학생명</div>
						<div>이메일</div>
						<div>시험 제출 시간</div>
						<div>시험 수정 시간</div>
						<div>시험 제출 여부</div>
					</div>
					<!-- 시험 응시 학생 명단 list 묶음 -->
					<ul class="exam-usr-wrapper">
						<li class="exam-usr-list">
							<div>홍길동</div>
							<div>asdf@naver.com</div>
							<div>2025.03.29</div>
							<div></div>
							<div>Y</div>
						</li>
						<li class="exam-usr-list">
							<div>홍길동</div>
							<div>asdf@naver.com</div>
							<div>2025.03.29</div>
							<div></div>
							<div>Y</div>
						</li>
						<li class="exam-usr-list">
							<div>홍길동</div>
							<div>asdf@naver.com</div>
							<div>2025.03.29</div>
							<div></div>
							<div>Y</div>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</body>

</html>