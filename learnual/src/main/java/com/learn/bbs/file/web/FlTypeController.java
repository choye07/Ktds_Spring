package com.learn.bbs.file.web;

import org.springframework.stereotype.Controller;

import com.learn.bbs.file.service.FlTypeService;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author 최예진
 * 파일 타입
 */
@Controller
public class FlTypeController {

    @Autowired
    private FlTypeService flTypeService;

}