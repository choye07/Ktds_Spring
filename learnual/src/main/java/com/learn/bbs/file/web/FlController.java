package com.learn.bbs.file.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.file.service.FlService;


/**
 * @author 최예진
 * 파일
 */
@Controller
public class FlController {

    @Autowired
    private FlService flService;

}