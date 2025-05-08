package com.hello.security.jwt;

import java.time.Duration;
import java.util.Date;

import javax.crypto.SecretKey;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hello.member.vo.MembersVO;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

public class JsonWebTokenProvider {

	private String issuer;
	private String secretKeyString;
	
	public JsonWebTokenProvider(String issuer, String secretKeyString) {
		this.issuer = issuer;
		this.secretKeyString = secretKeyString;
	}
	
	public String generateJsonWebToken(MembersVO memberVO, Duration expiredAt) {
		Date now = new Date();
		// 1. 토큰의 유효기간 설정.
		Date expiredDate = new Date(now.getTime() + expiredAt.toMillis());
		
		// 2. 토큰의 암호화를 위한 비밀키 생성.
		SecretKey secretKey = Keys.hmacShaKeyFor(this.secretKeyString.getBytes());
		
		// 3. JsonWebToken 생성 및 반환.
		return Jwts.builder()
				   .issuer(this.issuer) // 토큰 발행 시스템 작성.
				   .subject("JWTAuthentication") // 토큰의 제목 작성.
				   .claim("userData", memberVO) // JWT 에 작성할 본문 내용.
				   .claim("email", memberVO.getEmail())
				   .claim("role", memberVO.getRole())
				   .claim("action", memberVO.getActionList())
				   .issuedAt(now) // 토큰을 발행한 날짜와 시간
				   .expiration(expiredDate) // 토큰이 만료되는 날짜와 시간
				   .signWith(secretKey) // 암호화에 사용될 키.
				   .compact();
	}
	
	public MembersVO extractMembersVOFromJsonWebToken(String jsonWebToken) throws JsonProcessingException {
		// JsonWebToken을 복호화 하기 위한 비밀키.
		SecretKey secretKey = Keys.hmacShaKeyFor(this.secretKeyString.getBytes());
		
		Claims claims = Jwts.parser() // Token 을 객체로 변환시킨다.
					.verifyWith(secretKey) // token을 복호화 시킬 때 필요한 키를 넣어준다.
					.requireIssuer(this.issuer) // issuer 의 값이 토큰을 만들 때 작성한 issuer와 같은지 비교. 다르다면 변조된 토큰.
					.requireSubject("JWTAuthentication") //subject의 값이 토큰을 만들 때 작성한 subject와 같은지 비교. 다르다면 변조된 토큰.
					.build() // JsonWebToken을 위의 정보로 객체로 변환시킨다. 이 과정에서 잘못된 데이터가 있을때, 예외가 발생.
					.parseSignedClaims(jsonWebToken) // 토큰 데이터를 반환.
					.getPayload() // Claims 인스턴스 반환. (userData, email, role, action)
					;
		
		Object userData = claims.get("userData");
		
		// Jackson 을 이용해서 token 데이터를 인스턴스로 변환.
		ObjectMapper om = new ObjectMapper();
		// 1. userData를 JSON으로 변환.
		String json = om.writeValueAsString(userData);
		
		// 2. JSON 데이터를 MembersVO 로 변환.
		MembersVO memberVO = om.readValue(json, MembersVO.class);
		return memberVO;
	}
	
}
