package com.learn.bbs.file.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.file.dao.FlDao;

/**
 * @author 최예진
 * 파일
 */
@Repository
public class FlDaoImpl extends SqlSessionDaoSupport implements FlDao {

    private final String NAME_SPACE = "com.learn.bbs.file.dao.impl.FlDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}