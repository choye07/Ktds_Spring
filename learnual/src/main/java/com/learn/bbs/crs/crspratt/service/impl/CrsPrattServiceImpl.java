package com.learn.bbs.crs.crspratt.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.crs.crspratt.dao.CrsPrattDao;
import com.learn.bbs.crs.crspratt.service.CrsPrattService;

/**
 * @author 최예진
 * 수강이력
 */
@Service
public class CrsPrattServiceImpl implements CrsPrattService {

    @Autowired
    private CrsPrattDao crsPrattDao;

}