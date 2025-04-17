package com.learn.bbs.eduad.flarch.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.eduad.flarch.dao.FlArchDao;


/**
 * @author 최예진
 * 자료실
 */
@Repository
public class FlArchDaoImpl extends SqlSessionDaoSupport implements FlArchDao {

    private final String NAME_SPACE = "com.learn.bbs.eduad.flarch.dao.impl.FlArchDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}