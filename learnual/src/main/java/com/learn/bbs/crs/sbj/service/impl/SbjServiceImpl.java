package com.learn.bbs.crs.sbj.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.crs.sbj.dao.SbjDao;
import com.learn.bbs.crs.sbj.service.SbjService;


/**
 * @author 최예진
 * 과목 
 */
@Service
public class SbjServiceImpl implements SbjService {

    @Autowired
    private SbjDao sbjDao;

}