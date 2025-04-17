package com.learn.insttn.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.insttn.dao.InsttnDao;
import com.learn.insttn.service.InsttnService;


/**
 * @author 최예진
 * 기관(학원)
 */
@Service
public class InsttnServiceImpl implements InsttnService {

    @Autowired
    private InsttnDao insttnDao;

}