package com.learn.bbs.pltad.rcrtmn.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.pltad.rcrtmn.dao.RcrtmnDao;
import com.learn.bbs.pltad.rcrtmn.service.RcrtmnService;


/**
 * @author 최예진
 * 채용 현황 관리
 */
@Service
public class RcrtmnServiceImpl implements RcrtmnService {

    @Autowired
    private RcrtmnDao rcrtmnDao;

}