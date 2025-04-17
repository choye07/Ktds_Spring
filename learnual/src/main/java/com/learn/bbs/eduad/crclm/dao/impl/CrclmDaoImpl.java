package com.learn.bbs.eduad.crclm.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.eduad.crclm.dao.CrclmDao;


/**
 * @author 최예진
 * 커리큘럼
 */
@Repository
public class CrclmDaoImpl extends SqlSessionDaoSupport implements CrclmDao {

    private final String NAME_SPACE = "com.learn.bbs.eduad.crclm.dao.impl.CrclmDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}