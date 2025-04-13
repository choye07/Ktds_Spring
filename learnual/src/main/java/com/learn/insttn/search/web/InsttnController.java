package com.learn.insttn.search.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/learnaul") // 자동으로앞에 붙이고 시작
public class InsttnController {

	@GetMapping("/main")
	public String viewMemberRegistPage() {

		return "learnaul/home";

	}
}
