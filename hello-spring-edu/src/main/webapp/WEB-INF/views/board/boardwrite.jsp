<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<jsp:include page="/WEB-INF/views/layout/header.jsp" />
	<h1>게시글 작성</h1>
	<!--enctype="application/x-www-form-urlencoded" 기본 값-->
	<form:form modelAttribute="boardWriteRequestVO" class="write-form"
		enctype="multipart/form-data">
		<!--없으면 파일 전송 불가능-->
		<div class="grid">
			<label for="subject">제목</label>
			<div>
				<input type="text" id="subject" name="subject"
					value="${userWriteBoardVO.subject}" required />
				<form:errors path="subject" element="div" cssClass="error" />
			</div>
			<label for="file">첨부파일</label>
			<div>
				<!-- input type file에는 value 속성이 없다.
            사용자가 첨부한 파일 정보를 작성해 줄 수 없다.
         -->
				<input type="file" id="file1" name="file" /> <input type="file"
					id="file2" name="file" /> <input type="file" id="file3"
					name="file" />
			</div>
			<label for="content">내용</label>
			<div>
				<textarea name="content" id="content" required>${userWriteBoardVO.content}</textarea>
				<form:errors path="content" element="div" cssClass="error" />
			</div>
			<div class="btn-group">
				<div class="right-align">
					<button type="submit" class="write-save">저장</button>
				</div>
			</div>
		</div>
	</form:form>
<jsp:include page="/WEB-INF/views/layout/footer.jsp" />
