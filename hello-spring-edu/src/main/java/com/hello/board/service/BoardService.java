package com.hello.board.service;

import com.hello.board.vo.BoardListVO;
import com.hello.board.vo.BoardVO;
import com.hello.board.vo.BoardWriteRequestVO;

public interface BoardService {
	public BoardListVO getBoardList();
	
	public boolean createNewBoard(BoardWriteRequestVO boardWriteRequestVO);
	
	public BoardVO getOneBaord(int id, boolean isIncrease);
	
	public boolean deleteOneBoard(int id); 
}