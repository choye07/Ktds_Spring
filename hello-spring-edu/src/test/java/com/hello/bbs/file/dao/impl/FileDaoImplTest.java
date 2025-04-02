package com.hello.bbs.file.dao.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.context.annotation.Import;

import com.hello.file.dao.FileDao;
import com.hello.file.dao.impl.FileDaoImpl;
import com.hello.file.vo.FileVO;

@MybatisTest
//실제 SQL을 테스트 해야하는 환경
//MyBatis 전용의 테스트 데이터 베이스는 쓰지말고
//application.yml에 실제 데이터베이스를 대상으로 테스트 하겠다!를 정의하는 설정
@AutoConfigureTestDatabase(replace = Replace.NONE)
//BoardDaoImpl 의 테스트용 Spring Bean이 만들어진다. (Mybatis 설정이 완료된 Bean)
@Import(FileDaoImpl.class)
public class FileDaoImplTest {

	@Autowired
	private FileDao fileDao;

	@Test
	public void insertTest() {
		FileVO fileVO = new FileVO();
		fileVO.setId(1);
		fileVO.setFlId(22);
		fileVO.setFlNm("TestFile");
		fileVO.setFlSz(100000);
		fileVO.setObfsFlNm("sdfsd");
		fileVO.setObfsFlPth("fajsdlf");
		
		int insertedCount = this.fileDao.insertNewFile(fileVO);
		Assertions.assertTrue(insertedCount==1);
	}
	
}
