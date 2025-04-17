package com.learn.bbs.crs.grd.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.crs.grd.dao.GrdDao;
import com.learn.bbs.crs.grd.service.GrdService;


/**
 * @author 최예진
 * 성적
 */
@Service
public class GrdServiceImpl implements GrdService {

    @Autowired
    private GrdDao grdDao;

}