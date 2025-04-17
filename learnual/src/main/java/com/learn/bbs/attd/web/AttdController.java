package com.learn.bbs.attd.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.attd.service.AttdService;


/**
 * @author 최예진
 * 신청 내역
 */
@Controller
public class AttdController {

    @Autowired
    private AttdService attdService;

}