package com.learn.bbs.eduad.crntc.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.eduad.crntc.service.CrNtcService;


/**
 * @author 최예진
 *  강좌 공지사항
 */
@Controller
public class CrNtcController {

    @Autowired
    private CrNtcService crNtcService;

}