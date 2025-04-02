package com.hello.file.dao;

import com.hello.file.vo.FileDowloadRequestVO;
import com.hello.file.vo.FileVO;

public interface FileDao {
	public int insertNewFile(FileVO fileVO);
	
	public FileVO selectOneFile(FileDowloadRequestVO fileDownloadRequestVO);
}