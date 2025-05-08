package com.hello.replies.vo;

import jakarta.validation.constraints.NotEmpty;

public class ReplyRegistRequestVO {

	private int boardId;
	private String email;
	
	@NotEmpty(message="댓글의 내용을 작성하세요!")
	private String content;
	
	private int parentReplyId;

	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getParentReplyId() {
		return parentReplyId;
	}

	public void setParentReplyId(int parentReplyId) {
		this.parentReplyId = parentReplyId;
	}
	
	

}
