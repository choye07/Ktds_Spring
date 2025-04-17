package com.learn.bbs.usr.vo;

import jakarta.validation.constraints.NotEmpty;

public class UsrLoginRequestVO {
	
	@NotEmpty(message="이메일을 입력하세요")
	private String usrMl;

	@NotEmpty(message="비밀번호를 입력하세요")
	private String usrPw;

	public String getUsrMl() {
		return usrMl;
	}

	public void setUsrMl(String usrMl) {
		this.usrMl = usrMl;
	}

	public String getUsrPw() {
		return usrPw;
	}

	public void setUsrPw(String usrPw) {
		this.usrPw = usrPw;
	}
}
