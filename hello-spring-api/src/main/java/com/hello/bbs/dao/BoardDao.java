package com.hello.bbs.dao;

import java.util.List;

import com.hello.bbs.vo.BoardDeleteRequestVO;
import com.hello.bbs.vo.BoardSearchRequestVO;
import com.hello.bbs.vo.BoardUpdateRequestVO;
import com.hello.bbs.vo.BoardVO;
import com.hello.bbs.vo.BoardWriteRequestVO;

public interface BoardDao {

	public int selectBoardAllCount(BoardSearchRequestVO boardSearchRequestVO);
	
	public List<BoardVO> selectBoardAll(BoardSearchRequestVO boardSearchRequestVO);
	
	public int insertNewBoard(BoardWriteRequestVO boardWriteRequestVO);
	
	public BoardVO selectOneBoard(int id);
	
	public int updateViewCountBy(int id);
	
	public int deleteOneBoard(BoardDeleteRequestVO boardDeleteRequestVO);
	
	public int updateOneBoard(BoardUpdateRequestVO boardUpdateRequestVO);
	
}