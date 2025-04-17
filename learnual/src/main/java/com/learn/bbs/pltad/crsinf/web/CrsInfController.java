package com.learn.bbs.pltad.crsinf.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.pltad.crsinf.service.CrsInfService;


/**
 * @author 최예진
 * 강좌 정보
 */
@Controller
public class CrsInfController {

    @Autowired
    private CrsInfService crsInfService;

}