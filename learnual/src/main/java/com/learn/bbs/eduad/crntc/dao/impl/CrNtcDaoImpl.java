package com.learn.bbs.eduad.crntc.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.eduad.crntc.dao.CrNtcDao;



/**
 * @author 최예진
 *  강좌 공지사항
 */
@Repository
public class CrNtcDaoImpl extends SqlSessionDaoSupport implements CrNtcDao {

    private final String NAME_SPACE = "com.learn.bbs.eduad.crntc.dao.impl.CrNtcDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}