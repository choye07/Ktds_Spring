package com.learn.bbs.pltad.crssbj.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.pltad.crssbj.service.CrsSbjService;


/**
 * @TableName CRS_SBJ
 * @TableComment null
 * 강좌 과목
 */
@Controller
public class CrsSbjController {

    @Autowired
    private CrsSbjService crsSbjService;

}