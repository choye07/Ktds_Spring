package com.learn.bbs.attd.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.attd.dao.AttdDao;
import com.learn.bbs.attd.service.AttdService;


/**
 * @author 최예진
 * 신청 내역
 */
@Service
public class AttdServiceImpl implements AttdService {

    @Autowired
    private AttdDao attdDao;

}