package com.learn.bbs.usr.vo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;

// 회원가입용
public class UsrRegistRequestVO {
	
	@NotEmpty(message = "이메일을 입력해주세요.")
	@Email(message = "정확한 이메일을 입력해주세요.")
	// 회원 이메일
	private String usrMl;
	
	@NotEmpty(message = "이름을 입력해주세요.")
	// 회원 이름
	private String usrNm;
	
	@NotEmpty(message = "비밀번호를 입력해주세요.")
	@Pattern(regexp="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z])(?=.*\\W).{10,}$",
				message="비밀번호는 영소문자, 대문자, 숫자, 특수문자를 포함해 10자리 이상으로 입력해야 합니다.")
	// 회원 비밀번호
	private String usrPw;
	
	@NotEmpty(message = "비밀번호 재입력을 입력해주세요.")
	@Pattern(regexp="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z])(?=.*\\W).{10,}$",
	message="비밀번호는 영소문자, 대문자, 숫자, 특수문자를 포함해 10자리 이상으로 입력해야 합니다.")
	// 회원 비밀번호 확인
	private String confirmUsrPw;
	
	// 회원 전화번호
	@NotEmpty(message = "휴대폰번호를 입력해주세요.")
	private String usrPn;
	
	// 회원 주소
	@NotEmpty(message = "주소를 입력해주세요.")
	private String usrAdrs;
	
	// 회원의 비밀번호 암호화를 위한 문자열
	private String usrSlt;

	public String getUsrMl() {
		return usrMl;
	}

	public void setUsrMl(String usrMl) {
		this.usrMl = usrMl;
	}

	public String getUsrNm() {
		return usrNm;
	}

	public void setUsrNm(String usrNm) {
		this.usrNm = usrNm;
	}

	public String getUsrPw() {
		return usrPw;
	}

	public void setUsrPw(String usrPw) {
		this.usrPw = usrPw;
	}

	public String getConfirmUsrPw() {
		return confirmUsrPw;
	}

	public void setConfirmUsrPw(String confirmUsrPw) {
		this.confirmUsrPw = confirmUsrPw;
	}

	public String getUsrPn() {
		return usrPn;
	}

	public void setUsrPn(String usrPn) {
		this.usrPn = usrPn;
	}

	public String getUsrAdrs() {
		return usrAdrs;
	}

	public void setUsrAdrs(String usrAdrs) {
		this.usrAdrs = usrAdrs;
	}

	public String getUsrSlt() {
		return usrSlt;
	}

	public void setUsrSlt(String usrSlt) {
		this.usrSlt = usrSlt;
	}
	
	

}
