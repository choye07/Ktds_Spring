package com.learn.bbs.pltad.rcrtmn.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.pltad.rcrtmn.dao.RcrtmnDao;

/**
 * @author 최예진
 * 채용 현황 관리
 */
@Repository
public class RcrtmnDaoImpl extends SqlSessionDaoSupport implements RcrtmnDao {

    private final String NAME_SPACE = "com.learn.bbs.pltad.rcrtmn.dao.impl.RcrtmnDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}