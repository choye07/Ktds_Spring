package com.learn.bbs.file.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.file.dao.FlDao;
import com.learn.bbs.file.service.FlService;


/**
 * @author 최예진
 * 파일
 */
@Service
public class FlServiceImpl implements FlService {

    @Autowired
    private FlDao fileDao;

}