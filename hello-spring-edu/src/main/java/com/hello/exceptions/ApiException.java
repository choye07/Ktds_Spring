package com.hello.exceptions;

public class ApiException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2301563993924099667L;
	
	
	public ApiException(String message) {
		super(message);
	}

}
