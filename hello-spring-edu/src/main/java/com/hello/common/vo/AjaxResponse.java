package com.hello.common.vo;

public class AjaxResponse {
	private int status;

	private Object data; //모든 타입을 줘야하기 때문에.

	public AjaxResponse(int status, Object data) {
		this.status = status;
		this.data = data;
	}
	
	public AjaxResponse(Object data) {
		this(200,data);
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
}
