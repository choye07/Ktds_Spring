package com.learn.bbs.pltad.cnfr.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.pltad.cnfr.dao.CnfrHstrDao;

/**
 * @author 최예진
 * 확정 내역
 */
@Repository
public class CnfrHstrDaoImpl extends SqlSessionDaoSupport implements CnfrHstrDao {

    private final String NAME_SPACE = "com.learn.bbs.pltad.cnfr.dao.impl.CnfrHstrDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}