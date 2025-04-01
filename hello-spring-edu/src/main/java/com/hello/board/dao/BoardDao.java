package com.hello.board.dao;

import java.util.List;

import com.hello.board.vo.BoardUpdateRequestVO;
import com.hello.board.vo.BoardVO;
import com.hello.board.vo.BoardWriteRequestVO;

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
	
	public int insertNewBoard(BoardWriteRequestVO boardWriteRequestVO);

	public BoardVO selectOneBoard(int id);
	
	public int updateViewCountBy(int id);
	
	public int deleteOneBoard(int id);
	
	public int updateOneBoard(BoardUpdateRequestVO boardUpdateRequestVO);

}