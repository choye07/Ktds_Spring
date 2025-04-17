package com.learn.bbs.pltad.qna.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.pltad.qna.dao.InsttnQnaDao;
import com.learn.bbs.pltad.qna.service.InsttnQnaService;


/**
 * @TableName QNA
 * @TableComment null
 * 전체 QnA
 */
@Service
public class InsttnQnaServiceImpl implements InsttnQnaService {

    @Autowired
    private InsttnQnaDao insttnQnaDao;

}