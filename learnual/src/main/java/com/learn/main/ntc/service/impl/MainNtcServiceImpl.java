package com.learn.main.ntc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.main.ntc.dao.MainNtcDao;
import com.learn.main.ntc.service.MainNtcService;


/**
 * @TableName NTC
 * @TableComment null
 * 러뉴얼 공지사항 
 */
@Service
public class MainNtcServiceImpl implements MainNtcService {

    @Autowired
    private MainNtcDao mainNtcDao;

}