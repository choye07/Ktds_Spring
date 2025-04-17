package com.learn.bbs.pltad.rcrtmn.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.pltad.rcrtmn.service.RcrtmnService;


/**
 * @author 최예진
 * 채용 현황 관리
 */
@Controller
public class RcrtmnController {

    @Autowired
    private RcrtmnService rcrtmnService;

}