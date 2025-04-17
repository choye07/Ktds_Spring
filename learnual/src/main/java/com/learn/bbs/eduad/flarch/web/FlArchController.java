package com.learn.bbs.eduad.flarch.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.eduad.flarch.service.FlArchService;


/**
 * @author 최예진
 * 자료실
 */
@Controller
public class FlArchController {

    @Autowired
    private FlArchService flArchService;

}