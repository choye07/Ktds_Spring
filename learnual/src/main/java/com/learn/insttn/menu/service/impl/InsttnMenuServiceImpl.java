package com.learn.insttn.menu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.insttn.menu.dao.InsttnMenuDao;
import com.learn.insttn.menu.service.InsttnMenuService;



/**
 * @TableName MENU
 * @TableComment null
 * 학원 메뉴
 */
@Service
public class InsttnMenuServiceImpl implements InsttnMenuService {

    @Autowired
    private InsttnMenuDao insttnMenuDao;

}