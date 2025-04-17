<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>    
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>러뉴얼 회원가입</title>
    <link rel="stylesheet" href="/css/common.css" type="text/css" />
  </head>

  <body>
    <div class="wrapper">
      <jsp:include page="/WEB-INF/views/common/component/learnualheader.jsp" />

      <div class="regist-main">
        <div class="regist-section1">
          <div class="text-area">
            <div class="text-title">
              <p>모두를 위한 학습 관리 플랫폼</p>
              <p>러뉴얼을 찾아주셔서 감사합니다.</p>
            </div>
            <div class="text-sub">
              <p>수강생과 강사, 플랫폼 관리자 모두를 위한 지침서</p>
              <p>Learn-you-all, Learn-manual</p>
            </div>
          </div>
          <div class="img-area">visual-image</div>
        </div>

        <div class="regist-student-section">
          <h2>회원가입 양식</h2>
          <form action="regist-student-form">
            <div class="email-area">
              <label for="email">이메일</label>
              <input id="email" name="email" type="email" required />
            </div>
            <div class="password-area">
              <label for="password">비밀번호</label>
              <input id="password" name="password" type="password" required />
            </div>
            <div class="confirm-password-area">
              <label for="password">비밀번호 확인</label>
              <input
                id="confirm-password"
                name="confirm-password"
                required="password"
              />
            </div>
            <div class="address-area">
              <label for="address">주소</label>
              <input id="address" name="address" type="text" />
            </div>
            <div class="phone-area">
              <label for="phone">전화번호</label>
              <input id="phone" name="phone" type="text" />
            </div>

            <button class="btn2" type="button">회원가입</button>
          </form>
        </div>
      </div>

      <jsp:include page="/WEB-INF/views/common/component/learnualfooter.jsp" />
    </div>
  </body>
</html>
