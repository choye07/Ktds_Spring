package com.learn.main.menu.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.main.menu.service.MainMenuService;

/**
 * @TableName MENU
 * @TableComment null
 * 메뉴
 */
@Controller
public class MainMenuController {

    @Autowired
    private MainMenuService mainMenuService;

}