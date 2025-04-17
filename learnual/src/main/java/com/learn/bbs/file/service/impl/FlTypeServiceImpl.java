package com.learn.bbs.file.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.file.dao.FlTypeDao;
import com.learn.bbs.file.service.FlTypeService;


/**
 * @author 최예진
 * 파일 타입
 */
@Service
public class FlTypeServiceImpl implements FlTypeService {

    @Autowired
    private FlTypeDao flTypeDao;

}