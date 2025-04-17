package com.hello.member.vo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class MemberLoginRequestVO {
	@NotEmpty(message = "이메일을 입력해주세요.")
	@Email(message = "정확한 이메일을 입력해주세요.")
	private String email;
	
	@NotEmpty(message = "비밀번호를 입력하세요.")
	private String password;

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
