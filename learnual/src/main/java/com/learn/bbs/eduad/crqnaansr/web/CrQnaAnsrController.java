package com.learn.bbs.eduad.crqnaansr.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.eduad.crqnaansr.service.CrQnaAnsrService;


/**
 * @author 최예진
 * 강좌 QnA 답변
 */
@Controller
public class CrQnaAnsrController {

    @Autowired
    private CrQnaAnsrService crQnaAnsrService;

}