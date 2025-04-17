package com.learn.bbs.eduad.crclm.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.eduad.crclm.dao.CrclmDao;
import com.learn.bbs.eduad.crclm.service.CrclmService;



/**
 * @author 최예진
 * 커리큘럼
 */
@Service
public class CrclmServiceImpl implements CrclmService {

    @Autowired
    private CrclmDao crclmDao;

}