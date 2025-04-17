package com.learn.main.ntc.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.main.ntc.dao.MainNtcDao;


/**
 * @author 최예진
 * 러뉴얼 공지사항 
 */
@Repository
public class MainNtcDaoImpl extends SqlSessionDaoSupport implements MainNtcDao {

    private final String NAME_SPACE = "com.learn.main.ntc.dao.impl.MainNtcDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}