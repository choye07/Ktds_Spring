package com.learn.bbs.eduad.asgmt.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.eduad.asgmt.service.AsgmtArtcService;


/**
 * @author 최예진
 * 과제 게시판
 */
@Controller
public class AsgmtArtcController {

    @Autowired
    private AsgmtArtcService asgmtArtcService;

}