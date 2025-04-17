package com.learn.insttn.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.insttn.dao.InsttnDao;


/**
 * @author 최예진
 * 기관(학원)
 */
@Repository
public class InsttnDaoImpl extends SqlSessionDaoSupport implements InsttnDao {

    private final String NAME_SPACE = "com.learn.insttn.dao.impl.InsttnDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}