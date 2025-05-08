package com.hello.beans;

import com.hello.bbs.dao.BoardDao;
import com.hello.bbs.vo.BoardVO;
import com.hello.common.util.AuthUtil;
import com.hello.replies.dao.ReplyDao;
import com.hello.replies.vo.ReplyVO;

public class ResourceAccessHandler {

	private BoardDao boardDao;
	private ReplyDao replyDao;
	
	public ResourceAccessHandler(BoardDao boardDao, ReplyDao replyDao) {
		this.boardDao = boardDao;
		this.replyDao = replyDao;
	}
	
	public boolean isReplyOwner(int replyId) {
		String authenticatedEmail = AuthUtil.getEmail();
		ReplyVO replyVO = replyDao.selectOneReply(replyId);
		return replyVO.getEmail().equals(authenticatedEmail);
	}
	
	public boolean isBoardOwner(boolean isIncrease, BoardVO boardVO) {
		if (isIncrease) {
			return true;
		}
		
		String authenticatedEmail = AuthUtil.getEmail();
		return boardVO.getEmail().equals(authenticatedEmail);
	}
	
	public boolean isBoardOwner(int boardId) {
		String authenticatedEmail = AuthUtil.getEmail();
		
		BoardVO boardVO = this.boardDao.selectOneBoard(boardId);
		if (boardVO == null) {
			return false;
		}
		
		return boardVO.getEmail().equals(authenticatedEmail);
	}
	
}





