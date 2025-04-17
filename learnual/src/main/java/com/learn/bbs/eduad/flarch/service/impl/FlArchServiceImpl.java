package com.learn.bbs.eduad.flarch.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.eduad.flarch.dao.FlArchDao;
import com.learn.bbs.eduad.flarch.service.FlArchService;


/**
 * @author 최예진
 * 자료실
 */
@Service
public class FlArchServiceImpl implements FlArchService {

    @Autowired
    private FlArchDao flArchDao;

}