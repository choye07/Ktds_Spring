package com.ktdsuniversity.edu.cyj.bbs.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloBootController {
	
	public HelloBootController() {
		System.out.println("Hello Boot Controller Instance.");
	}
	
//	@GetMapping("/hello")
//	public ResponseEntity<String> hello(){
//		return new ResponseEntity<>("Hello Boot Controller",HttpStatus.OK);
//	} 
	
	@GetMapping("/jspp")
	public String hello(Model model) {
		
		//View에 Model을 추가해보자
		model.addAttribute("app_name", "Hello Boot!");
		return "helloboot";
	}


}
