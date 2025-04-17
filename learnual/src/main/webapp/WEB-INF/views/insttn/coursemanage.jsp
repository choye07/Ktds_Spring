<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>    
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>강좌 관리(관리자)</title>
  <link rel="stylesheet" href="/css/common.css" type="text/css" />
  <script src="/js/jquery-3.7.1.min.js" type="text/javascript"></script>
  <script src="/js/common.js" type="text/javascript"></script>
</head>

<body>
  <div class="modal">
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
          <button class="btn-submit" type="submit">등록</button>
          <button class="btn-cancel" type="button">취소</button>
        </div>
      </form>
    </div>
  </div>

  <div class="dashboard insttn">
    <!-- 관리자 권한이 있는 유저만 활성화 가능 -->
    <jsp:include page="/WEB-INF/views/common/component/insttnsidebar.jsp" />

	<jsp:include page="/WEB-INF/views/common/component/insttnheader.jsp" />

    <div class="dashboard-main insttn">

      <div class="main-wrapper course-manage">
        <div class="main-wrapper-top">
          <h1>강좌 관리</h1>
          <div class="board-toolbox">
            <div class="board-manager-toolbox">
              <div class="btn-add-notice">
                <a href="#">강좌 추가 +</a>
              </div>
            </div>
          </div>
        </div>

        <div class="course-wrapper">
          <div class="active-courses">
            <div class="course-article widget-article">
              <div class="article-title">
                <h2>현재 개설 중인 강좌</h2>
                <a href="#">더보기</a>
              </div>

              <div>
                <ul class="article-content">
                  <li>
                    <a href="#">
                      <h3>(채용예정자 전형) 풀스택 전문가 양성 과정</h3>
                      <p class="period">
                        <span>2025-01-17</span>
                        ~
                        <span>2025-06-20</span>
                      </p>
                      <p class="available-capa">
                        수강인원 :
                        <span class="current-capa">16</span>
                        /
                        <span class="max-capa">30</span>
                        명
                      </p>
                    </a>
                    <div class="article-direct">
                      <a class="btn-modify" href="#">수정</a>
                      <a class="btn-delete" href="#">삭제</a>
                      <a class="btn-shutdown" href="#">마감</a>
                    </div>
                  </li>

                  <li>
                    <a href="#">
                      <h3>(재직자 대상) AZURE 심화 과정</h3>
                      <p class="period">
                        <span>2025-01-17</span>
                        ~
                        <span>2025-06-20</span>
                      </p>
                      <p class="available-capa">
                        수강인원 :
                        <span class="current-capa">16</span>
                        /
                        <span class="max-capa">30</span>
                        명
                      </p>
                    </a>
                    <div class="article-direct">
                      <a class="btn-modify" href="#">수정</a>
                      <a class="btn-delete" href="#">삭제</a>
                      <a class="btn-shutdown" href="#">마감</a>
                    </div>
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
              </div>
            </div>
          </div>
          <div class="inactive-courses">
            <div class="course-article widget-article">
              <div class="article-title">
                <h2>신청 마감 강좌</h2>
                <a href="#">더보기</a>
              </div>

              <div>
                <ul class="article-content">
                  <li>
                    <a href="#">
                      <h3>(채용예정자 전형) 풀스택 전문가 양성 과정</h3>
                      <p class="period">
                        <span>2025-01-17</span>
                        ~
                        <span>2025-06-20</span>
                      </p>
                    </a>
                  </li>

                  <li>
                    <a href="#">
                      <h3>(재직자 대상) AZURE 심화 과정</h3>
                      <p class="period">
                        <span>2025-01-17</span>
                        ~
                        <span>2025-06-20</span>
                      </p>
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
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

	<jsp:include page="/WEB-INF/views/common/component/insttnfooter.jsp" />
	
  </div>
</body>

</html>