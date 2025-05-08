package com.hello.exceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.hello.common.vo.ApiResponse;

@RestControllerAdvice
public class ApiExceptionHandler {

	@ExceptionHandler(ApiException.class)
	public ApiResponse sendErrorResponse(ApiException ae) {
		return new ApiResponse(500, ae.getMessage());
	}
	
}
