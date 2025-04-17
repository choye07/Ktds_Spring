package com.learn.bbs.crs.apphstr.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.crs.apphstr.dao.AppHstrDao;

/**
 * @author 최예진
 * 신청 내역
 */
@Repository
public class AppHstrDaoImpl extends SqlSessionDaoSupport implements AppHstrDao {

    private final String NAME_SPACE = "com.learn.bbs.crs.apphstr.dao.impl.AppHstrDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}