package com.hello.replies.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.hello.exceptions.PageNotFoundException;
import com.hello.replies.dao.ReplyDao;
import com.hello.replies.service.ReplyService;
import com.hello.replies.vo.ReplyDeleteRequestVO;
import com.hello.replies.vo.ReplyRecommendRequestVO;
import com.hello.replies.vo.ReplyRegistRequestVO;
import com.hello.replies.vo.ReplyUpdateRequestVO;
import com.hello.replies.vo.ReplyVO;

@Service
public class ReplyServiceImpl implements ReplyService {


	@Autowired
	private ReplyDao replyDao;

	@Transactional(readOnly = true)
	@Override
	public List<ReplyVO> getAllReplies(int boardId) {
		return this.replyDao.selectAllReplies(boardId);
	}

	@Transactional
	@Override
	public boolean createNewReply(ReplyRegistRequestVO replyRegistRequestVO) {
		return this.replyDao.insertNewReply(replyRegistRequestVO) > 0;
	}

	@Transactional
	@Override
	public boolean deleteOneReply(ReplyDeleteRequestVO replyDeleteRequestVO) {
		int deletedCount = this.replyDao.deleteOneReply(replyDeleteRequestVO);

		if (deletedCount == 0) {
			//Ajax 전용 Exception 생성 필요.
			throw new PageNotFoundException(replyDeleteRequestVO.getBoardId());
		}
		return deletedCount > 0;
	}

	@Transactional
	@Override
	public boolean modifyOneReply(ReplyUpdateRequestVO replyUpdateRequestVO) {
		int updatedCount = this.replyDao.updateOneReply(replyUpdateRequestVO);

		if (updatedCount == 0) {
			throw new PageNotFoundException(replyUpdateRequestVO.getBoardId());
		}
		return updatedCount > 0;
	}

	@Transactional
	@Override
	public boolean recommendOneReply(ReplyRecommendRequestVO replyRecommendRequestVO) {
		int upadatedCount = this.replyDao.updateRecommendOneReply(replyRecommendRequestVO);

		if (upadatedCount == 0) {
			throw new PageNotFoundException(replyRecommendRequestVO.getBoardId());
		}

		return upadatedCount > 0;
	}

}