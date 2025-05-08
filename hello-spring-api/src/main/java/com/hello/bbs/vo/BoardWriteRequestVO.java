package com.hello.bbs.vo;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.NotEmpty;


public class BoardWriteRequestVO {

	private int id;

	@NotEmpty(message = "제목은 필수 입력값입니다.")
	private String subject;

	@NotEmpty(message = "내용은 필수 입력값입니다.")
	private String content;

	private String email;

	// Html Collection 은 List로 받는다.
	private List<MultipartFile> file;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<MultipartFile> getFile() {
		return file;
	}

	public void setFile(List<MultipartFile> file) {
		this.file = file;
	}

}
