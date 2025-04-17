package com.learn.bbs.pltad.instr.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.pltad.instr.dao.InstrCrrDao;
import com.learn.bbs.pltad.instr.service.InstrCrrService;


/**
 * @TableName CRR
 * @TableComment null
 * 강사 경력
 */
@Service
public class InstrCrrServiceImpl implements InstrCrrService {

    @Autowired
    private InstrCrrDao instrCrrDao;

}