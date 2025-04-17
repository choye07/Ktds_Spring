package com.learn.bbs.pltad.qna.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.pltad.qna.service.InsttnQnaService;


/**
 * @TableName QNA
 * @TableComment null
 * 전체 QnA
 */
@Controller
public class InsttnQnaController {

    @Autowired
    private InsttnQnaService insttnQnaService;

}