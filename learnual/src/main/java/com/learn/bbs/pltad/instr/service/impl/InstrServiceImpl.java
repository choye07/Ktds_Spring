package com.learn.bbs.pltad.instr.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.pltad.instr.dao.InstrDao;
import com.learn.bbs.pltad.instr.service.InstrService;

/**
 * @TableName INSTR
 * @TableComment null
 * 강사
 */
@Service
public class InstrServiceImpl implements InstrService {

    @Autowired
    private InstrDao instrDao;

}