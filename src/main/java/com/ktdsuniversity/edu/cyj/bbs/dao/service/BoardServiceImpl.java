package com.ktdsuniversity.edu.cyj.bbs.dao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ktdsuniversity.edu.cyj.bbs.dao.BoardDao;
import com.ktdsuniversity.edu.cyj.bbs.vo.BoardListVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao boardDao;

	@Override
	public BoardListVO selectAllBoard() {
		// 게시글 건수와 게시글 목록을 가지는 VO 객체 선언
		BoardListVO boardListVO = new BoardListVO();
		// 게시글 총 건수 조회
		boardListVO.setBoardCnt(boardDao.selectBoardAllCount());
		// 게시글 목록 조회
		boardListVO.setBoardList(boardDao.selectAllBoard());
		return boardListVO;
	}

}
