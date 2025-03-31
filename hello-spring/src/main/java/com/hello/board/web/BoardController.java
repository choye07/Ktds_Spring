package com.hello.board.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.hello.board.service.BoardService;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

}