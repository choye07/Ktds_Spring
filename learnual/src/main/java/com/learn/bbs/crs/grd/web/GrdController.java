package com.learn.bbs.crs.grd.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.crs.grd.service.GrdService;


/**
 * @author 최예진
 * 성적
 */
@Controller
public class GrdController {

    @Autowired
    private GrdService grdService;

}