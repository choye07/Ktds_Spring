package com.learn.bbs.eduad.crclm.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.eduad.crclm.service.CrclmService;



/**
 * @author 최예진
 * 커리큘럼
 */
@Controller
public class CrclmController {

    @Autowired
    private CrclmService crclmService;

}