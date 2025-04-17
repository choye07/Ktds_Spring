package com.learn.bbs.pltad.instr.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.pltad.instr.dao.PrattDao;
import com.learn.bbs.pltad.instr.service.PrattService;


/**
 * @TableName PRATT
 * @TableComment null
 * 강사 이력
 */
@Service
public class PrattServiceImpl implements PrattService {

    @Autowired
    private PrattDao prattDao;

}