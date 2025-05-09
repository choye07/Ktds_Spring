package com.hello.member.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hello.member.dao.MemberDao;
import com.hello.member.vo.MemberRegistRequestVO;
import com.hello.member.vo.MembersVO;
import com.hello.member.vo.OAuthMemberVO;

@Repository
public class MemberDaoImpl extends SqlSessionDaoSupport implements MemberDao {

	private final String NAME_SPACE = "com.hello.member.dao.impl.MemberDaoImpl.";
	
    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }
    
    @Override
    public int insertNewMember(MemberRegistRequestVO memberRegistRequestVO) {
    	return this.getSqlSession().insert(NAME_SPACE + "insertNewMember", memberRegistRequestVO);
    }
    
    @Override
    public int selectMemberCountBy(String email) {
    	return this.getSqlSession().selectOne(NAME_SPACE + "selectMemberCountBy", email);
    }
    
    @Override
    public MembersVO selectOneMemberBy(String email) {
    	return this.getSqlSession().selectOne(NAME_SPACE + "selectOneMemberBy", email);
    }

	@Override
	public int updateLoginFailCount(String email) {
		return this.getSqlSession().update(NAME_SPACE + "updateLoginFailCount", email);
	}

	@Override
	public int updateBlock(String email) {
		return this.getSqlSession().update(NAME_SPACE + "updateBlock", email);
	}

	@Override
	public int updateLoginSuccess(String email) {
		return this.getSqlSession().update(NAME_SPACE + "updateLoginSuccess", email);
	}
	
	@Override
	public int updateLogoutStatus(String email) {
		return this.getSqlSession().update(NAME_SPACE + "updateLogoutStatus", email);
	}

	@Override
	public int deleteOneMemberBy(String email) {
		return this.getSqlSession().delete(NAME_SPACE + "deleteOneMemberBy", email);
	}

	@Override
	public int insertActions(MembersVO memberVO) {
		return this.getSqlSession().insert(NAME_SPACE+"insertActions",memberVO);
	}

	@Override
	public int insertOAuthMember(OAuthMemberVO oAuthMemberVO) {
		return this.getSqlSession().insert(NAME_SPACE+"insertOAuthMember", oAuthMemberVO);
	}

	@Override
	public int selectCountOAuthMember(OAuthMemberVO oAuthMemberVO) {
		return this.getSqlSession().selectOne(NAME_SPACE+"selectCountOAuthMember", oAuthMemberVO);
	}

	@Override
	public OAuthMemberVO selectOAuthMember(OAuthMemberVO oAuthMemberVO) {
		return this.getSqlSession().selectOne(NAME_SPACE+"selectOAuthMember", oAuthMemberVO);
	}
}













