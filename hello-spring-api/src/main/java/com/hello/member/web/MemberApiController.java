package com.hello.member.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hello.common.util.AuthUtil;
import com.hello.common.vo.ApiResponse;
import com.hello.member.service.MemberService;
import com.hello.member.vo.MemberRegistRequestVO;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class MemberApiController {

	private static final Logger LOGGER = LoggerFactory.getLogger(MemberApiController.class);

	@Autowired
	private MemberService memberService;

	@PostMapping("/member") // /api/v1/member
	public ApiResponse doMemberRegist(@Valid @RequestBody MemberRegistRequestVO memberRegistRequestVO,
			BindingResult bindingResult, Model model) {

		// 파라미터 유효성 검사.
		if (bindingResult.hasErrors()) {
			return new ApiResponse(bindingResult.getFieldErrors());
		}

		// 비밀번호와 비밀번호 재 입력이 같은지 확인.
		String password = memberRegistRequestVO.getPassword();
		String confirmPassword = memberRegistRequestVO.getConfirmPassword();
		if (!password.equals(confirmPassword)) {
			ApiResponse apiResponse = new ApiResponse(400, null);
			apiResponse.addError("password", confirmPassword);
			return apiResponse;

		}

		this.memberService.createNewMember(memberRegistRequestVO);

		return new ApiResponse(200, null);

	}

	// http://localhost:8080/member/available?email=test01@gmail.com
	//spring에서는 엔드포인트에서 인증 없는게 맞다. spring에서 개입을 하니까 atthenticated를 사용 못한다.
	@GetMapping("/member/available") // /api/v1/member/avalivable?email=forge07@naver.com
	public ApiResponse checkAvailableEmail(@RequestParam String email) {

		boolean duplicated = this.memberService.checkDuplicateEmail(email);
		return new ApiResponse(!duplicated);
	}

	@PreAuthorize("isAuthenticated()")
	@GetMapping("/member")
	public ApiResponse viewMyPage() {
		return new ApiResponse(AuthUtil.getMember());
	}

	@PreAuthorize("isAuthenticated()")
	@DeleteMapping("/member")
	public ApiResponse doDeleteMe() {
		boolean success = this.memberService.doDeleteMe(AuthUtil.getEmail());

		return new ApiResponse(success);
	}

}
