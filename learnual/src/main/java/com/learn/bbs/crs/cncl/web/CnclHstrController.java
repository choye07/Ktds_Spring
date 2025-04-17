package com.learn.bbs.crs.cncl.web;

import org.springframework.stereotype.Controller;

import com.learn.bbs.crs.cncl.service.CnclHstrService;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author 최예진
 * 취소 내역
 */
@Controller
public class CnclHstrController {

    @Autowired
    private CnclHstrService cnclHstrService;

}