package com.hello.bbs.service;

import com.hello.bbs.vo.BoardDeleteRequestVO;
import com.hello.bbs.vo.BoardListVO;
import com.hello.bbs.vo.BoardSearchRequestVO;
import com.hello.bbs.vo.BoardUpdateRequestVO;
import com.hello.bbs.vo.BoardVO;
import com.hello.bbs.vo.BoardWriteRequestVO;

public interface BoardService {

	public BoardListVO getBoardList(BoardSearchRequestVO boardSearchRequestVO);
	
	public boolean createNewBoard(BoardWriteRequestVO boardWriteRequestVO);
	
	public BoardVO getOneBoard(int id, boolean isIncrease);

	public boolean deleteOneBoard(BoardDeleteRequestVO boardDeleteRequestVO);
	
	public boolean updateOneBoard(BoardUpdateRequestVO boardUpdateRequestVO);
}