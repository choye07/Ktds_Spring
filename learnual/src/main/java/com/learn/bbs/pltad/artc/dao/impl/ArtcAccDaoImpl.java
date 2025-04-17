package com.learn.bbs.pltad.artc.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.pltad.artc.dao.ArtcAccDao;


/**
 * @TableName ARTC_ACC
 * @TableComment null
 * 게시판 권한
 */
@Repository
public class ArtcAccDaoImpl extends SqlSessionDaoSupport implements ArtcAccDao {

    private final String NAME_SPACE = "com.learn.bbs.pltad.artc.dao.impl.ArtcAccDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}