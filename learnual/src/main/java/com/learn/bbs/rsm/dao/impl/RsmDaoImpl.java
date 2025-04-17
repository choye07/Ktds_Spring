package com.learn.bbs.rsm.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.rsm.dao.RsmDao;


/**
 * @author 최예진
 * 이력서
 */
@Repository
public class RsmDaoImpl extends SqlSessionDaoSupport implements RsmDao {

    private final String NAME_SPACE = "com.learn.bbs.rsm.dao.impl.RsmDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}