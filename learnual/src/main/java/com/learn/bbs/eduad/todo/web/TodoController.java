package com.learn.bbs.eduad.todo.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.eduad.todo.service.TodoService;


/**
 * @author 최예진
 * 투두리스트
 */
@Controller
public class TodoController {

    @Autowired
    private TodoService todoService;

}