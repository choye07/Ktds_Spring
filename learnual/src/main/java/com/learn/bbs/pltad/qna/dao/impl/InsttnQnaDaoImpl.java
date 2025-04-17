package com.learn.bbs.pltad.qna.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.pltad.qna.dao.InsttnQnaDao;


/**
 * @TableName QNA
 * @TableComment null
 * 전체 QnA
 */
@Repository
public class InsttnQnaDaoImpl extends SqlSessionDaoSupport implements InsttnQnaDao {

    private final String NAME_SPACE = "com.learn.bbs.pltad.qna.dao.impl.InsttnQnaDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}