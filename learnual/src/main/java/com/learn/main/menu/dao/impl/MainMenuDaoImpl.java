package com.learn.main.menu.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.main.menu.dao.MainMenuDao;


/**
 * @TableName MENU
 * @TableComment null
 * 메뉴
 */
@Repository
public class MainMenuDaoImpl extends SqlSessionDaoSupport implements MainMenuDao {

    private final String NAME_SPACE = "com.learn.main.menu.dao.impl.MainMenuDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }


}