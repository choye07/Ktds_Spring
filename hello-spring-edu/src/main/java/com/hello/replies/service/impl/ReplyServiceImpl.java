package com.hello.replies.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hello.exceptions.AjaxException;
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
		
		ReplyVO replyVO = this.replyDao.selectOneReply(replyDeleteRequestVO.getReplyId());
		if(replyVO == null) {
			throw new AjaxException("잘못된 댓글 번호입니다.");
		}
		
		if(!replyVO.getEmail().equals(replyDeleteRequestVO.getEmail())) {
			throw new AjaxException("삭제할 수 없는 댓글입니다.");
		}
		
		int deletedCount = this.replyDao.deleteOneReply(replyDeleteRequestVO);

		if (deletedCount == 0) {
			//Ajax 전용 Exception 생성 필요.
			throw new AjaxException("잘못된 요청입니다.");
		}
		return deletedCount > 0;
	}

	@Transactional
	@Override
	public boolean modifyOneReply(ReplyUpdateRequestVO replyUpdateRequestVO) {
		
		ReplyVO replyVO = this.replyDao.selectOneReply(replyUpdateRequestVO.getReplyId());
		
		if(replyVO == null) {
			throw new AjaxException("잘못된 댓글 번호입니다.");
		}
		
		if(!replyVO.getEmail().equals(replyUpdateRequestVO.getEmail())){
			throw new AjaxException("수정할 수 없는 댓글입니다.");
		}
		int updatedCount = this.replyDao.updateOneReply(replyUpdateRequestVO);
		if (updatedCount == 0) {
			throw new AjaxException("잘못된 요청 입니다.");
		}
		return updatedCount > 0;
	}

	@Transactional
	@Override
	public int recommendOneReply(ReplyRecommendRequestVO replyRecommendRequestVO) {
		
		// PlayStation 5 특가 할인! 110만원, 할인가 -> 50만원
		// 5월 5일 오전 10시부터 시작! - 준비된 재고수는 100개!
		// 9시 59분 59초에 구매 버튼 클릭!
		// 결제!
		// 비밀번호를 한번 틀림
		// 비밀번호를 두번 틀림
		// 신중하게 비밀번호를 입력 -> 결제 성공?
		//    => 이미 품절 되었습니다.
		
		//이와 같은 개념으로 추천하려고 하는데 이미 삭제되었을 때는 추천할 수 없음.
		
		ReplyVO replyVO = this.replyDao.selectOneReply(replyRecommendRequestVO.getReplyId());
		
		if(replyVO == null) {	
			throw new AjaxException("잘못된 댓글 번호입니다.");
		}
		
		if(replyVO.getEmail().equals(replyRecommendRequestVO.getEmail())) {
			throw new AjaxException("추천 할 수 없는 댓글입니다.");
		}
		
		
		int upadatedCount = this.replyDao.updateRecommendOneReply(replyRecommendRequestVO);
		
		if (upadatedCount == 0) {
			throw new AjaxException("잘못된 요청입니다.");
		}

		return this.replyDao.selectOneReply(replyRecommendRequestVO.getReplyId()).getRecommendCnt();
	}

}