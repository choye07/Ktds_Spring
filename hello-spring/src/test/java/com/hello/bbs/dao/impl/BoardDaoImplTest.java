package com.hello.bbs.dao.impl;


import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.context.annotation.Import;

import com.hello.board.dao.BoardDao;
import com.hello.board.dao.impl.BoardDaoImpl;
import com.hello.board.vo.BoardVO;

@MybatisTest
//실제 SQL을 테스트 해야하는 환경
//MyBatis 전용의 테스트 데이터 베이스는 쓰지말고
//application.yml에 실제 데이터베이스를 대상으로 테스트 하겠다!를 정의하는 설정
@AutoConfigureTestDatabase(replace = Replace.NONE)
//BoardDaoImpl 의 테스트용 Spring Bean이 만들어진다. (Mybatis 설정이 완료된 Bean)
@Import(BoardDaoImpl.class)
public class BoardDaoImplTest {

	@Autowired
	private BoardDao boardDaoImpl;

	@Test
	public void testCount() {
		int count = boardDaoImpl.selectBoardAllCount();
		int correctCount = 2;
		// 두개가 같으면 성공
		// 다르면 실패
		Assertions.assertEquals(count, correctCount);
	}
	@Test
	public void testSelect() {
		List<BoardVO> boardlist = boardDaoImpl.selectAllBoard();
		int size = boardlist.size();
		int correctCount=2;
		Assertions.assertEquals(size, correctCount);
	}
}
