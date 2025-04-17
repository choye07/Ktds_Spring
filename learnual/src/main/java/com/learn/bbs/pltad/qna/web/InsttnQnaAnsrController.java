package com.learn.bbs.pltad.qna.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.pltad.qna.service.InsttnQnaAnsrService;


/**
 * @TableName QNA_ANSR
 * @TableComment null
 * 전체 QnA 답변
 */
@Controller
public class InsttnQnaAnsrController {

    @Autowired
    private InsttnQnaAnsrService insttnQnaAnsrService;

}