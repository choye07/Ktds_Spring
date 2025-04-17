package com.learn.bbs.crs.crspratt.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.crs.crspratt.dao.CrsPrattDao;


/**
 * @author 최예진
 * 수강이력
 */
@Repository
public class CrsPrattDaoImpl extends SqlSessionDaoSupport implements CrsPrattDao {

    private final String NAME_SPACE = "com.learn.bbs.crs.crspratt.dao.impl.CrsPrattDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}