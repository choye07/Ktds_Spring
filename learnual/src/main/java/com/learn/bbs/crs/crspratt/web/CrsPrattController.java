package com.learn.bbs.crs.crspratt.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.crs.crspratt.service.CrsPrattService;


/**
 * @author 최예진
 * 수강이력
 */
@Controller
public class CrsPrattController {

    @Autowired
    private CrsPrattService crsPrattService;

}