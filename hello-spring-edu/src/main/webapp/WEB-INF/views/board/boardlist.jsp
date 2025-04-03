<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- Directive 안에 page가 있으면 page deirective 이다.-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- core, fmt가 제일 많이쓴다 fmt -> formatting -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Insert title here</title>
<!-- 
    이 페이지의 endpoint https://localhost:8080/board/list
    http:// <-- protocol
    :8080 <-- port
    /board/list <--path
    ?n=n <-- query strting parameter

    hppt://localhost:8080 <--host
    host가 같아서 앞에는 생략할 수 있다.
    -->
<link rel="stylesheet" href="/css/common.css" type="text/css" />
</head>
<body>
	<div class="right-align">총 ${boardList.boardCnt}건의 게시글이 검색되었습니다.</div>
	<table class="grid">
		<colgroup>
			<col width="80">
			<col>
			<col width="250">
			<col width="80">
			<col width="120">
			<col width="120">
		</colgroup>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>이메일</th>
				<th>조회수</th>
				<th>등록일</th>
				<th>수정일</th>
			</tr>
		</thead>
		<tbody>
			<c:choose>
				<c:when test="${not empty boardList.boardList}">
					<c:forEach items="${boardList.boardList}" var="board">
						<tr>
							<td class="center-align">${board.id}</td>
							<td><a href="/board/view/${board.id}">${board.subject}</a></td>
							<td>${board.email}</td>
							<td class="center-align">${board.viewCnt}</td>
							<td class="center-align">${board.crtDt}</td>
							<td class="center-align">${board.mdfyDt}</td>
						</tr>
					</c:forEach>
				</c:when>
				<c:otherwise>
					<tr class="empty">
						<td colspan="6">게시글이 비어있습니다. 첫 게시글의 주인공이 되어보세요!</td>
					</tr>
				</c:otherwise>
			</c:choose>
		</tbody>
	</table>
	<a href="/board/boardwrite">게시글 등록하기</a>
</body>
</html>
