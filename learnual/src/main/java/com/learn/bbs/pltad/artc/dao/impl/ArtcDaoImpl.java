package com.learn.bbs.pltad.artc.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.pltad.artc.dao.ArtcDao;



/**
 * @TableName ARTC
 * @TableComment null
 * 게시판
 */
@Repository
public class ArtcDaoImpl extends SqlSessionDaoSupport implements ArtcDao {

    private final String NAME_SPACE = "com.learn.bbs.pltad.artc.dao.impl.ArtcDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}