package com.learn.bbs.eduad.crqna.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.eduad.crqna.service.CrQnaService;


/**
 * @author 최예진
 * 강좌 QnA
 */
@Controller
public class CrQnaController {

    @Autowired
    private CrQnaService crQnaService;

}