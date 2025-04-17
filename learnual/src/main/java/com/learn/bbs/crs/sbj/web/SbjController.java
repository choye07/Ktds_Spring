package com.learn.bbs.crs.sbj.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.crs.sbj.service.SbjService;


/**
 * @author 최예진
 * 과목 
 */
@Controller
public class SbjController {

    @Autowired
    private SbjService sbjService;

}