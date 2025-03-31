package com.hello.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.board.dao.BoardDao;
import com.hello.board.service.BoardService;
import com.hello.board.vo.BoardListVO;
import com.hello.board.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardDao boardDao;

	@Override
	public BoardListVO getBoardList() {
		
		int count =this.boardDao.selectBoardAllCount();
		List<BoardVO> boardlist = this.boardDao.selectAllBoard();
		BoardListVO boardListVO = new BoardListVO();
		boardListVO.setBoardCnt(count);
		boardListVO.setBoardList(boardlist);
		return boardListVO;
	}

}