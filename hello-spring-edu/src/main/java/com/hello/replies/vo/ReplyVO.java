package com.hello.replies.vo;

import com.hello.member.vo.MembersVO;

/**
 * @TableName REPLIES
 * @TableComment null
 */
public class ReplyVO {

	private int level;
	/**
	 * @ColumnName REPLY_ID
	 * @ColumnType NUMBER(, )
	 * @ColumnComment null
	 */
	private int replyId;

	/**
	 * @ColumnName BOARD_ID
	 * @ColumnType NUMBER(, )
	 * @ColumnComment null
	 */
	private int boardId;

	/**
	 * @ColumnName EMAIL
	 * @ColumnType VARCHAR2(100)
	 * @ColumnComment null
	 */
	private String email;

	/**
	 * @ColumnName CONTENT
	 * @ColumnType CLOB
	 * @ColumnComment null
	 */
	private String content;

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
	 * @ColumnName RECOMMEND_CNT
	 * @ColumnType NUMBER(, )
	 * @ColumnComment null
	 */
	private int recommendCnt;

	/**
	 * @ColumnName PARENT_REPLY_ID
	 * @ColumnType NUMBER(, )
	 * @ColumnComment null
	 */
	private int parentReplyId;

	private MembersVO memberVO;

	public int getReplyId() {
		return this.replyId;
	}

	public void setReplyId(int replyId) {
		this.replyId = replyId;
	}

	public int getBoardId() {
		return this.boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
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

	public int getRecommendCnt() {
		return this.recommendCnt;
	}

	public void setRecommendCnt(int recommendCnt) {
		this.recommendCnt = recommendCnt;
	}

	public int getParentReplyId() {
		return this.parentReplyId;
	}

	public void setParentReplyId(int parentReplyId) {
		this.parentReplyId = parentReplyId;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public MembersVO getMemberVO() {
		return memberVO;
	}

	public void setMeberVO(MembersVO memberVO) {
		this.memberVO = memberVO;
	}

	@Override
	public String toString() {
		return "RepliesVO(replyId: " + replyId + ", boardId: " + boardId + ", email: " + email + ", content: " + content
				+ ", crtDt: " + crtDt + ", mdfyDt: " + mdfyDt + ", recommendCnt: " + recommendCnt + ", parentReplyId: "
				+ parentReplyId + ", )";
	}
}