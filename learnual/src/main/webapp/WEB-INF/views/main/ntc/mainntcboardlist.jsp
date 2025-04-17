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

				<div class="learnual-notice board">
					<div class="board-header">
						<h1>러뉴얼 공지사항</h1>
						<div class="board-toolbox">
							<div class="board-user-toolbox">
								<div class="btn-goMain">
									<a href="/">홈으로</a>
								</div>
							</div>
							<div class="board-manager-toolbox">
								<div class="btn-add-notice">
									<a href="/ntc/write">공지글 작성 +</a>
								</div>
							</div>
						</div>
					</div>

					<p>
						공지사항 등록: 총 <span>${mainNtcList.ntcCnt}</span>건
					</p>
					<div class="board-body">
						<div class="board-list-top">
							<div>No</div>
							<div>제목</div>
							<div>작성자</div>
							<div>작성시간</div>
						</div>
						<ul class="board-list-wrapper">
							<c:choose>
								<c:when test="${not empty mainNtcList.ntcList}">
									<c:forEach items="${mainNtcList.ntcList}" var="mainNtc">
										<li class="fix"><a href="#">
												<div class="board-list-no">${mainNtc.ntcId}</div>
												<div class="board-list-title">${mainNtc.ntcTtl}</div>
												<div class="board-list-writer">작성자이름</div>
												<div class="board-list-time">${mainNtc.ntcRgstDt}</div>
										</a></li>
									</c:forEach>
								</c:when>
								<c:otherwise>
									<li class="fix"><a href="#">
											<p>작성된 공지사항이 없습니다.</p>
									</a></li>
								</c:otherwise>
							</c:choose>
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

						<div class="search-area">
							<select name="search-option" id="search-option">
								<option value="title">제목</option>
								<option value="content">내용</option>
								<option value="writer">작성자</option>
							</select> <input class="search-input" type="text" />
							<button type="button" class="btn-search">검색</button>
						</div>
					</div>

				</div>
			</div>
		</div>

		<jsp:include page="/WEB-INF/views/common/component/learnualfooter.jsp" />
	</div>

</body>

</html>