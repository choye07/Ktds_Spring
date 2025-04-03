package com.hello.board.vo;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

public class BoardWriteRequestVO {
	
	
	private int id;
    /**
     * @ColumnName SUBJECT
     * @ColumnType VARCHAR2(1000)
     * @ColumnComment null
     */
	@NotEmpty(message ="제목은 필수 입력값입니다.")
    private String subject;
    /**
     * @ColumnName CONTENT
     * @ColumnType VARCHAR2(4000)
     * @ColumnComment null
     */
	@NotEmpty(message ="내용은 필수 입력값입니다.")
    private String content;

    /**
     * @ColumnName EMAIL
     * @ColumnType VARCHAR2(100)
     * @ColumnComment null
     */
	@NotEmpty(message ="이메일은 필수 입력값입니다.")
	@Email(message = "이메일 형식이 아닙니다.")
    private String email;
    
    //Html Collection은 List로 받는다.
    private List<MultipartFile> file;

	public int getId() {
		return id;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<MultipartFile> getFile() {
		return this.file;
	}

	public void setFile(List<MultipartFile> file) {
		this.file = file;
	}


}
