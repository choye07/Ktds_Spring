package com.learn.bbs.rsm.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.rsm.service.RsmService;


/**
 * @author 최예진
 * 이력서
 */
@Controller
public class RsmController {

    @Autowired
    private RsmService rsmService;

}