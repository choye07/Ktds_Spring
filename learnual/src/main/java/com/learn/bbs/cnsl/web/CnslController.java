package com.learn.bbs.cnsl.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.cnsl.service.CnslService;


/**
 * @author 최예진
 * 상담
 */
@Controller
public class CnslController {

    @Autowired
    private CnslService cnslService;

}