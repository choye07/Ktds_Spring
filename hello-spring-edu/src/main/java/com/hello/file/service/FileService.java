package com.hello.file.service;

import com.hello.file.vo.FileDowloadRequestVO;
import com.hello.file.vo.FileVO;

public interface FileService {

	public FileVO getOneFile(FileDowloadRequestVO fileDownloadRequestVO);
}