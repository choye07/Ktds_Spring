package com.hello.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.board.dao.BoardDao;
import com.hello.board.service.BoardService;
import com.hello.board.vo.BoardListVO;
import com.hello.board.vo.BoardVO;
import com.hello.board.vo.BoardWriteRequestVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao boardDao;

	@Override
	public BoardListVO getBoardList() {

		int count = this.boardDao.selectBoardAllCount();
		List<BoardVO> boardlist = this.boardDao.selectAllBoard();
		BoardListVO boardListVO = new BoardListVO();
		boardListVO.setBoardCnt(count);
		boardListVO.setBoardList(boardlist);
		return boardListVO;
	}

	@Override
	public boolean createNewBoard(BoardWriteRequestVO boardWriteRequestVO) {

		int createCount = boardDao.insertNewBoard(boardWriteRequestVO);
		// DB에 등록한 개수가 0보다 크다면 성공. 아니라면 실패.
		return createCount > 0;
	}

	@Override
	public BoardVO getOneBaord(int id, boolean isIncrease) {
		// 게시글 조회.
		// 조회수가 증가 되기 전의 데이터를 조회
//		BoardVO boardVO = this.boardDao.selectOneBoard(id);
//		// 게시글이 존재하면 조회수를 증가시킨다.
//		if(boardVO!=null) {
//			//조회한 이후에 조회수를 증가한 것.
//			this.boardDao.updateViewCountBy(id);
//		}

		// == update페이지로 넘어갈 때에는 증가시키면 안됨.
		if(isIncrease) {
			
			int updatedCount = this.boardDao.updateViewCountBy(id);
			// 2. 업데이트의 수가 0보다 크다면 게시글이 존재한다는 의미이므로
			if (updatedCount > 0) {
				BoardVO boardVO = this.boardDao.selectOneBoard(id);
				System.out.println(boardVO.getContent());
				return boardVO;
			}
			throw new IllegalArgumentException(id + "는 존재하지 않는 게시글 번호입니다.");
		}
		else {
			BoardVO boardVO = this.boardDao.selectOneBoard(id);
			//boardVO 게시글을 잘 가져왔는지 체크.
			if(boardVO == null) {
				throw new IllegalArgumentException(id + "는 존재하지 않는 게시글 번호입니다.");
			}
			return boardVO;
		}
		// 1.조회 하려는게시글의 조회수를 증가시킨다.
		// 게시글을 조회해 온다.
//		return null;
	}

	@Override
	public boolean deleteOneBoard(int id) {
		int deleteCount = this.boardDao.deleteOneBoard(id);
		if (deleteCount == 0) {
			throw new IllegalArgumentException(id + "는 존재하지 않는 게시글 번호입니다.");
		}
		return deleteCount > 0;
	}

}