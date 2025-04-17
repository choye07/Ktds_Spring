package com.learn.bbs.tst.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.learn.bbs.tst.service.TstService;


/**
 * @author 최예진
 * 시험
 */
@Controller
public class TstController {

    @Autowired
    private TstService tstService;

    @GetMapping("/tst/list")
    public String viewTest() {
    	return "/bbs/tst/tstboardvieweduad";
    }
}