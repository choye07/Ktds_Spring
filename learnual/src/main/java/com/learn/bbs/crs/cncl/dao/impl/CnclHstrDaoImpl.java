package com.learn.bbs.crs.cncl.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.crs.cncl.dao.CnclHstrDao;


/**
 * @author 최예진
 * 취소 내역
 */
@Repository
public class CnclHstrDaoImpl extends SqlSessionDaoSupport implements CnclHstrDao {

    private final String NAME_SPACE = "com.learn.bbs.crs.cncl.dao.impl.CnclHstrDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}