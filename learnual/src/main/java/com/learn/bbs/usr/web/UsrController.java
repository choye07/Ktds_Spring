package com.learn.bbs.usr.web;

import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.learn.bbs.usr.service.UsrService;
import com.learn.bbs.usr.vo.UsrLoginRequestVO;
import com.learn.bbs.usr.vo.UsrRegistRequestVO;
import com.learn.bbs.usr.vo.UsrVO;
import com.learn.common.vo.AjaxResponse;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class UsrController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UsrController.class);

    @Autowired
    private UsrService usrService;
	
	@PostMapping("/usr/regist")
    public String doUsrRegist(
    		@Valid @ModelAttribute UsrRegistRequestVO usrRegistRequestVO, 
    		BindingResult bindingResult,
    		Model model
		) {
    	
    	// TODO 파라미터 유효성 검사.
    	if(bindingResult.hasErrors()) {
    		model.addAttribute("userInputRegist", usrRegistRequestVO);
    		return "member/memberregist";	
    	}

    	// 비밀번호화 비밀번호 재입력이 같은지 확인. (유효값만으론 비교를 못하기 때문에 별도 체크)
    	String password = usrRegistRequestVO.getUsrPw();
    	String confirmPassword = usrRegistRequestVO.getConfirmUsrPw();
    	if( ! password.equals(confirmPassword)) {
    		model.addAttribute("errorMessage" , "비밀번호가 일치하지 않습니다.");
    		model.addAttribute("userInputRegist" , usrRegistRequestVO);
    		return "main/mainregist"; // jsp 는 변경 가능성 있음.
    	}
    	
    	// 이상 없으면 Service 호출
    	try {
    		this.usrService.createNewUsr(usrRegistRequestVO);
    	}
    	catch (IllegalArgumentException iae) { 
    		// 이미 존재하는 이메일
    		model.addAttribute("emailErrorMessage", iae.getMessage());
    		model.addAttribute("userInputRegist", usrRegistRequestVO);
    		return "member/memberregist";
		}
    	return "redirect:/member/login"; // 페이지 바뀔 예정.	
    } 
	
    @ResponseBody 
    @GetMapping("/usr/available")
    public AjaxResponse checkAvailableEmail(@RequestParam String usrMl) {
    	
    	boolean duplicated = this.usrService.checkDuplicateEmail(usrMl);
    	
    	Map<String, Object> resultMap = new HashMap<>();
    	resultMap.put("available", !duplicated);
    	
    	return new AjaxResponse(resultMap);
    }
    
    // TODO 로그인 페이지 만들기.
    @GetMapping("/usr/login")
    public String viewLoginPage() {
    	return "/main/mainlogin";
    }
    
    
    @PostMapping("/usr/login")
    public String doLogin(
    		@Valid @ModelAttribute UsrLoginRequestVO usrLoginRequestVO,
			BindingResult bindingResult,
			//@RequestParam String nextUrl, // -> 어떻게 쓰일지 미정이라 주석 처리함.
			Model model,
			HttpSession session,
			HttpServletRequest request) {
		
		// 사용자의 IP 를 가져올 때 HttpServeltRequest 가 사용.
		String userIp = request.getRemoteAddr();
		LOGGER.debug(userIp);
    	
    	if(bindingResult.hasErrors()) {
    		model.addAttribute("userInput", usrLoginRequestVO);
    		return "usr/test"; // 페이지 바뀔 예정.
    	}
    	
    	//try {
    		UsrVO usrVO=  this.usrService.doLogin(usrLoginRequestVO);
    		// 사이트에 접속했을 때 발급 받은 세션은 폐기(로그아웃)시킨다.
    		session.invalidate();
    		// 새로운 세션을 발급받는다. 
    		session = request.getSession(true);
    		// 서버가 Session 에 회원 정보를 기록(기억) 한다.
    		// 해당 사용자의 고유한 세션의 아이디를 브라우저에게 "Cookie" 로 보내준다.
    		session.setAttribute("__LOGIN_USER__", usrVO);

    	return "/main/mainhome"; // 경로 바꿀 수도 있음.
    }
    
    
    @GetMapping("/usr/logout") 
    public String doLogout(HttpSession session) { 
    	// 회원의 정보를 Session 에서 가져온다. (__LOGIN_USER__) => UsrVO
    	 UsrVO usrVO = (UsrVO) session.getAttribute("__LOGIN_USER__");
    	 
    	this.usrService.doLogout(usrVO.getUsrMl());
    	
    	// 세션 폐기 (로그아웃)
    	session.invalidate(); 
    	return "/main/mainlogin";
    }
    
    @GetMapping("/usr/delete-me")
    public String doDeleteMe( 
    		@SessionAttribute("__LOGIN_USER__") UsrVO usrVO, 
    		HttpSession session ) {
    	
    	boolean success = this.usrService.doDeleteUsr(usrVO.getUsrMl());
    	
    	if(success) {
    		session.invalidate();
    		return "/main/mainhome"; // 경로 바꿀 수도 있음.
    	}
    	return "/main/mainhome"; // 경로 바꿀 수도 있음.
    }
}

