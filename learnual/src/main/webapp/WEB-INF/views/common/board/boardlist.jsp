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
  <title>board-list</title>
</head>

<body>
  <div class="learnual-notice board">
    <div class="board-header">
      <h1>러뉴얼 공지사항</h1>
      <div class="board-toolbox">
        <div class="board-user-toolbox">
          <div class="btn-add-notice">
            <a href="#">게시글 작성 +</a>
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
        <div>No</div>
        <div>제목</div>
        <div>작성자</div>
        <div>작성시간</div>
      </div>
      <ul class="board-list-wrapper">
        <li class="fix">
          <a href="#">
            <div class="board-list-no">6</div>
            <div class="board-list-title">러뉴얼 서비스 오픈 기념 할인 행사!</div>
            <div class="board-list-writer">홍길동</div>
            <div class="board-list-time">2025.03.29</div>
          </a>
        </li>
        <li>
          <a href="#">
            <div class="board-list-no">5</div>
            <div class="board-list-title">공지사항2</div>
            <div class="board-list-writer">이소희</div>
            <div class="board-list-time">2025.03.27</div>
          </a>
        </li>
        <li>
          <a href="#">
            <div class="board-list-no">4</div>
            <div class="board-list-title">공지사항1</div>
            <div class="board-list-writer">최예진</div>
            <div class="board-list-time">2025.03.25</div>
          </a>
        </li>
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
        </select>
        <input class="search-input" type="text" />
        <button type="button" class="btn-search">검색</button>
      </div>
    </div>

  </div>
</body>

</html>