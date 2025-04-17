package com.hello.replies.vo;

import jakarta.validation.constraints.NotEmpty;

public class ReplyUpdateRequestVO {
	
	private int boardId;
	
	private int replyId;
	
	private String email;
	
	@NotEmpty(message="댓글의 내용을 작성하세요.")
	private String content;

	public int getBoardId() {
		return this.boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	public int getReplyId() {
		return this.replyId;
	}

	public void setReplyId(int replyId) {
		this.replyId = replyId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
