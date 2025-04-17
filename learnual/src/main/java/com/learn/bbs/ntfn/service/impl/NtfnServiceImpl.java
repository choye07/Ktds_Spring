package com.learn.bbs.ntfn.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.ntfn.dao.NtfnDao;
import com.learn.bbs.ntfn.service.NtfnService;


/**
 * @author 최예진
 * 알림
 */
@Service
public class NtfnServiceImpl implements NtfnService {

    @Autowired
    private NtfnDao ntfnDao;

}