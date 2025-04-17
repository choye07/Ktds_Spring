package com.learn.insttn.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.learn.insttn.service.InsttnService;

@Controller
public class InsttnController {

	@Autowired
	private InsttnService insttnService;
}
