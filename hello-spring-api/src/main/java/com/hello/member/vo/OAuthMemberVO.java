package com.hello.member.vo;

import java.util.List;

public class OAuthMemberVO {
	
	
	private final String role = "ROLE_USER";

	private String email;
	private String name;
	private String provider;
	
	private List<ActionVO> actionList;
	
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
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public List<ActionVO> getActionList() {
		return actionList;
	}
	public void setActionList(List<ActionVO> actionList) {
		this.actionList = actionList;
	}
	public String getRole() {
		return role;
	}
	
}
