package com.learn.main.temp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LearnualTempController {
	
	@GetMapping("/test/view1")
	public String viewTest1() {
		return "/bbs/super/mainsuper";
	}
	
	@GetMapping("/test/view2")
	public String viewTest2() {
		return "/bbs/pltad/managepltad";
	}
	
	@GetMapping("/test/view3")
	public String viewTest3() {
		return "/bbs/eduad/manageeduad";
	}
	
}
