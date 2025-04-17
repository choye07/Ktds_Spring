package com.learn.bbs.eduad.asgmt.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.eduad.asgmt.dao.AsgmtArtcDao;


/**
 * @author 최예진
 * 과제 게시판
 */
@Repository
public class AsgmtArtcDaoImpl extends SqlSessionDaoSupport implements AsgmtArtcDao {

    private final String NAME_SPACE = "com.learn.bbs.eduad.asgmt.dao.impl.AsgmtArtcDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}