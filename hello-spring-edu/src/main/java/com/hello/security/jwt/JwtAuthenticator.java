package com.hello.security.jwt;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hello.common.vo.ApiResponse;
import com.hello.member.service.MemberService;
import com.hello.member.vo.MemberAuthVO;
import com.hello.member.vo.MembersVO;


@PreAuthorize("permitAll")//인증 있어도 없어도 가능. 안줘도 되기는 하지만 명시적으로 쓰는 것.
@RestController
public class JwtAuthenticator {

	@Autowired
	private MemberService memberService;
	
	
	@Autowired
	private JsonWebTokenProvider jwtProvider;
	

	
	
	@PostMapping("/api/v1/auth")
	//RequestBody는 json으로 요청 오는 것을 객체화 해서 객체에 넣어주는 역할 responsebody와 반대라 생각하면 된다.
	public ApiResponse createNewJsonWebToken(@RequestBody MemberAuthVO memberAuthVO) {
//		받는 형식
//		{
//			email:"djffdf",
//			password: "dddd"
//		}
		
		MembersVO membersVO = this.memberService.auth(memberAuthVO);
		
		String token = this.jwtProvider.generateJsonWebToken(membersVO, Duration.ofDays(30));
		
		return new ApiResponse(token);
	}
}
