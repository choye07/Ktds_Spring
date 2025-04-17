package com.hello.replies.service;

import java.util.List;

import com.hello.replies.vo.ReplyDeleteRequestVO;
import com.hello.replies.vo.ReplyRecommendRequestVO;
import com.hello.replies.vo.ReplyRegistRequestVO;
import com.hello.replies.vo.ReplyUpdateRequestVO;
import com.hello.replies.vo.ReplyVO;

public interface ReplyService {

	public List<ReplyVO> getAllReplies(int boardId);
	
	public boolean createNewReply(ReplyRegistRequestVO replyRegistRequestVO);
	
	public boolean deleteOneReply(ReplyDeleteRequestVO replyDeleteRequestVO);
	
	public boolean modifyOneReply(ReplyUpdateRequestVO replyUpdateRequestVO);
	
	public int recommendOneReply(ReplyRecommendRequestVO replyRecommendRequestVO);
	
}