package com.learn.bbs.pltad.instr.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.pltad.instr.service.InstrCrrService;


/**
 * @TableName CRR
 * @TableComment null
 * 강사 경력
 */
@Controller
public class InstrCrrController {

    @Autowired
    private InstrCrrService instrCrrService;

}