package com.learn.bbs.pltad.qna.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.pltad.qna.dao.InsttnQnaAnsrDao;

@Repository
public class InsttnQnaAnsrDaoImpl extends SqlSessionDaoSupport implements InsttnQnaAnsrDao {

    private final String NAME_SPACE = "com.learn.bbs.pltad.qna.dao.impl.InsttnQnaAnsrDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}