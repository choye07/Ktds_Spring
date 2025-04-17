package com.learn.bbs.crs.apphstr.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.crs.apphstr.dao.AppHstrDao;
import com.learn.bbs.crs.apphstr.service.AppHstrService;


/**
 * @author 최예진
 * 신청 내역
 */
@Service
public class AppHstrServiceImpl implements AppHstrService {

    @Autowired
    private AppHstrDao appHstrDao;

}