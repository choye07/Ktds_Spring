package com.learn.bbs.file.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.file.dao.FlTypeDao;
/**
 * @author 최예진
 * 파일 타입
 */
@Repository
public class FlTypeDaoImpl extends SqlSessionDaoSupport implements FlTypeDao {

    private final String NAME_SPACE = "com.learn.bbs.file.dao.impl.FlTypeDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}