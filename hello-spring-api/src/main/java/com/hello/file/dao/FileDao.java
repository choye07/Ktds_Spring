package com.hello.file.dao;

import com.hello.file.vo.FileDownloadRequestVO;
import com.hello.file.vo.FileVO;

public interface FileDao {

	public int insertNewFile(FileVO fileVO);
	
	public FileVO selectOneFile(FileDownloadRequestVO fileDownloadRequestVO);
	
}