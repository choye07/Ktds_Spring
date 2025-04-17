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
  <title>강좌 개설(관리자)</title>
</head>

<body>
  <div class="course-create">
    <h1>강의 추가</h1>
    <form id="course-create-form">
      <div class="title-area form-group">
        <label for="course-title">강의제목</label>
        <input type="text" id="course-title" name="course-title" required />
      </div>

      <div class="classroom-area form-group">
        <label for="course-classroom">강의실</label>
        <input type="text" id="course-classroom" name="course-classroom" required />
      </div>

      <div class="subject-area form-group">
        <label for="course-subject">과목</label>
        <select id="course-subject" multiple>
          <option value="과목1">과목1</option>
          <option value="과목2">과목2</option>
          <option value="과목3">과목3</option>
        </select>
      </div>

      <div id="selected-subject-box"></div>
      <input type="hidden" name="course-subjects" id="selected-subjects-input" />

      <div class="course-startDate-area form-group">
        <label for="course-startDate">강의시작일</label>
        <input type="datetime-local" id="course-startDate" name="course-startDate" required />
      </div>

      <div class="course-endDate-area form-group">
        <label for="course-endDate">강좌종료일</label>
        <input type="datetime-local" id="course-endDate" name="course-endDate" required />
      </div>

      <div class="course-registStart-area form-group">
        <label for="course-registStart">신청시작일</label>
        <input type="datetime-local" id="course-registStart" name="course-registStart" required />
      </div>

      <div class="course-registEnd-area form-group">
        <label for="course-registEnd">신청종료일</label>
        <input type="datetime-local" id="course-registEnd" name="course-registEnd" required />
      </div>

      <div class="btn-area">
        <button type="submit">등록</button>
      </div>
    </form>
  </div>
</body>

</html>