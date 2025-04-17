package com.learn.main.ntc.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.main.ntc.service.MainNtcService;


/**
 * @author 최예진
 * 러뉴얼 공지사항 
 */
@Controller
public class MainNtcController {

    @Autowired
    private MainNtcService mainNtcService;

}