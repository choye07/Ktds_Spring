<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<jsp:include page="/WEB-INF/views/layout/header.jsp" />
    
    <h1>게시글 수정</h1>
    <form class="modify-form">
    <sec:csrfInput/>
      <input type="hidden" name="id" value="${BoardVO.id}" />
     
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
        <textarea name="content" id="content" required>${BoardVO.content}</textarea
        >

        <div class="btn-group">
          <div class="right-align">
            <button type="submit" class="modify-save">저장</button>
          </div>
        </div>
      </div>
    </form>

<jsp:include page="/WEB-INF/views/layout/footer.jsp" />