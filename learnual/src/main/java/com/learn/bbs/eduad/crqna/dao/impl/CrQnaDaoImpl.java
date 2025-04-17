package com.learn.bbs.eduad.crqna.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.eduad.crqna.dao.CrQnaDao;


/**
 * @author 최예진
 * 강좌 QnA
 */
@Repository
public class CrQnaDaoImpl extends SqlSessionDaoSupport implements CrQnaDao {

    private final String NAME_SPACE = "com.learn.bbs.eduad.crqna.dao.impl.CrQnaDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}