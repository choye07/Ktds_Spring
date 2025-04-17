<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/layout/header.jsp" />
    <h1>게시글 수정</h1>
    <form class="update-form">
      <input type="hidden" id="id" name="id" value="${BoardVO.id}" />
      <div class="grid">
        <label for="subject">제목</label>
        <input
          type="text"
          id="subject"
          name="subject"
          value="${BoardVO.subject}"
          required
        />
        <label for="content">내용</label>
        <textarea name="content" id="content" required>
          ${BoardVO.content}</textarea
        >
        <div class="btn-group">
          <div class="right-align">
            <button type="submit" class="update-button">수정</button>
          </div>
        </div>
      </div>
    </form>
<jsp:include page="/WEB-INF/views/layout/footer.jsp" />