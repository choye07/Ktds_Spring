package com.hello.security.oauth.user;

import java.util.Map;

/**
 * Oauth 채널의 응답을 처리할 인터페이스.
 * email과 name을 추출하는 기능이 정의된 곳.
 */
public interface OAuth2UserInfo {

	/**
	 * OAuth 채널의 응답 정보를 반환
	 * @return
	 */
	public Map<String,Object> getAttributes();
	
	/**
	 * OAuth 채널의 응답 정보 중 이메일 정보만 반환
	 * @return
	 */
	public String getEmail();
	
	/**
	 * OAuth 채널의 응답 정보 중 이름 정보만 반환
	 * @return
	 */
	public String getName();
}
