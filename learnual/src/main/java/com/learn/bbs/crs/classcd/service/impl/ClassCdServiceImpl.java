package com.learn.bbs.crs.classcd.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.crs.classcd.dao.ClassCdDao;
import com.learn.bbs.crs.classcd.service.ClassCdService;

/**
 * @author 최예진
 * 수강코드
 */
@Service
public class ClassCdServiceImpl implements ClassCdService {

    @Autowired
    private ClassCdDao classCdDao;

}