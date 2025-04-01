package com.hello.board.vo;

public class BoardUpdateRequestVO {
    /**
     * @ColumnName ID
     * @ColumnType NUMBER(, )
     * @ColumnComment null
     */
    private int id;

	 /**
     * @ColumnName SUBJECT
     * @ColumnType VARCHAR2(1000)
     * @ColumnComment null
     */
    private String subject;
    /**
     * @ColumnName CONTENT
     * @ColumnType VARCHAR2(4000)
     * @ColumnComment null
     */
    private String content;

    /**
     * @ColumnName EMAIL
     * @ColumnType VARCHAR2(100)
     * @ColumnComment null
     */
    private String email;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

}
