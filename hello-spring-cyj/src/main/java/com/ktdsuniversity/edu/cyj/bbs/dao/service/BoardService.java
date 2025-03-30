package com.ktdsuniversity.edu.cyj.bbs.dao.service;

import com.ktdsuniversity.edu.cyj.bbs.vo.BoardListVO;
import com.ktdsuniversity.edu.cyj.bbs.vo.BoardVO;

/**
 * 게시글의 목록과 게시글의 건수를 모두 조회한다.
 */
public interface BoardService {
	public BoardListVO selectAllBoard();
	
	public boolean insertNewBoard(BoardVO boardVO);
	
	public BoardVO selectOneBoard(int id, boolean isIncrease);
	
	public boolean updateOneBoard(BoardVO boardVO);
	
	public boolean deleteOneBoard(int id);

}
