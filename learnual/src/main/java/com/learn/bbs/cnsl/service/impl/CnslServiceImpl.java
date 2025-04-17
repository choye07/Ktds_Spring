package com.learn.bbs.cnsl.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.cnsl.dao.CnslDao;
import com.learn.bbs.cnsl.service.CnslService;
/**
 * @author 최예진
 * 상담
 */
@Service
public class CnslServiceImpl implements CnslService {

    @Autowired
    private CnslDao cnslDao;

}