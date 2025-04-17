package com.learn.bbs.cmnt.web;

import org.springframework.stereotype.Controller;

import com.learn.bbs.cmnt.service.CmntService;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 최예진
 * 댓글
 */
@Controller
public class CmntController {

    @Autowired
    private CmntService cmntService;

}