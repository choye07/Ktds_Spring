package com.learn.bbs.crs.grd.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.crs.grd.dao.GrdDao;


/**
 * @author 최예진
 * 성적
 */
@Repository
public class GrdDaoImpl extends SqlSessionDaoSupport implements GrdDao {

    private final String NAME_SPACE = "com.learn.bbs.crs.grd.dao.impl.GrdDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}