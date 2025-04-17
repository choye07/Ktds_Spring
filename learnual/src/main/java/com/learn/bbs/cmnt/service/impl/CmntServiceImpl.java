package com.learn.bbs.cmnt.service.impl;

import org.springframework.stereotype.Service;

import com.learn.bbs.cmnt.dao.CmntDao;
import com.learn.bbs.cmnt.service.CmntService;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author 최예진
 * 댓글
 */
@Service
public class CmntServiceImpl implements CmntService {

    @Autowired
    private CmntDao cmntDao;

}