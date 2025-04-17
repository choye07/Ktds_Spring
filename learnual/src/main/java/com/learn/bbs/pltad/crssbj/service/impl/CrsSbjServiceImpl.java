package com.learn.bbs.pltad.crssbj.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.pltad.crssbj.dao.CrsSbjDao;
import com.learn.bbs.pltad.crssbj.service.CrsSbjService;


/**
 * @TableName CRS_SBJ
 * @TableComment null
 * 강좌 과목
 */
@Service
public class CrsSbjServiceImpl implements CrsSbjService {

    @Autowired
    private CrsSbjDao crsSbjDao;

}