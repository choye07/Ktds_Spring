package com.hello.common.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;

public class ApiResponse {

	private int status;
	private Object data;
	private Map<String, List<String>> errors;
	
	private int count;
	private int page; //현재 페이지 번호
	private int pageCount;
	private boolean hasMore;
	private int listSize;

	public ApiResponse(int status, Object data) {
		this.status = status;
		this.data = data;
	}

	public ApiResponse(Object data) {
		this(200, data);
	}

	public ApiResponse(List<FieldError> validationFailureList) {
		this.status = HttpStatus.BAD_REQUEST.value(); // 400
		this.data = null;
		this.errors = new HashMap<>();

		validationFailureList.forEach(fieldError -> {
			String requestParameterName = fieldError.getField();
			String validationFailureMessage = fieldError.getDefaultMessage();

			if (!this.errors.containsKey(requestParameterName)) {
				this.errors.put(requestParameterName, new ArrayList<>());
			}
			this.errors.get(requestParameterName).add(validationFailureMessage);
		});

	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Map<String, List<String>> getErrors() {
		return errors;
	}

	public void setErrors(Map<String, List<String>> errors) {
		this.errors = errors;
	}

	public void addError(String requestParametername, String errorMessage) {

		if (this.errors == null) {
			this.errors = new HashMap<>();
		}

		if (!this.errors.containsKey(requestParametername)) {
			this.errors.put(requestParametername, new ArrayList<>());
		}

		this.errors.get(requestParametername).add(errorMessage);

	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public boolean isHasMore() {
		return hasMore;
	}

	public void setHasMore(boolean hasMore) {
		this.hasMore = hasMore;
	}

	public int getListSize() {
		return listSize;
	}

	public void setListSize(int listSize) {
		this.listSize = listSize;
	}
	
	
	
	
}
