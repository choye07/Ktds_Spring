package com.learn.bbs.pltad.cmcd.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.pltad.cmcd.dao.CmcdDao;
import com.learn.bbs.pltad.cmcd.service.CmcdService;


/**
 * @TableName CM_CODE
 * @TableComment null
 * 공통 코드
 */
@Service
public class CmcdServiceImpl implements CmcdService {

    @Autowired
    private CmcdDao cmcdDao;

}