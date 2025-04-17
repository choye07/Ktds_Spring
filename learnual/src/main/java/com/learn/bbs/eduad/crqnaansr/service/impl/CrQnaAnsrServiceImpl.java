package com.learn.bbs.eduad.crqnaansr.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.eduad.crqnaansr.dao.CrQnaAnsrDao;
import com.learn.bbs.eduad.crqnaansr.service.CrQnaAnsrService;


/**
 * @author 최예진
 * 강좌 QnA 답변
 */
@Service
public class CrQnaAnsrServiceImpl implements CrQnaAnsrService {

    @Autowired
    private CrQnaAnsrDao crQnaAnsrDao;

}