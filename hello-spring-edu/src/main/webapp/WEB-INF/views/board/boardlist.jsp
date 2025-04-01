<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
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
    <link rel="stylesheet" href="/common.css" type="text/css" />
  </head>
  <body>
    <h1>게시글 목록</h1>
    <p>게시글 수: ${boardList.boardCnt}</p>
    <p>조회한 게시글의 수: ${boardList.boardList.size()}</p>
    <a href="/board/boardwrite">게시글 등록하기</a>
  </body>
</html>
