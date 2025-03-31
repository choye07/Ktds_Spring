package com.hello.member.web;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

import com.hello.member.service.MemberService;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

}