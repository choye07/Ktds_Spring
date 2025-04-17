package com.learn.bbs.pltad.crsinf.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.pltad.crsinf.dao.CrsInfDao;
import com.learn.bbs.pltad.crsinf.service.CrsInfService;

/**
 * @author 최예진
 * 강좌 정보
 */
@Service
public class CrsInfServiceImpl implements CrsInfService {

    @Autowired
    private CrsInfDao crsInfDao;

}