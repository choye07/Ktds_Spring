package com.learn.bbs.pltad.cmcd.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.pltad.cmcd.service.CmcdService;


/**
 * @TableName CM_CODE
 * @TableComment null
 * 공통 코드
 */
@Controller
public class CmcdController {

    @Autowired
    private CmcdService cmcdService;

}