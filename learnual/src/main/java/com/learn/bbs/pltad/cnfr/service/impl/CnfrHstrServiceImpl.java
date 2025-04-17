package com.learn.bbs.pltad.cnfr.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.pltad.cnfr.dao.CnfrHstrDao;
import com.learn.bbs.pltad.cnfr.service.CnfrHstrService;


/**
 * @author 최예진
 * 확정 내역
 */
@Service
public class CnfrHstrServiceImpl implements CnfrHstrService {

    @Autowired
    private CnfrHstrDao cnfrHstrDao;

}