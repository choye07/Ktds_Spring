package com.hello.file.service.impl;

import org.springframework.stereotype.Service;
import com.hello.file.web.FileController;
import org.springframework.beans.factory.annotation.Autowired;

import com.hello.file.dao.FileDao;
import com.hello.file.service.FileService;
import com.hello.file.vo.FileDowloadRequestVO;
import com.hello.file.vo.FileVO;

@Service
public class FileServiceImpl implements FileService {


    @Autowired
    private FileDao fileDao;

	@Override
	public FileVO getOneFile(FileDowloadRequestVO fileDownloadRequestVO) {
		return this.fileDao.selectOneFile(fileDownloadRequestVO);
	}

}