package com.learn.bbs.tst.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.tst.dao.TstDao;


/**
 * @author 최예진
 * 시험
 */
@Repository
public class TstDaoImpl extends SqlSessionDaoSupport implements TstDao {

    private final String NAME_SPACE = "com.learn.bbs.tst.dao.impl.TstDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}