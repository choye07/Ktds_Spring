package com.hello.exceptions;

public class NotExistsException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1473847385496084486L;

	public NotExistsException() {
		super("파일이 없습니다.");
	}
}
