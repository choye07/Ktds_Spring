package com.hello.bbs.dao.impl;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.context.annotation.Import;

import com.hello.bbs.dao.BoardDao;
import com.hello.bbs.vo.BoardDeleteRequestVO;
import com.hello.bbs.vo.BoardSearchRequestVO;
import com.hello.bbs.vo.BoardUpdateRequestVO;
import com.hello.bbs.vo.BoardVO;
import com.hello.bbs.vo.BoardWriteRequestVO;


@MybatisTest
// 실제 SQL을 테스트해야하는 환경
// MyBatis 전용의 테스트 데이터베이스는 쓰지 말고 
// application.yml에 설정된 실제 데이터베이스를 대상으로 테스트 하겠다!를 정의하는 설정.
@AutoConfigureTestDatabase(replace = Replace.NONE)
// BoardDaoImpl 의 테스트용 Spring Bean이 만들어진다. (Mybatis 설정이 완료된 Bean)
@Import({BoardDaoImpl.class})
public class BoardDaoImplTest {

	@Autowired
	private BoardDao boardDaoImpl;
	
	@Test
	public void testCount() {
		
		BoardSearchRequestVO search = new BoardSearchRequestVO();
		
		int count = boardDaoImpl.selectBoardAllCount(search);
//		int correctCount = 0;
		
		Assertions.assertTrue(count > 0);
		// 두 개가 같으면 성공
		// 다르면 실패
//		Assertions.assertEquals(count, correctCount);
	}
	
	@Test
	public void testSelect() {
		BoardSearchRequestVO search = new BoardSearchRequestVO();
		List<BoardVO> boardList = boardDaoImpl.selectBoardAll(search);
		int size = boardList.size();
//		int correctSize = 0;
		
		Assertions.assertTrue(size > 0);
//		Assertions.assertEquals(size, correctSize);
	}
	
	@Test
	public void testInsert() {
		BoardWriteRequestVO testVO = new BoardWriteRequestVO();
		testVO.setContent("testContent");
		testVO.setEmail("testEmail");
		testVO.setSubject("testSubject");
		
		int insertedCount = this.boardDaoImpl.insertNewBoard(testVO);
		Assertions.assertEquals(insertedCount, 1);
	}
	
	@Test
	public void testSelectOne() {
		// insert -> 게시글의ID -> 조회
		BoardVO boardVO = this.boardDaoImpl.selectOneBoard(15);
		Assertions.assertNotNull(boardVO);
		Assertions.assertNotNull(boardVO.getFileList());
		Assertions.assertTrue(boardVO.getFileList().size() > 0);
	}
	
	@Test
	public void testUpdateViewCount() {
		int updatedCount = this.boardDaoImpl.updateViewCountBy(4);
		Assertions.assertTrue(updatedCount == 1);
	}
	
	@Test
	public void testDeleteBoard() {
		BoardDeleteRequestVO bdrv = new BoardDeleteRequestVO();
		bdrv.setId(4);
		bdrv.setEmail("test01@gmail.com");
		int deletedCount = this.boardDaoImpl.deleteOneBoard(bdrv);
		Assertions.assertTrue(deletedCount == 1);
	}
	
	@Test
	public void testDeleteBoardFail() {
		BoardDeleteRequestVO bdrv = new BoardDeleteRequestVO();
		bdrv.setId(1_000_000_000);
		bdrv.setEmail("test01@gmail.com");
		int deletedCount = this.boardDaoImpl.deleteOneBoard(bdrv);
		Assertions.assertTrue(deletedCount == 0);
	}
	
	public void testUpdateBoard() {
		
		BoardUpdateRequestVO testVO = new BoardUpdateRequestVO();
		testVO.setId(4);
		testVO.setContent("test");
		testVO.setEmail("test");
		testVO.setSubject("test");
		int updateCount = this.boardDaoImpl.updateOneBoard(null);
		Assertions.assertEquals(updateCount, 1);
		
	}
	
}









