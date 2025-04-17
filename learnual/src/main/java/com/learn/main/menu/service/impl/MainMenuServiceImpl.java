package com.learn.main.menu.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.main.menu.dao.MainMenuDao;
import com.learn.main.menu.service.MainMenuService;


/**
 * @TableName MENU
 * @TableComment null
 * 메뉴
 */
@Service
public class MainMenuServiceImpl implements MainMenuService {

    @Autowired
    private MainMenuDao mainMenuDao;

}