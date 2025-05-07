<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%--
        Controller Endpoint를 해당 위치에 보여주는 방법. 
        <c:import url="/member/loginstatus" /> 
    --%>
<jsp:include page="/WEB-INF/views/layout/header.jsp" />

<div class="search-area">
	<label for="writer-name">작성자</label> <input type="text"
		id="writer-name" value="${pagination.writerName}" /> <label
		for="writer-email">Email</label> <input type="text" id="writer-email"
		value="${pagination.writerEmail}" /> <label for="subject">제목</label>
	<input type="text" id="subject" value="${pagination.subject}" /> <label
		for="content">내용</label> <input type="text" id="content"
		value="${pagination.content}" />

	<button type="button" class="search-button board-search-button">검색</button>
</div>

<div class="right-align">총 ${boardList.boardCnt} 건의 게시글이 검색되었습니다.
</div>

<table class="grid">
	<colgroup>
		<col width="80" />
		<col />
		<col width="250" />
		<col width="80" />
		<col width="120" />
		<col width="120" />
	</colgroup>
	<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>이름</th>
			<th>조회수</th>
			<th>등록일</th>
			<th>수정일</th>
		</tr>
	</thead>
	<tbody>
		<c:choose>
			<c:when test="${not empty boardList.boardList}">
				<c:forEach items="${boardList.boardList}" var="board">
					<tr>
						<td class="center-align">${board.id}</td>
						<td><a href="/board/view/${board.id}">${board.subject}</a></td>
						<td>${board.memberVO.name}</td>
						<td class="center-align">${board.viewCnt}</td>
						<td class="center-align">${board.crtDt}</td>
						<td class="center-align">${Board.mdfyDt}</td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr class="empty">
					<td colspan="6">게시글이 비어있습니다. 첫 게시글의 주인공이 되어보세요!</td>
				</tr>
			</c:otherwise>
		</c:choose>
	</tbody>
</table>
<ul class="paginator board-paginator">
	<c:if test="${pagination.hasPrevGroup}">
		<li data-page-no="0"><a href="javascript:void(0)">처음</a></li>
		<li data-page-no="${pagination.prevGroupStartPageNo}"><a
			href="javascript:void(0)">이전</a></li>
	</c:if>

	<c:forEach begin="${pagination.groupStartPageNo}"
		end="${pagination.groupEndPageNo}" step="1" var="p">
		<li class="${pagination.pageNo == p ? 'active' : ''}"
			data-page-no="${p}"><a href="javascript:void(0)"> ${p + 1} </a>
		</li>
	</c:forEach>

	<c:if test="${pagination.hasNextGroup}">
		<li data-page-no="${pagination.nextGroupStartPageNo}"><a
			href="javascript:void(0)">다음</a></li>
		<li data-page-no="${pagination.pageCount - 1}"><a
			href="javascript:void(0)">마지막</a></li>
	</c:if>
	<li><select id="list-size">
			<option value="10" ${10==pagination.listSize ? 'selected' : ''}>10</option>
			<option value="20" ${20==pagination.listSize ? 'selected' : ''}>20</option>
			<option value="30" ${30==pagination.listSize ? 'selected' : ''}>30</option>
			<option value="50" ${50==pagination.listSize ? 'selected' : ''}>50</option>
			<option value="100" ${100==pagination.listSize ? 'selected' : ''}>100</option>
	</select></li>
</ul>

<sec:authorize access="isAuthenticated()">
	<a href="/board/write">게시글 등록하기</a>
</sec:authorize>
<jsp:include page="/WEB-INF/views/layout/footer.jsp" />