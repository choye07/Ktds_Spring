<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Insert title here</title>
<link rel="stylesheet" href="/common.css" type="text/css" />
</head>
<body>
	<jsp:include page="/WEB-INF/views/member/loginstatus.jsp"></jsp:include>
	<h1>게시글 조회</h1>
	<div class="detail-wrapper">
		<div class="grid">
			<label>제목</label>
			<div>${BoardVO.subject}</div>
			<label>이름</label>
			<div>${BoardVO.memberVO.name}</div>
			<label>첨부파일</label>
			<div>
				<a href="/file/${BoardVO.id}/${BoardVO.fileList[0].flId}">${BoardVO.fileList[0].flNm}</a>
			</div>
			<label>조회수</label>
			<div>${BoardVO.viewCnt}</div>
			<label>등록일</label>
			<div>${BoardVO.crtDt}</div>
			<label>수정일</label>
			<div>${BoardVO.mdfyDt}</div>
			<label>내용</label>
			<div>${BoardVO.content}</div>
			<c:if test="${not empty sessionScope.__LOGIN_USER__ and BoardVO.email==sessionScope.__LOGIN_USER__.email}">
				<div class="right-align">
					<a href="/board/modify/${BoardVO.id}">수정</a> 
					<a href="/board/delete/${BoardVO.id}">삭제</a>
				</div>
			</c:if>
		</div>
	</div>
</body>
</html>
