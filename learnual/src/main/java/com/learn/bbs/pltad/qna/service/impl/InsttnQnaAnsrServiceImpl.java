package com.learn.bbs.pltad.qna.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.pltad.qna.dao.InsttnQnaAnsrDao;
import com.learn.bbs.pltad.qna.service.InsttnQnaAnsrService;


/**
 * @TableName QNA_ANSR
 * @TableComment null
 * 전체 QnA 답변
 */
@Service
public class InsttnQnaAnsrServiceImpl implements InsttnQnaAnsrService {

    @Autowired
    private InsttnQnaAnsrDao insttnQnaAnsrDao;

}