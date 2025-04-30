package com.hello.member.web;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.hello.beans.CustomBeanProvider;
import com.hello.common.util.AuthUtil;
import com.hello.common.vo.AjaxResponse;
import com.hello.member.service.MemberService;
import com.hello.member.vo.MemberRegistRequestVO;
import com.hello.member.vo.MembersVO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class MemberController {

	private final CustomBeanProvider customBeanProvider;

	private static final Logger LOGGER = LoggerFactory.getLogger(MemberController.class);
	@Autowired
	private MemberService memberService;

	MemberController(CustomBeanProvider customBeanProvider) {
		this.customBeanProvider = customBeanProvider;
	}

	@GetMapping("/member/regist")
	public String viewMemberRegistPage() {

		return "member/memberregist";

	}

	@PostMapping("/member/regist")
	public String doMemberRegist(@Valid @ModelAttribute MemberRegistRequestVO memberRegistRequestVO,
			BindingResult bindingResult, Model model) {
		// 파라미터 유효성 검사
		if (bindingResult.hasErrors()) {
			model.addAttribute("userInputRegist", memberRegistRequestVO);
			return "member/memberregist";
		}
		// 비밀번호와 비밀번호 재 입력이 같은지 확인
		String password = memberRegistRequestVO.getPassword();
		String confirmPassword = memberRegistRequestVO.getConfirmPassword();

		if (!password.equals(confirmPassword)) {
			model.addAttribute("errorMessage", "비밀번호가 일치하지 않습니다.");
			model.addAttribute("userInputRegist", memberRegistRequestVO);
		}

		// 이상 없으면 Service 호출.
//		try {

			this.memberService.createNewMember(memberRegistRequestVO);
//		} catch (IllegalArgumentException iae) {
//			model.addAttribute("emailErrorMessage", iae.getMessage());
//			model.addAttribute("userInputRegist", memberRegistRequestVO);
//			return "member/memberregist";
//		}

		return "redirect:/member/login";

	}

	// http://localhost:8080/member/available?email=test@gmail.com
	@ResponseBody
	@GetMapping("/member/available")
	public AjaxResponse checkAvailableEmail(@RequestParam String email) {
		boolean duplicated = this.memberService.checkDuplicateEmail(email);
		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("available", !duplicated);
		return new AjaxResponse(resultMap);

	}

	@GetMapping("/member/login")
	public String viewLoginPage() {
		return "member/memberlogin";
	}



	@GetMapping("/member/mypage") // @SessionAttribute -> 세션에 있는 값을 가져와라.
	public String viewMyPage( Model model) { // 브라우저에서 가져오는 파라미터는
																									// 커맨드 파라미터
		model.addAttribute("LoginUser", AuthUtil.getMember());
		return "member/mypage";
	}
	
	@GetMapping("/member/delete-me")
	public String doDeleteMe() {
		
		boolean success = this.memberService.doDeleteMe(AuthUtil.getEmail());
		
		if(success) {
			AuthUtil.logout();
			return "redirect:/member/success-delete-me";
		}
		
		return "redirect:/member/fail-delete-me";
		
	}
	
	@GetMapping("/member/{result}-delete-me")
	public String viewDeleteResultPage(@PathVariable String result) {
		
		if(!result.toLowerCase().equals("success") && !result.toLowerCase().equals("fail")){
			return "error/404";
		}
		return "member/"+result+"deleteme";
	}
}