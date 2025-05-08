package com.hello.replies.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hello.exceptions.ApiException;
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

    @PreAuthorize("@rah.isReplyOwner(#replyDeleteRequestVO.replyId)")
    @Transactional
	@Override
	public boolean deleteOneReply(ReplyDeleteRequestVO replyDeleteRequestVO) {
    	ReplyVO replyVO = this.replyDao.selectOneReply(replyDeleteRequestVO.getReplyId());
    	if (replyVO == null) {
    		throw new ApiException("잘못된 댓글 번호입니다.");
    	}
    	
    	if ( ! replyVO.getEmail().equals(replyDeleteRequestVO.getEmail())) {
    		throw new ApiException("삭제할 수 없는 댓글입니다.");
    	}
    	
		int deleteCount = this.replyDao.deleteOneReply(replyDeleteRequestVO);
		if (deleteCount == 0) {
			throw new ApiException("잘못된 요청입니다.");
		}
		
		return deleteCount > 0;
	}

    @PreAuthorize("@rah.isReplyOwner(#replyUpdateRequestVO.replyId)")
    @Transactional
	@Override
	public boolean modifyOneReply(ReplyUpdateRequestVO replyUpdateRequestVO) {
    	
    	ReplyVO replyVO = this.replyDao.selectOneReply(replyUpdateRequestVO.getReplyId());
    	if (replyVO == null) {
    		throw new ApiException("잘못된 댓글 번호입니다.");
    	}
    	
    	if ( ! replyVO.getEmail().equals(replyUpdateRequestVO.getEmail())) {
    		throw new ApiException("수정할 수 없는 댓글입니다.");
    	}
    	
		int updateCount = this.replyDao.updateOneReply(replyUpdateRequestVO);
		if (updateCount == 0) {
			throw new ApiException("잘못된 요청입니다.");
		}
		
		return updateCount > 0;
	}

    @PreAuthorize("!@rah.isReplyOwner(#replyRecommendRequestVO.replyId)")
    @Transactional
	@Override
	public int recommendOneReply(ReplyRecommendRequestVO replyRecommendRequestVO) {
    	// PlayStation 5 특가 할인! 110만원, 할인가 -> 50만원.
    	// 5월 5일 오전 10시부터 시작! - 준비된 재고수는 100개!
    	// 9시 59분 59초에 구매 버튼 클릭!
    	// 결제!
    	// 비밀번호를 한 번 틀림.
    	// 비밀번호를 두 번 틀림.
    	// 신중하게 비밀번호를 입력. -> 결제 성공?
    	//     => 이미 품절되었습니다.
    	
    	
    	ReplyVO replyVO = this.replyDao.selectOneReply(replyRecommendRequestVO.getReplyId());
    	if (replyVO == null) {
    		throw new ApiException("잘못된 댓글 번호입니다.");
    	}
    	
//    	if (replyVO.getEmail().equals(replyRecommendRequestVO.getEmail())) {
//    		throw new AjaxException("추천 할 수 없는 댓글입니다.");
//    	}
    	
		int updateCount = this.replyDao.updateRecommendOneReply(replyRecommendRequestVO);
//		if (updateCount == 0) {
//			throw new AjaxException("잘못된 요청입니다.");
//		}
		
		return this.replyDao.selectOneReply(replyRecommendRequestVO.getReplyId())
							.getRecommendCnt();
	}

}












