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
import com.hello.board.vo.BoardWriteRequestVO;

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
<<<<<<< HEAD:hello-spring-edu/src/test/java/com/hello/bbs/dao/impl/BoardDaoImplTest.java
		int correctCount = 3;
=======
		int correctCount =0;
>>>>>>> 369d473 (hello-spring 프로젝트 업로드):hello-spring/src/test/java/com/hello/bbs/dao/impl/BoardDaoImplTest.java
		// 두개가 같으면 성공
		// 다르면 실패
		
		Assertions.assertTrue(count>0);
//		Assertions.assertEquals(count, correctCount);
	}

	@Test
	public void testSelect() {
		List<BoardVO> boardlist = boardDaoImpl.selectAllBoard();
		int size = boardlist.size();
<<<<<<< HEAD:hello-spring-edu/src/test/java/com/hello/bbs/dao/impl/BoardDaoImplTest.java
//		int correctCount = 3;
		Assertions.assertTrue(size>0);
//		Assertions.assertEquals(size, correctCount);
	}

	@Test
	public void testInsert() {
		BoardWriteRequestVO testVO = new BoardWriteRequestVO();
		testVO.setSubject("testsubject");
		testVO.setContent("testcontent");
		testVO.setContent("testemail");

		int count = boardDaoImpl.insertNewBoard(testVO);
		Assertions.assertEquals(count, 1);

	}
	@Test
	public void testSelectOne() {
		BoardVO boardVO =this.boardDaoImpl.selectOneBoard(2);
		
		Assertions.assertNotNull(boardVO);
	}
	
	@Test
	public void testUpdateViewCount() {
		int updateCount = this.boardDaoImpl.updateViewCountBy(3);
		System.out.println(updateCount);
		Assertions.assertTrue(updateCount>0);
	}
	
	@Test
	public void testDelete() {
		int deleteCount = this.boardDaoImpl.deleteOneBoard(65);
		Assertions.assertTrue(deleteCount>0);
	}
	
	@Test
	public void testDeleteFail() {
		int deleteCount = this.boardDaoImpl.deleteOneBoard(1);
		Assertions.assertTrue(deleteCount==0);
=======
		int correctCount=0;
		Assertions.assertEquals(size, correctCount);
>>>>>>> 369d473 (hello-spring 프로젝트 업로드):hello-spring/src/test/java/com/hello/bbs/dao/impl/BoardDaoImplTest.java
	}
}
