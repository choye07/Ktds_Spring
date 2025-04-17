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
</head>

<body>
	<div class="wrapper">
		<jsp:include page="/WEB-INF/views/common/component/learnualheader.jsp" />

		<div class="home-main">
			<div class="visual">main visual</div>

			<div class="contents">
				<div class="notice article">
					<div>
						<h2>러뉴얼 공지사항</h2>
						<a href="#">더보기</a>
					</div>

					<div>
						<ul class="article-content">
							<li><a href="#">
									<h3>러뉴얼 서비스 오픈 기념 할인 행사!</h3> <span>2025.03.29 홍길동</span>
							</a></li>

							<li><a href="#">
									<h3>기능 개발자 채용 공고</h3> <span>2025.03.29 홍길동</span>
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

				<div class="search">
					<!-- 로그인하지 않을 경우 보이는 div / search 비활성 -->
					<div class="search-inactive">
						<p>학원 또는 강좌명 검색은 로그인이 필요합니다.</p>
						<div class="btn-area">
							<a href="/login">
								<div class="login-overlay">login-overlay</div> <span>러뉴얼
									로그인</span>
							</a> <a href="/regist/agreement">
								<div class="login-overlay">login-overlay</div> <span>회원
									가입</span>
							</a>
						</div>
					</div>
					<!-- 로그인했을 경우 보이는 div / search 활성 -->
					<div class="search-active">
						<ul class="search-tab">
							<li class="search-tab-academy on"><a href="#">학원명 검색</a></li>
							<li class="search-tab-lecture"><a href="#">강좌명 검색</a></li>
						</ul>
						<div class="search-area academy">
							<form id="search-academy-form" class="search-form" action="#">
								<div class="search-input-area">
									<label for="search-academy">학원명 검색 입력란</label> <input
										id="search-academy" type="text" placeholder="학원명을 입력하세요" />
								</div>
								<div class="search-button-area">
									<button type="button btn3">검색</button>
								</div>
							</form>
						</div>

						<ul class="search-academy-list-wrapper list-wrapper">
							<li><a href="#">
									<p>(채용예정자 전형) 풀스택 양성과정</p> <span>(주)그린 컴퓨터 아카데미</span> <span>서울시
										동작구 연남동</span>
							</a></li>
							<li><a href="#">
									<p>(재직자 전형)AZURE 보안 전문가 과정</p> <span>(주)그린 컴퓨터 아카데미</span> <span>서울시
										동작구 연남동</span>
							</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>

		<jsp:include page="/WEB-INF/views/common/component/learnualfooter.jsp" />
	</div>

</body>
</html>
