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

import com.hello.exceptions.NotExistsException;
import com.hello.file.service.FileService;
import com.hello.file.vo.FileDowloadRequestVO;
import com.hello.file.vo.FileVO;

@Controller
public class FileController {

    @Autowired
    private FileService fileService;
    
//    /file/${BoardVO.id}/${BoardVO.fileList[0].flId}
    @GetMapping("/file/{id}/{flId}")
    public ResponseEntity<Resource> doDownloadFile(@PathVariable int id, @PathVariable int flId){
    	FileDowloadRequestVO fileDowloadRequestVO = new FileDowloadRequestVO();
    	
    	fileDowloadRequestVO.setId(id);
    	fileDowloadRequestVO.setFlId(flId);
    	
    	FileVO fileVO = this.fileService.getOneFile(fileDowloadRequestVO);
    	
    	if(fileVO ==null) {
    		throw new NotExistsException();
    	}
    	//fileVO.getobfucflpth()
    	File downloadFile = new File(fileVO.getObfsFlPth());
    	
    	//Http response 생성
    	//Header
    	//	file 이름을 전달
    	//Body
    	//	file 인스턴스를 전달
    	//header 생성
    	HttpHeaders header = new HttpHeaders();
    	header.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename="+URLEncoder.encode(fileVO.getFlNm(),Charset.defaultCharset()));
    	
    	InputStreamResource resource= null;
    	//body
    	try {
			resource = new InputStreamResource(new FileInputStream(downloadFile));
		} catch (FileNotFoundException e) {
			throw new NotExistsException();
		}
    	return ResponseEntity.ok().headers(header).contentLength(fileVO.getFlSz()).contentType(MediaType.APPLICATION_OCTET_STREAM).body(resource);
    }
}