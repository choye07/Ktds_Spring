package com.learn.bbs.pltad.instr.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.pltad.instr.dao.PrattDao;

/**
 * @TableName PRATT
 * @TableComment null
 * 강사 이력
 */
@Repository
public class PrattDaoImpl extends SqlSessionDaoSupport implements PrattDao {

    private final String NAME_SPACE = "com.learn.pltad.instr.dao.impl.PrattDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}