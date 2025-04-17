<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <link rel="stylesheet" href="/css/common.css" type="text/css" />
  <script src="/js/jquery-3.7.1.min.js" type="text/javascript"></script>
  <script src="/js/common.js" type="text/javascript"></script>
  <title>board-view</title>
</head>

<body>
  <div class="learnual-notice board">
    <div class="board-header">
      <h1>러뉴얼 공지사항</h1>
      <div class="board-toolbox">
        <div class="board-user-toolbox">
          <div class="btn-go-list">
            <a href="#">목록 보기</a>
          </div>
          <div class="btn-add">
            <a href="#">게시글 작성 +</a>
          </div>
          <div class="btn-modify">
            <a href="#">게시글 수정</a>
          </div>
          <div class="btn-delete">
            <a href="#">게시글 삭제</a>
          </div>
        </div>
        <div class="board-manager-toolbox">
          <div class="btn-add-notice">
            <a href="#">공지글 작성 +</a>
          </div>
        </div>
      </div>
    </div>

    <div class="board-body">
      <div class="board-list-top">
      </div>
      <div class="board-wrapper">
        <div class="board-info">
          <label>작성자</label>
          <div>홍길동</div>
          <label>작성시간</label>
          <div>2025-04-16</div>
          <label>이메일</label>
          <div>asdf@naver.com</div>
          <label>조회수</label>
          <div>10</div>
        </div>
        <div class="board-content">
          <label>내용</label>
          <div class="board-content-text">
            가나다라마바사
          </div>
        </div>
      </div>
    </div>
  </div>
</body>

</html>