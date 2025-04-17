package com.learn.bbs.pltad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.bbs.pltad.dao.PltadDao;
import com.learn.bbs.pltad.service.PltadService;

@Service
public class PltadServiceImpl implements PltadService{

	@Autowired
	private PltadDao platDao;
}
