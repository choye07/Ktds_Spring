package com.learn.bbs.pltad.artc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.pltad.artc.dao.ArtcAccDao;
import com.learn.bbs.pltad.artc.service.ArtcAccService;


/**
 * @TableName ARTC_ACC
 * @TableComment null
 * 게시판 권한
 */
@Service
public class ArtcAccServiceImpl implements ArtcAccService {

    @Autowired
    private ArtcAccDao artcAccDao;

}