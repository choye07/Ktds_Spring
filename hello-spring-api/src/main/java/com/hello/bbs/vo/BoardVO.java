package com.hello.bbs.vo;

import java.util.List;

import com.hello.file.vo.FileVO;
import com.hello.member.vo.MembersVO;

/**
 * @TableName BOARD
 * @TableComment null
 */
public class BoardVO {

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

	/**
	 * @ColumnName VIEW_CNT
	 * @ColumnType NUMBER(, )
	 * @ColumnComment null
	 */
	private int viewCnt;

	/**
	 * @ColumnName CRT_DT
	 * @ColumnType DATE
	 * @ColumnComment null
	 */
	private String crtDt;

	/**
	 * @ColumnName MDFY_DT
	 * @ColumnType DATE
	 * @ColumnComment null
	 */
	private String mdfyDt;

	/**
	 * @ColumnName FILE_NAME
	 * @ColumnType VARCHAR2(1000)
	 * @ColumnComment null
	 */
	private String fileName;

	/**
	 * @ColumnName ORIGIN_FILE_NAME
	 * @ColumnType VARCHAR2(1000)
	 * @ColumnComment null
	 */
	private String originFileName;

	private List<FileVO> fileList;

	private MembersVO memberVO;

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

	public int getViewCnt() {
		return this.viewCnt;
	}

	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}

	public String getCrtDt() {
		return this.crtDt;
	}

	public void setCrtDt(String crtDt) {
		this.crtDt = crtDt;
	}

	public String getMdfyDt() {
		return this.mdfyDt;
	}

	public void setMdfyDt(String mdfyDt) {
		this.mdfyDt = mdfyDt;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getOriginFileName() {
		return this.originFileName;
	}

	public void setOriginFileName(String originFileName) {
		this.originFileName = originFileName;
	}

	public List<FileVO> getFileList() {
		return fileList;
	}

	public void setFileList(List<FileVO> fileList) {
		this.fileList = fileList;
	}

	public MembersVO getMemberVO() {
		return memberVO;
	}

	public void setMemberVO(MembersVO memberVO) {
		this.memberVO = memberVO;
	}

	@Override
	public String toString() {
		return "BoardVO(id: " + id + ", subject: " + subject + ", content: " + content + ", email: " + email
				+ ", viewCnt: " + viewCnt + ", crtDt: " + crtDt + ", mdfyDt: " + mdfyDt + ", fileName: " + fileName
				+ ", originFileName: " + originFileName + ", )";
	}
}