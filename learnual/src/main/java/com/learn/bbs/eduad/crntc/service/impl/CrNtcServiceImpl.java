package com.learn.bbs.eduad.crntc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.eduad.crntc.dao.CrNtcDao;
import com.learn.bbs.eduad.crntc.service.CrNtcService;



/**
 * @author 최예진
 *  강좌 공지사항
 */
@Service
public class CrNtcServiceImpl implements CrNtcService {

    @Autowired
    private CrNtcDao crNtcDao;

}