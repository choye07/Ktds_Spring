<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
    <link rel="stylesheet" href="/common.css" type="text/css" />
    <script src="/jquery-3.7.1.min.js" type="text/javascript"></script>
    <script src="/common.js" type="text/javascript"></script>
  </head>
  <body>
    <h1>게시글 작성</h1>
    <!--enctype="application/x-www-form-urlencoded" 기본 값-->
    <form class="write-form" enctype="multipart/form-data">
      <!--없으면 파일 전송 불가능-->
      <div class="grid">
        <label for="subject">제목</label>
        <input type="text" id="subject" name="subject" required />
        <label for="email">이메일</label>
        <input type="email" id="email" name="email" required />
        <label for="file">첨부파일</label>
        <div>
          <input type="file" id="file1" name="file" />
          <input type="file" id="file2" name="file" />
          <input type="file" id="file3" name="file" />
        </div>
        <label for="content">내용</label>
        <textarea name="content" id="content" required></textarea>
        <div class="btn-group">
          <div class="right-align">
            <button type="submit" class="write-save">저장</button>
          </div>
        </div>
      </div>
    </form>
  </body>
</html>
