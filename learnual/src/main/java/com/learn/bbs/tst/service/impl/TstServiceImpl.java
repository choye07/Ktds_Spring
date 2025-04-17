package com.learn.bbs.tst.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.tst.dao.TstDao;
import com.learn.bbs.tst.service.TstService;


/**
 * @author 최예진
 * 시험
 */
@Service
public class TstServiceImpl implements TstService {

    @Autowired
    private TstDao tstDao;

}