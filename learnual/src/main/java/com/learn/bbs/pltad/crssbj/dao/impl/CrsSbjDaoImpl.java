package com.learn.bbs.pltad.crssbj.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.pltad.crssbj.dao.CrsSbjDao;


/**
 * @TableName CRS_SBJ
 * @TableComment null
 * 강좌 과목
 */
@Repository
public class CrsSbjDaoImpl extends SqlSessionDaoSupport implements CrsSbjDao {

    private final String NAME_SPACE = "com.learn.bbs.pltad.crssbj.dao.impl.CrsSbjDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}