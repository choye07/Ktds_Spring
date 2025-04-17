package com.learn.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.learn.common.vo.AjaxResponse;


@RestControllerAdvice // @ControllerAdvice + @ResponseBody 
public class AjaxGlobalExceptionHandler {
	
	public AjaxResponse handAjaxException(AjaxException ajaxException) {
		return new AjaxResponse(HttpStatus.BAD_REQUEST.value(), ajaxException.getMessage());
	}

}
