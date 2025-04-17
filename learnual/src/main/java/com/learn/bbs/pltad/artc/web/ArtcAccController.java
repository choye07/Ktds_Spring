package com.learn.bbs.pltad.artc.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.pltad.artc.service.ArtcAccService;


/**
 * @TableName ARTC_ACC
 * @TableComment null
 * 게시판 권한
 */
@Controller
public class ArtcAccController {

    @Autowired
    private ArtcAccService artcAccService;

}