package com.learn.bbs.pltad.cmcd.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.pltad.cmcd.dao.CmcdDao;


/**
 * @TableName CM_CODE
 * @TableComment null
 * 공통 코드
 */
@Repository
public class CmcdDaoImpl extends SqlSessionDaoSupport implements CmcdDao {

    private final String NAME_SPACE = "com.learn.bbs.pltad.cmcd.dao.impl.CmcdDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}