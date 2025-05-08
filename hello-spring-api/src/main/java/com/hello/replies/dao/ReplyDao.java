package com.hello.replies.dao;

import java.util.List;

import com.hello.replies.vo.ReplyDeleteRequestVO;
import com.hello.replies.vo.ReplyRecommendRequestVO;
import com.hello.replies.vo.ReplyRegistRequestVO;
import com.hello.replies.vo.ReplyUpdateRequestVO;
import com.hello.replies.vo.ReplyVO;

public interface ReplyDao {

	public List<ReplyVO> selectAllReplies(int boardId);
	
	public ReplyVO selectOneReply(int replyId);
	
	public int insertNewReply(ReplyRegistRequestVO replyRegistRequestVO);
	
	public int deleteOneReply(ReplyDeleteRequestVO replyDeleteRequestVO);
	
	public int updateOneReply(ReplyUpdateRequestVO replyUpdateRequestVO);
	
	public int updateRecommendOneReply(ReplyRecommendRequestVO replyRecommendRequestVO);
	
}