package com.learn.bbs.eduad.crqna.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.eduad.crqna.dao.CrQnaDao;
import com.learn.bbs.eduad.crqna.service.CrQnaService;


/**
 * @author 최예진
 * 강좌 QnA
 */
@Service
public class CrQnaServiceImpl implements CrQnaService {

    @Autowired
    private CrQnaDao crQnaDao;

}