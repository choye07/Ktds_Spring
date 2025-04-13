package com.learn.exceptions;

public class PageNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5132847863721786218L;

	public PageNotFoundException(int boardId) {
		super(boardId + "는 존재하지 않는 게시글 번호입니다.");
	}
}
