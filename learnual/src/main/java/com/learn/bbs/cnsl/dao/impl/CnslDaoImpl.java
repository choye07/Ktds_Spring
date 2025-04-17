package com.learn.bbs.cnsl.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.cnsl.dao.CnslDao;

/**
 * @author 최예진
 * 상담
 */
@Repository
public class CnslDaoImpl extends SqlSessionDaoSupport implements CnslDao {

    private final String NAME_SPACE = "com.learn.bbs.cnsl.dao.impl.CnslDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}