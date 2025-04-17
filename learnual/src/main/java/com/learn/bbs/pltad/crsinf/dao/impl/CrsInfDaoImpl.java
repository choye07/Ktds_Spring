package com.learn.bbs.pltad.crsinf.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.pltad.crsinf.dao.CrsInfDao;


/**
 * @TableName CRS_INF
 * @TableComment null
 * 강좌 정보
 */
@Repository
public class CrsInfDaoImpl extends SqlSessionDaoSupport implements CrsInfDao {

    private final String NAME_SPACE = "com.learn.bbs.pltad.crsinf.dao.impl.CrsInfDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}