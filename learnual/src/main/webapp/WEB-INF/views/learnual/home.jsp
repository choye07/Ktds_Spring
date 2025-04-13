<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>러뉴얼 홈</title>
    <link rel="stylesheet" href="/css/common.css" type="text/css" />
  </head>

  <body>
    <div class="wrapper">
      <div class="header">
        <div class="header-wrapper">
          <h1 class="header-logo">
            <a href="#">로고</a>
          </h1>

          <div class="header-right">
            <ul class="header-right-nav">
              <li>
                <a href="#">About</a>
              </li>
              <li>
                <a href="#">Product</a>
              </li>
              <li>
                <a href="#">Menu3</a>
              </li>
              <li>
                <a href="#">Menu4</a>
              </li>
              <li>
                <a href="#">Menu5</a>
              </li>
            </ul>
          </div>
        </div>
      </div>

      <div class="home-main">
        <div class="visual">main visual</div>

        <div class="contents">
          <div class="notice article">
            <div>
              <h2>러뉴얼 공지사항</h2>
              <a href="#">더보기</a>
            </div>

            <div>
              <ul class="article-content">
                <li>
                  <a href="#">
                    <h3>러뉴얼 서비스 오픈 기념 할인 행사!</h3>
                    <span>2025.03.29 홍길동</span>
                  </a>
                </li>

                <li>
                  <a href="#">
                    <h3>기능 개발자 채용 공고</h3>
                    <span>2025.03.29 홍길동</span>
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

          <div class="search">
            <!-- 로그인하지 않을 경우 보이는 div / search 비활성 -->
            <div class="search-inactive">
              <p>학원 또는 강좌명 검색은 로그인이 필요합니다.</p>
              <div class="btn-area">
                <a href="#">
                  <div class="login-overlay">login-overlay</div>
                  <span>러뉴얼 로그인</span>
                </a>
                <a href="#">
                  <div class="login-overlay">login-overlay</div>
                  <span>회원 가입</span>
                </a>
              </div>
            </div>
            <!-- 로그인했을 경우 보이는 div / search 활성 -->
            <div class="search-active">
              <ul class="search-tab">
                <li class="search-tab-academy on">
                  <a href="#">학원명 검색</a>
                </li>
                <li class="search-tab-lecture">
                  <a href="#">강좌명 검색</a>
                </li>
              </ul>
              <div class="search-area academy">
                <form id="search-academy-form" class="search-form" action="#">
                  <div class="search-input-area">
                    <label for="search-academy">학원명 검색 입력란</label>
                    <input
                      id="search-academy"
                      type="text"
                      placeholder="학원명을 입력하세요"
                    />
                  </div>
                  <div class="search-button-area">
                    <button type="button btn3">검색</button>
                  </div>
                </form>
              </div>

              <ul class="search-academy-list-wrapper list-wrapper">
                <li>
                  <a href="#">
                    <p>(채용예정자 전형) 풀스택 양성과정</p>
                    <span>(주)그린 컴퓨터 아카데미</span>
                    <span>서울시 동작구 연남동</span>
                  </a>
                </li>
                <li>
                  <a href="#">
                    <p>(재직자 전형)AZURE 보안 전문가 과정</p>
                    <span>(주)그린 컴퓨터 아카데미</span>
                    <span>서울시 동작구 연남동</span>
                  </a>
                </li>
              </ul>
            </div>
          </div>
        </div>
      </div>

      <div class="footer">
        <div class="footer-wrapper">
          <div class="footer-logo">하단 로고</div>

          <div class="footer-contents">
            <div class="footer-content1">
              <p>Use cases</p>
              <ul class="footer-content1-list">
                <li>UI design</li>
                <li>UX design</li>
                <li>Wireframing</li>
              </ul>
            </div>

            <div class="footer-content2">
              <p>Explore</p>
              <ul class="footer-content2-list">
                <li>Design</li>
                <li>Prototyping</li>
              </ul>
            </div>

            <div class="footer-content3">
              <p>Resources</p>
              <ul class="footer-content3-list">
                <li>Blog</li>
                <li>Best practices</li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>

    <!-- templates -->
    <template id="main-notice-list-template">
      <li class="main-notice-list">
        <a href="#">
          <strong>러뉴얼 서비스 오픈 기념 할인 행사!</strong>
          <span>2025.03.29 홍길동</span>
        </a>
      </li>
    </template>

    <template id="main-search-list-template">
      <li class="main-search-academy-list">
        <a href="#">
          <strong>(채용예정자 전형) 풀스택 양성과정</strong>
          <p>ㅇㅇ컴퓨터 아카데미</p>
          <p>서울시 ㅇㅇ구 ㅇㅇ동 ㅇㅇ로</p>
        </a>
      </li>
    </template>
  </body>
</html>
