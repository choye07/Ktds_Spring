package com.hello.member.vo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

public class MemberRegistRequestVO {

	@NotEmpty(message="이메일을 입력해주세요.")
	@Email(message="정확한 이메일을 입력해주세요.")
	private String email;
	
	@NotEmpty(message="이름을 입력해주세요.")
	private String name;
	
	@NotEmpty(message="비밀번호를 입력해주세요.")
	/*
	 * 8자리 이상.
	 * - 영대소문자 + 숫자 | 특수기호
	 * 
	 * 10자리 이상.
	 * - 영대문자 + 영소문자 + 숫자 + 특수기호
	 * 
	 * 정규표현식
	 * ?=([a-z])?=([A-Z])?=([\d]])?=([!@#$%\\^&*\\(\\)_+-=\\[\\]]){10,}
	 */
	@Pattern(regexp="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z])(?=.*\\W).{10,}$",
			message="비밀번호는 영소문자, 대문자, 숫자, 특수문자를 포함해 10자리 이상으로 입력해야 합니다.")
	private String password;
	
	@NotEmpty(message="비밀번호 재입력을 입력해주세요.")
	@Pattern(regexp="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z])(?=.*\\W).{10,}$",
			message="비밀번호는 영소문자, 대문자, 숫자, 특수문자를 포함해 10자리 이상으로 입력해야 합니다.")
	private String confirmPassword;
	
	private String salt;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}
	
}
