package com.learn.bbs.eduad.crqnaansr.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.eduad.crqnaansr.dao.CrQnaAnsrDao;


/**
 * @author 최예진
 * 강좌 QnA 답변
 */
@Repository
public class CrQnaAnsrDaoImpl extends SqlSessionDaoSupport implements CrQnaAnsrDao {

    private final String NAME_SPACE = "com.learn.bbs.eduad.crqnaansr.dao.impl.CrQnaAnsrDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}