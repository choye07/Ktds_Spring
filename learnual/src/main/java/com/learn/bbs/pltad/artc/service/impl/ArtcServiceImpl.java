package com.learn.bbs.pltad.artc.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.pltad.artc.dao.ArtcDao;
import com.learn.bbs.pltad.artc.service.ArtcService;



/**
 * @TableName ARTC
 * @TableComment null
 * 게시판
 */
@Service
public class ArtcServiceImpl implements ArtcService {

    @Autowired
    private ArtcDao artcDao;

}