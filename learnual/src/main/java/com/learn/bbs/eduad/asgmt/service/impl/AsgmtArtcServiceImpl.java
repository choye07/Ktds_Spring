package com.learn.bbs.eduad.asgmt.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.eduad.asgmt.dao.AsgmtArtcDao;
import com.learn.bbs.eduad.asgmt.service.AsgmtArtcService;


/**
 * @author 최예진
 * 과제 게시판
 */
@Service
public class AsgmtArtcServiceImpl implements AsgmtArtcService {

    @Autowired
    private AsgmtArtcDao asgmtArtcDao;

}