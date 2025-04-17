package com.learn.bbs.crs.sbj.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.crs.sbj.dao.SbjDao;


/**
 * @author 최예진
 * 과목 
 */
@Repository
public class SbjDaoImpl extends SqlSessionDaoSupport implements SbjDao {

    private final String NAME_SPACE = "com.learn.bbs.crs.sbj.dao.impl.SbjDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}