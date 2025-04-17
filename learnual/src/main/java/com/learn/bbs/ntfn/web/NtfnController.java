package com.learn.bbs.ntfn.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.ntfn.service.NtfnService;


/**
 * @author 최예진
 * 알림
 */
@Controller
public class NtfnController {

    @Autowired
    private NtfnService ntfnService;

}