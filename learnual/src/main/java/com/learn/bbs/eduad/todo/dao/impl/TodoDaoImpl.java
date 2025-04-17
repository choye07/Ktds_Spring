package com.learn.bbs.eduad.todo.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.eduad.todo.dao.TodoDao;


/**
 * @author 최예진
 * 투두리스트
 */
@Repository
public class TodoDaoImpl extends SqlSessionDaoSupport implements TodoDao {

    private final String NAME_SPACE = "com.learn.bbs.eduad.todo.dao.impl.TodoDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}