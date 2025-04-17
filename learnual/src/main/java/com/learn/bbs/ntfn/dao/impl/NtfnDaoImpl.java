package com.learn.bbs.ntfn.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.ntfn.dao.NtfnDao;


/**
 * @author 최예진
 * 알림
 */
@Repository
public class NtfnDaoImpl extends SqlSessionDaoSupport implements NtfnDao {

    private final String NAME_SPACE = "com.learn.bbs.ntfn.dao.impl.NtfnDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}