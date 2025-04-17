package com.learn.bbs.eduad.todo.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.eduad.todo.dao.TodoDao;
import com.learn.bbs.eduad.todo.service.TodoService;


/**
 * @author 최예진
 * 투두리스트
 */
@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoDao todoDao;

}