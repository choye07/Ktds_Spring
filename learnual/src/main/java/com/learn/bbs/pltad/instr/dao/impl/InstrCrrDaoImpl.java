package com.learn.bbs.pltad.instr.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.pltad.instr.dao.InstrCrrDao;

@Repository
public class InstrCrrDaoImpl extends SqlSessionDaoSupport implements InstrCrrDao {

    private final String NAME_SPACE = "com.learn.bbs.pltad.instr.dao.impl.InstrCrrDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}