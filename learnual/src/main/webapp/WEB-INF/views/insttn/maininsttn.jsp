<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>    
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>학원 메인</title>
  <link rel="stylesheet" href="/css/common.css" type="text/css" />
  <script src="/js/jquery-3.7.1.min.js" type="text/javascript"></script>
  <script src="/js/common.js" type="text/javascript"></script>
</head>

<body>
  <div class="dashboard insttn">
    <!-- 관리자 권한이 있는 유저만 활성화 가능 -->
    <jsp:include page="/WEB-INF/views/common/component/insttnsidebar.jsp" />

	<jsp:include page="/WEB-INF/views/common/component/insttnheader.jsp" />

    <div class="dashboard-main insttn">
      <div class="main-wrapper">
        <div class="visual">
          insttn-main-visual
        </div>
        <div class="widget-wrapper">
          <div class="dashboard-col1">
            <div class="notice widget-article">
              <div>
                <h2>학원 강좌 목록</h2>
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
                    <div class="article-direct">
                      <a class="btn" href="#">자세히보기</a>
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
                    </a>
                    <div class="article-direct">
                      <a class="btn" href="#">자세히보기</a>
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
          <div class="dashboard-col2">
            <div class="insttn-notice widget-article">
              <div>
                <h2>학원 공지사항</h2>
                <a href="#">더보기</a>
              </div>

              <div>
                <ul class="article-content">
                  <li>
                    <a href="#">
                      <h3>공지사항 item1</h3>
                      <span>2025.04.13 홍길동</span>
                    </a>
                  </li>

                  <li>
                    <a href="#">
                      <h3>공지사항 item2</h3>
                      <span>2025.04.13 홍길동</span>
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

            <div class="recruit-info widget-article">
              <div>
                <h2>실시간 채용 정보</h2>
                <a href="#">더보기</a>
              </div>

              <div>
                <ul class="article-content">
                  <li>
                    <a href="#">
                      <h3>개발자 / 프론트엔드 / 판교 / (주)하이테크</h3>
                      <span>2025.04.13 등록</span>
                    </a>
                  </li>

                  <li>
                    <a href="#">
                      <h3>Spring 백엔드 개발자 / 강남 / (주)Hitek</h3>
                      <span>2025.04.11 등록</span>
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