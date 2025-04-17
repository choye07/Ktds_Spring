package com.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HelloBootController {

	private static final Logger LOGGER = LoggerFactory.getLogger(HelloBootController.class);

	public HelloBootController() {
		LOGGER.info("Hello Boot Controller Instance ");
	}

	@GetMapping("/hello")
	// 메소드에 파라미터에 우리가 받아올 Model 정보를 넣어준다.
	public String hello(Model model) {
		// View 에 Model 을 추가해보자.
		model.addAttribute("app_name", "Hello Boot"); // 이렇게 넣어만 주면 핸들러 어댑터가 알아서 가져옴.

		return "helloboot";
	}

}
