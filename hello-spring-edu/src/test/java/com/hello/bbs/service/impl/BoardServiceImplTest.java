package com.hello.bbs.service.impl;

import static org.assertj.core.api.Assertions.assertThatIOException;

import java.util.List;

import org.assertj.core.api.BDDAssertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import com.hello.board.dao.impl.BoardDaoImpl;
import com.hello.board.service.BoardService;
import com.hello.board.service.impl.BoardServiceImpl;
import com.hello.board.vo.BoardListVO;
import com.hello.board.vo.BoardVO;
import com.hello.board.vo.BoardWriteRequestVO;

@SpringBootTest // @Controller, @Service @Repository Bean들을 모두 생성해라!
@Import({ BoardServiceImpl.class, BoardDaoImpl.class }) // BoardDaoImpl -> 직접적으로 디비에 연결되어있는 애
public class BoardServiceImplTest {
	@Autowired
	private BoardService boardService;

	// 가짜 Bean -> bean container한테 말고 BoardDaoImpl으로 가짜 bean을 만드는 것.
	@MockitoBean
	private BoardDaoImpl boardDaoImpl;

	@Test
	public void getTest() {

		// given
		BDDMockito.given(this.boardDaoImpl.selectBoardAllCount()).willReturn(100);
		BDDMockito.given(this.boardDaoImpl.selectAllBoard())
				.willReturn(List.of(new BoardVO(), new BoardVO(), new BoardVO(), new BoardVO(), new BoardVO(),
						new BoardVO(), new BoardVO(), new BoardVO(), new BoardVO(), new BoardVO()));

		// Test -> when
		// 가짜 bean에게 역할을 주는 것. 기능을 테스트 실행했을 떄 DB에 직접 연결하는 것이 아닌 것이기 때문에 가짜 데이터를 만들어 역할을
		// 주는 것.
		// 정상적으로 dao와 service가 잘 동작하는 지를 보고싶은 것.
		// 적절한 데이터를 주고 서비스의 기능이 잘 작동하는지 보고싶은 것 -> given test
		BoardListVO boardListVO = this.boardService.getBoardList();

		// 내가 요청한 기능이 제대로 수행하는지를 알려주는 것.
		Assertions.assertEquals(boardListVO.getBoardCnt(), 100);
		Assertions.assertEquals(boardListVO.getBoardList().size(), 10);
	}

	@Test
	public void createTest() {

		BoardWriteRequestVO testVO = new BoardWriteRequestVO();
		BDDMockito.given(this.boardDaoImpl.insertNewBoard(testVO)).willReturn(1);
		boolean success = this.boardService.createNewBoard(testVO);
		Assertions.assertTrue(success);
	}

	@Test
	public void createTestFail() {

		BoardWriteRequestVO testVO = new BoardWriteRequestVO();
		BDDMockito.given(this.boardDaoImpl.insertNewBoard(testVO)).willReturn(0);
		boolean success = this.boardService.createNewBoard(testVO);
		Assertions.assertFalse(success);
	}

	@Test
	public void testViewBoard() {
		BDDMockito.given(this.boardDaoImpl.selectOneBoard(1_000_000)).willReturn(new BoardVO());
		BDDMockito.given(this.boardDaoImpl.updateViewCountBy(1_000_000)).willReturn(1);

		BoardVO boardVO = this.boardService.getOneBaord(1_000_000,true);

		Assertions.assertNotNull(boardVO);
	}

	@Test
	public void testViewBoardFail() {
		BDDMockito.given(this.boardDaoImpl.selectOneBoard(1_000_000)).willReturn(null);
		BDDMockito.given(this.boardDaoImpl.updateViewCountBy(1_000_000)).willReturn(0);
		try {
			this.boardService.getOneBaord(1_000_000,true);
		}catch(IllegalArgumentException ioe) {
			Assertions.assertEquals("1000000는 존재하지 않는 게시글 번호입니다.", ioe.getMessage());
		}
		
		
		
//		BoardVO boardVO = this.boardService.getOneBaord(1_000_000);
//		Assertions.assertNull(boardVO);
	}
	
	@Test
	public void deleteBoard() {
		BDDMockito.given(this.boardDaoImpl.deleteOneBoard(1))
				  .willReturn(1);
		
		boolean isDeleted = this.boardService.deleteOneBoard(1);
		Assertions.assertTrue(isDeleted);
	}
	
	@Test
	public void deleteBoardFail() {
		BDDMockito.given(this.boardDaoImpl.deleteOneBoard(1))
		  .willReturn(0);
		String message =BDDAssertions.catchThrowable(()-> this.boardService.deleteOneBoard(1)).getMessage();
		Assertions.assertEquals(1+"는 존재하지 않는 게시글 번호입니다.",message);
	}

}
