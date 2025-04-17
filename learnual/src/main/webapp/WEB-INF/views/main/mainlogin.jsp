<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>    
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>러뉴얼 로그인</title>
    <link rel="stylesheet" href="/css/common.css" type="text/css" />
  </head>

  <body>
    <div class="wrapper">
    <jsp:include page="/WEB-INF/views/common/component/learnualheader.jsp" />

      <div class="login-main">
        <div class="login-main-wrapper">
          <div class="login-main-left">
            <div class="text-wrapper">
              <div class="text-title">
                <p>모두의 학습</p>
                <p>'Your All-in-One Learning Manual'</p>
              </div>
              <div class="text-sub">
                <p>수강생과 강사, 플랫폼 관리자 모두를 위한 지침서</p>
                <p>Learn-you-all, Learn-Manual</p>
                <p>러뉴얼에 오신 것을 환영합니다.</p>
              </div>
            </div>

            <div class="login-visual">로그인 visual</div>
          </div>

          <div class="login-main-form">
            <form class="login-form" id="login-form" action="#">
              <h2>로그인</h2>
              <div class="login-input">
                <div class="login-email-area">
                  <label for="login-email">이메일(아이디)</label>
                  <input id="login-email" type="text" />
                </div>
                <div class="login-password-area">
                  <label for="">비밀번호</label>
                  <input id="login-password" type="password" />
                </div>
              </div>
            </form>

            <div class="btn-area">
              <button class="btn-login" type="button">Login</button>
              <div class="btn-regist-area">
                <button class="btn-regist1" type="button">
                  고객으로 가입하기
                </button>
                <button class="btn-regist2" type="button">
                  담당자로 가입하기
                </button>
              </div>
            </div>
          </div>
        </div>
      </div>

      <jsp:include page="/WEB-INF/views/common/component/learnualfooter.jsp" />
    </div>
  </body>
</html>
