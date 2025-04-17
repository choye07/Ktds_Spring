package com.learn.bbs.pltad.cnfr.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.pltad.cnfr.service.CnfrHstrService;


/**
 * @author 최예진
 * 확정 내역
 */
@Controller
public class CnfrHstrController {

    @Autowired
    private CnfrHstrService cnfrHstrService;

}