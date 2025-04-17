package com.learn.bbs.pltad.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.learn.bbs.pltad.service.PltadService;

@Controller()
public class PltadController {

	@Autowired
	private PltadService pltadService;
}
