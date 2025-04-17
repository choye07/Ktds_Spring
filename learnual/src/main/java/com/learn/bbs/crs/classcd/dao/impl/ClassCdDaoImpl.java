package com.learn.bbs.crs.classcd.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.crs.classcd.dao.ClassCdDao;

/**
 * @author 최예진
 * 수강코드
 */
@Repository
public class ClassCdDaoImpl extends SqlSessionDaoSupport implements ClassCdDao {

    private final String NAME_SPACE = "com.learn.bbs.crs.classcd.dao.impl.ClassCdDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}