package com.learn.bbs.crs.cncl.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.crs.cncl.dao.CnclHstrDao;
import com.learn.bbs.crs.cncl.service.CnclHstrService;


/**
 * @author 최예진
 * 취소 내역
 */
@Service
public class CnclHstrServiceImpl implements CnclHstrService {

    @Autowired
    private CnclHstrDao cnclHstrDao;

}