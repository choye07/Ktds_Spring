package com.learn.bbs.pltad.instr.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.pltad.instr.service.InstrService;


/**
 * @TableName INSTR
 * @TableComment null
 * 강사
 */
@Controller
public class InstrController {

    @Autowired
    private InstrService instrService;

}