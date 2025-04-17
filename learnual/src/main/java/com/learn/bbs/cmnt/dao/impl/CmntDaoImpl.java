package com.learn.bbs.cmnt.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.cmnt.dao.CmntDao;

/**
 * @author 최예진
 * 댓글
 */
@Repository
public class CmntDaoImpl extends SqlSessionDaoSupport implements CmntDao {

    private final String NAME_SPACE = "com.learn.bbs.cmnt.dao.impl.CmntDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}