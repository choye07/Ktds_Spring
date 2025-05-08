package com.hello.file.service;

import com.hello.file.vo.FileDownloadRequestVO;
import com.hello.file.vo.FileVO;

public interface FileService {

	public FileVO getOneFile(FileDownloadRequestVO fileDownloadRequestVO);
	
}