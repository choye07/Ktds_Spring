<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>    
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>강좌 상세페이지</title>
  <link rel="stylesheet" href="/common.css" type="text/css" />
  <script src="/jquery-3.7.1.min.js" type="text/javascript"></script>
  <script src="/common.js" type="text/javascript"></script>
</head>

<body>
  <div class="dashboard insttn">
    <!-- 관리자 권한이 있는 유저만 활성화 가능 -->
    <jsp:include page="/WEB-INF/views/common/component/insttnsidebar.jsp" />
	
	<jsp:include page="/WEB-INF/views/common/component/insttnheader.jsp" />

    <div class="dashboard-main insttn">

      <div class="main-wrapper course-detail">
        <h2>강좌 교육과정</h2>
        <div class="course-info">
          <div class="course-name-label">과정명</div>
          <div class="course-name">
            [재직자향상] 재직자향상 > DB > (주말) 성능을 고려하는 최적의 SQL 작성 (튜닝_Part2)
          </div>
          <div class="course-startDate-label">교육시작일</div>
          <div class="course-startDate">
            2025년 07월 27일
          </div>
          <div class="course-endDate-label">교육종료일</div>
          <div class="course-endDate">
            2026년 01월 10일
          </div>
          <div class="course-registStartDate-label">신청시작일</div>
          <div class="course-registStartDate">
            2025년 04월 10일
          </div>
          <div class="course-registEndDate-label">신청마감일</div>
          <div class="course-registEndDate">
            2025년 07월 27일
          </div>


        </div>

        <h2>상세정보</h2>
        <div class="deco-bar"></div>
      </div>
    </div>

	<jsp:include page="/WEB-INF/views/common/component/insttnfooter.jsp" />
	
  </div>
</body>

</html>