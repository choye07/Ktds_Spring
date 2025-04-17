package com.learn.insttn.menu.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.learn.insttn.menu.service.InsttnMenuService;

/**
 * @TableName MENU
 * @TableComment null
 * 학원 메뉴
 */
@Controller
public class InsttnMenuController {

    @Autowired
    private InsttnMenuService insttnMenuService;

}