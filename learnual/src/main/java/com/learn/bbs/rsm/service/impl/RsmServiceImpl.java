package com.learn.bbs.rsm.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.rsm.dao.RsmDao;
import com.learn.bbs.rsm.service.RsmService;


/**
 * @author 최예진
 * 이력서
 */
@Service
public class RsmServiceImpl implements RsmService {

    @Autowired
    private RsmDao rsmDao;

}