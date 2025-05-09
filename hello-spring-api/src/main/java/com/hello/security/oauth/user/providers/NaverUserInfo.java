package com.hello.security.oauth.user.providers;

import java.util.Map;

import com.hello.security.oauth.user.OAuth2UserInfo;

public class NaverUserInfo implements OAuth2UserInfo {
	
	private Map<String, Object> attributes;
	

	public NaverUserInfo(Map<String, Object> attributes) {
		System.out.println("NaverUserInfo: "+attributes);
		this.attributes = (Map<String, Object>)attributes.get("response");
	}

	@Override
	public Map<String, Object> getAttributes() {
		return this.attributes;
	}

	@Override
	public String getEmail() {
		return this.attributes.get("email").toString();
	}

	@Override
	public String getName() {
		return this.attributes.get("name").toString();
	}

}
