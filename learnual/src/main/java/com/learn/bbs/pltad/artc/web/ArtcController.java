package com.learn.bbs.pltad.artc.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.pltad.artc.service.ArtcService;



/**
 * @TableName ARTC
 * @TableComment null
 * 게시판
 */
@Controller
public class ArtcController {

    @Autowired
    private ArtcService artcService;

}