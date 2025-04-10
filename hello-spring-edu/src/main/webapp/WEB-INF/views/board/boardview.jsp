<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/views/layout/header.jsp" />
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
			<c:if
				test="${not empty sessionScope.__LOGIN_USER__ and BoardVO.email==sessionScope.__LOGIN_USER__.email}">
				<div class="right-align">
					<a href="/board/modify/${BoardVO.id}">수정</a> <a
						href="/board/delete/${BoardVO.id}">삭제</a>
				</div>
			</c:if>
		</div>
	</div>
	<ul class="reply-list-wrapper" data-id="${BoardVO.id}">

	</ul>
	<div class="reply-writer-wrapper" data-id="${BoardVO.id}" data-endpoint="" data-reply-id="">
		<textarea class="reply-content" placeholder="댓글을 입력해보세요!"></textarea>
		<button class="reply-write-button" type="button">등록</button>
	</div>
	<template class="reply-item-template">
	       <li>
            <div class="reply-item-writer">
                <span></span>
                <span></span>
                <span></span>
                </div>
                <div class="reply-item-content"></div>
                <div class="reply-item-actions">
                    <span class="reply-item-modify">수정</span> 
                    <span  class="reply-item-delete">삭제</span> 
                    <span  class="reply-item-recommend">추천</span>
                    <span class="reply-item-recommend-count"></span>
                    <span  class="reply-item-write">답글 달기</span>
                </div>
        </li>
	</template>
<jsp:include page="/WEB-INF/views/layout/footer.jsp" />