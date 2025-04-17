package com.learn.main.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LearnualMainController {
	
	@GetMapping("/")
	public String goMain() {
		return "main/mainhome";
	}
	
	@GetMapping("/login")
	public String goMainLogin() {
		return "main/mainlogin";
	}
	
	@GetMapping("/regist/agreement")
	public String goMainRegistAgreement() {
		return "main/mainagreement";
	}
	
	@GetMapping("/regist")
	public String goMainRegist() {
		return "main/mainregist";
	}
	
	// 임시 대시보드 매핑
	@GetMapping("/dashboard/usr")
	public String goUsrDashboard() {
		return "dashboard/dashboardusr";
	}
	
	@GetMapping("/dashboard/eduad")
	public String goEduadDashboard() {
		return "dashboard/dashboardeduad";
	}
	
	@GetMapping("/insttn")
	public String goMainInsttn() {
		return "insttn/maininsttn";
	}
}
