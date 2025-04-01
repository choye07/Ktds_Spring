<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
    <link rel="stylesheet" href="/common.css" type="text/css" />
  </head>
  <body>
    <h1>게시글 조회</h1>
    <div class="detail-wrapper">
      <div class="grid">
        <label>제목</label>
        <div>${BoardVO.subject}</div>
        <label>이메일</label>
        <div>${BoardVO.email}</div>
        <label>조회수</label>
        <div>${BoardVO.viewCnt}</div>
        <label>등록일</label>
        <div>${BoardVO.crtDt}</div>
        <label>수정일</label>
        <div>${BoardVO.mdfyDt}</div>
        <label>내용</label>
        <div>${BoardVO.content}</div>
        <div class="right-align">
          <a href="/board/modify/${boardVO.id}">수정</a>
          <a href="/board/delete/${boardVO.id}">삭제</a>
        </div>
      </div>
    </div>
  </body>
</html>
