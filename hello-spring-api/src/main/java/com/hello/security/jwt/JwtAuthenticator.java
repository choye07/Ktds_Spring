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

@PreAuthorize("permitAll")
@RestController
public class JwtAuthenticator {

	@Autowired
	private MemberService memberService;
	
	@Autowired
	private JsonWebTokenProvider jwtProvider;
	
	@PostMapping("/api/v1/auth")
	public ApiResponse createNewJsonWebToken(@RequestBody MemberAuthVO memberAuthVO) {
		MembersVO membersVO = this.memberService.auth(memberAuthVO);
		String token = this.jwtProvider.generateJsonWebToken(membersVO, Duration.ofDays(30));
		return new ApiResponse(token);
	}
}












