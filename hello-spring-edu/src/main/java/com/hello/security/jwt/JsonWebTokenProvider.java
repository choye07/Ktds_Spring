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

	/**
	 * 사용자의 정보를 받아 webtoken을 만드는 메소드
	 * @return
	 */
	public String generateJsonWebToken(MembersVO memberVO, Duration expiredAt) {

		Date now = new Date();
		// 1. 토큰의 유효기간 설정.
		Date expireDate = new Date(now.getTime() + expiredAt.toMillis());

		// 2. 토큰의 암호화를 위한 비밀키 생성.
		// hmacShaKeyFor가 받는 파라미터는 byte 타입이라 바꿔줘야한다.
		SecretKey secretKey = Keys.hmacShaKeyFor(this.secretKeyString.getBytes());

		// 3. JsonWebToken을 생성 및 반환.
		// compact를 String으로 바꿔주는데 암호화된 json을 스트링으로 반환 시킬 수 있다.
		// jwt는 순서가 제일 중요하다 순서를 지키지 않으면 올바르게 작동이 안된다.
		return Jwts.builder()
					.issuer(this.issuer)// 토큰 발행 시스템 작성
					.subject("JWTAuthentication") // 토큰의 제목 작성
					.claim("userData", memberVO) // JWT에 작성할 본문 내용. -> 여러개 쓸 수 있다 key,value 형식
					.claim("email", memberVO.getEmail()).claim("role", memberVO.getRole())
					.claim("action", memberVO.getActionList()).issuedAt(now) // 토큰을 발행한 날짜와 시간
					.expiration(expireDate) // 토큰 만료되는 날짜와 시간
					.signWith(secretKey)// 암호화에 사용될 키
					.compact();
	}

	/**
	 * 인증을 요청한 토큰을 복호화에서 풀어서 membersVO로 바꿔주는 메소드
	 * 
	 * @throws JsonProcessingException
	 */
	public MembersVO extraMembersVOFromJsonWebToken(String jsonWebToken) throws JsonProcessingException {
		// JsonWebToken을 복호화 하기 위한 비밀키
		SecretKey secretKey = Keys.hmacShaKeyFor(this.secretKeyString.getBytes());

		// 복호화해를 해서 정보를 끄집어낸다.
		Claims claims = Jwts.parser()// Token을 객체로 변환시킨다.
							.verifyWith(secretKey) // token을 복호화 시킬 때 필요한 키를 넣어준다.
							.requireIssuer(this.issuer)// issuer의 값이 토큰을 만들 때 작성한 issuer와 같은지 비교, 다르다면 변조된 토큰.
							.requireSubject("JWTAuthentication") // subject의 값이 토큰을 만들 때 작성한 subject와 같은지 비교. 다르다면 변조된 토큰.
							.build() // JsonWebToken을 위에 정보로 객체로 변환시킨다. 이 과정에서 잘못된 데이터가 있을 때 예외 발생.
							.parseSignedClaims(jsonWebToken) // 토큰 데이터를 반환.
							.getPayload(); // Clames 인스턴스 반환 (userData, email, role, action)

		Object userData = claims.get("userData"); // 무조건 Object 반환 그래서 object로 받아준다.
		// if MembersVO로 받는 다면 MembersVO로 캐스팅 하면 어떻게 될거인가? LinkedHashMap으로 되어있어서
		// classcasting(?) Exception이 일어남.
		// gson을 통해서 json을 바꿔주면 느리다. 그래서 jackson을 사용해야 한다.

		// Jackson을 이용해서 token 데이터를 인스턴스로 변환.
		ObjectMapper om = new ObjectMapper();

		// 1. userData를 JSON으로 변환
		String json = om.writeValueAsString(userData);
		System.out.println(json);
		// 2. JSON데이터를 MembersVO로 변환.

		MembersVO memberVO = om.readValue(json, MembersVO.class);

		return memberVO;
	}

}
