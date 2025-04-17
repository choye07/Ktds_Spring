package com.learn.bbs.attd.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.attd.dao.AttdDao;


/**
 * @author 최예진
 * 신청 내역
 */
@Repository
public class AttdDaoImpl extends SqlSessionDaoSupport implements AttdDao {

    private final String NAME_SPACE = "com.learn.bbs.attd.dao.impl.AttdDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}