package com.learn.bbs.crs.apphstr.web;

import org.springframework.stereotype.Controller;

import com.learn.bbs.crs.apphstr.service.AppHstrService;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author 최예진
 * 신청 내역
 */
@Controller
public class AppHstrController {

    @Autowired
    private AppHstrService appHstrService;

}