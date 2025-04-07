package com.hello.replies.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hello.replies.dao.ReplyDao;
import com.hello.replies.vo.ReplyDeleteRequestVO;
import com.hello.replies.vo.ReplyRecommendRequestVO;
import com.hello.replies.vo.ReplyRegistRequestVO;
import com.hello.replies.vo.ReplyUpdateRequestVO;
import com.hello.replies.vo.ReplyVO;

@Repository
public class ReplyDaoImpl extends SqlSessionDaoSupport implements ReplyDao {

    private final String NAME_SPACE = "com.hello.replies.dao.impl.ReplyDaoImpl.";

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }

	@Override
	public List<ReplyVO> selectAllReplies(int boardId) {
		return this.getSqlSession().selectList(NAME_SPACE+"selectAllReplies",boardId);
	}

	@Override
	public ReplyVO selectOneReply(int replyId) {
		return this.getSqlSession().selectOne(NAME_SPACE+"selectOneReply",replyId);
	}

	@Override
	public int insertNewReply(ReplyRegistRequestVO replyRegistRequestVO) {
		return this.getSqlSession().insert(NAME_SPACE+"insertNewReply",replyRegistRequestVO);
	}

	@Override
	public int deleteOneReply(ReplyDeleteRequestVO replyDeleteRequestVO) {
		return this.getSqlSession().delete(NAME_SPACE+"insertNewReply",replyDeleteRequestVO);
	}

	@Override
	public int updateOneReply(ReplyUpdateRequestVO replyUpdateRequestVO) {
		return this.getSqlSession().update(NAME_SPACE+"updateOneReply",replyUpdateRequestVO);
	}

	@Override
	public int updateRecommendOneReply(ReplyRecommendRequestVO replyRecommendRequestVO) {
		return this.getSqlSession().update(NAME_SPACE+"udpateRecommendOneReply",replyRecommendRequestVO);
	}


}