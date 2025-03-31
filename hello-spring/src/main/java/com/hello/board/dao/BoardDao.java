package com.hello.board.dao;

import java.util.List;

import com.hello.board.vo.BoardVO;

public interface BoardDao {
	/**
	 * DB에 저장된 모든 게시글의 수를 조회
	 * 
	 * @return
	 */
	public int selectBoardAllCount();

	/**
	 * DB에 저장된 모든 게시글의 목록을 조회
	 * 
	 * @return
	 */
	public List<BoardVO> selectAllBoard();
}