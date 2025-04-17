package com.learn.bbs.pltad.instr.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.pltad.instr.dao.InstrDao;


/**
 * @TableName INSTR
 * @TableComment null
 * 강사
 */
@Repository
public class InstrDaoImpl extends SqlSessionDaoSupport implements InstrDao {

    private final String NAME_SPACE = "com.learn.bbs.pltad.instr.dao.impl.InstrDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}