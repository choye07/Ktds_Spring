package com.learn.bbs.crs.classcd.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.crs.classcd.service.ClassCdService;


/**
 * @author 최예진
 * 수강코드
 */
@Controller
public class ClassCdController {

    @Autowired
    private ClassCdService classCdService;

}