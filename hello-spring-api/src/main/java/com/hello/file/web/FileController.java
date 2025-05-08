package com.hello.file.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URLEncoder;
import java.nio.charset.Charset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.hello.exceptions.ApiException;
import com.hello.file.service.FileService;
import com.hello.file.vo.FileDownloadRequestVO;
import com.hello.file.vo.FileVO;

@Controller
public class FileController {

    @Autowired
    private FileService fileService;

    // /file/${boardVO.id}/${boardVO.fileList[0].flId}
    @GetMapping("/file/{id}/{flId}")
    public ResponseEntity<Resource> doDownloadFile(
    		@PathVariable int id, @PathVariable int flId) {
    	
    	FileDownloadRequestVO fileDownloadRequestVO = new FileDownloadRequestVO();
    	fileDownloadRequestVO.setFlId(flId);
    	fileDownloadRequestVO.setId(id);
    	
    	FileVO fileVO = this.fileService.getOneFile(fileDownloadRequestVO);
    	if (fileVO == null) {
    		throw new ApiException("존재하지 않는 파일입니다.");
    	}
    	
    	
    	// fileVO.getObfsFlPth() 를 File 인스턴스로 만들어서 다운로드.
    	File downloadFile = new File(fileVO.getObfsFlPth());
    	
    	// Http Response 생성.
    	// HEADER
    	//		File 이름을 전달.
    	// BODY
    	//		File 인스턴스를 전달.
    	
    	// Header 생성.
    	HttpHeaders header = new HttpHeaders();
    	header.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" +  URLEncoder.encode(fileVO.getFlNm(), Charset.defaultCharset()) );
    	
    	InputStreamResource resource = null;
    	try {
			resource = new InputStreamResource( new FileInputStream(downloadFile) );
		} catch (FileNotFoundException e) {
			throw new ApiException("존재하지 않는 파일입니다.");
		}
    	
    	// Body를 만들어서 다운로드 시키기.
    	return ResponseEntity.ok()
    						.headers(header)
    						.contentLength(fileVO.getFlSz())
    						.contentType(MediaType.APPLICATION_OCTET_STREAM)
    						.body(resource);
    }
    
}






