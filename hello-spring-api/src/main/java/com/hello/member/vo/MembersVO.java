package com.hello.member.vo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @TableName MEMBERS
 * @TableComment null
 */
public class MembersVO {

	/**
	 * @ColumnName EMAIL
	 * @ColumnType VARCHAR2(100)
	 * @ColumnComment null
	 */
	private String email;

	/**
	 * @ColumnName NAME
	 * @ColumnType VARCHAR2(100)
	 * @ColumnComment null
	 */
	private String name;

	/**
	 * @ColumnName PASSWORD
	 * @ColumnType VARCHAR2(100)
	 * @ColumnComment null
	 */
	@JsonIgnore
	private String password;

	/**
	 * @ColumnName SALT
	 * @ColumnType VARCHAR2(100)
	 * @ColumnComment null
	 */
	@JsonIgnore
	private String salt;

	/**
	 * @ColumnName JOIN_DATE
	 * @ColumnType DATE
	 * @ColumnComment null
	 */
	@JsonIgnore
	private String joinDate;

	/**
	 * @ColumnName LATEST_LOGIN_IP
	 * @ColumnType VARCHAR2(15)
	 * @ColumnComment null
	 */
	@JsonIgnore
	private String latestLoginIp;

	/**
	 * @ColumnName LATEST_PASSWORD_CHANGE_DATE
	 * @ColumnType DATE
	 * @ColumnComment null
	 */
	@JsonIgnore
	private String latestPasswordChangeDate;

	/**
	 * @ColumnName LATEST_LOGIN_DATE
	 * @ColumnType DATE
	 * @ColumnComment null
	 */
	@JsonIgnore
	private String latestLoginDate;

	/**
	 * @ColumnName LATEST_LOGIN_FAIL_DATE
	 * @ColumnType DATE
	 * @ColumnComment null
	 */
	@JsonIgnore
	private String latestLoginFailDate;

	/**
	 * @ColumnName LOGIN_FAIL_COUNT
	 * @ColumnType NUMBER(10, 0)
	 * @ColumnComment null
	 */
	@JsonIgnore
	private int loginFailCount;

	/**
	 * @ColumnName LOGIN_YN
	 * @ColumnType CHAR(1)
	 * @ColumnComment null
	 */
	@JsonIgnore
	private String loginYn;

	/**
	 * @ColumnName BLOCK_YN
	 * @ColumnType CHAR(1)
	 * @ColumnComment null
	 */
	@JsonIgnore
	private String blockYn;

	private String role;

	private List<ActionVO> actionList;

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return this.salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getJoinDate() {
		return this.joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public String getLatestLoginIp() {
		return this.latestLoginIp;
	}

	public void setLatestLoginIp(String latestLoginIp) {
		this.latestLoginIp = latestLoginIp;
	}

	public String getLatestPasswordChangeDate() {
		return this.latestPasswordChangeDate;
	}

	public void setLatestPasswordChangeDate(String latestPasswordChangeDate) {
		this.latestPasswordChangeDate = latestPasswordChangeDate;
	}

	public String getLatestLoginDate() {
		return this.latestLoginDate;
	}

	public void setLatestLoginDate(String latestLoginDate) {
		this.latestLoginDate = latestLoginDate;
	}

	public String getLatestLoginFailDate() {
		return this.latestLoginFailDate;
	}

	public void setLatestLoginFailDate(String latestLoginFailDate) {
		this.latestLoginFailDate = latestLoginFailDate;
	}

	public int getLoginFailCount() {
		return this.loginFailCount;
	}

	public void setLoginFailCount(int loginFailCount) {
		this.loginFailCount = loginFailCount;
	}

	public String getLoginYn() {
		return this.loginYn;
	}

	public void setLoginYn(String loginYn) {
		this.loginYn = loginYn;
	}

	public String getBlockYn() {
		return this.blockYn;
	}

	public void setBlockYn(String blockYn) {
		this.blockYn = blockYn;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<ActionVO> getActionList() {
		return actionList;
	}

	public void setActionList(List<ActionVO> actionList) {
		this.actionList = actionList;
	}

	@Override
	public String toString() {
		return "MembersVO(email: " + email + ", name: " + name + ", password: " + password + ", salt: " + salt
				+ ", joinDate: " + joinDate + ", latestLoginIp: " + latestLoginIp + ", latestPasswordChangeDate: "
				+ latestPasswordChangeDate + ", latestLoginDate: " + latestLoginDate + ", latestLoginFailDate: "
				+ latestLoginFailDate + ", loginFailCount: " + loginFailCount + ", loginYn: " + loginYn + ", blockYn: "
				+ blockYn + ", )";
	}
}