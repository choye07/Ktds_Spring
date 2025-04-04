package com.hello.member.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hello.member.dao.MemberDao;
import com.hello.member.vo.MemberRegistRequestVO;
import com.hello.member.vo.MembersVO;

@Repository
public class MemberDaoImpl extends SqlSessionDaoSupport implements MemberDao {
	private static final String NAME_SPACE="com.hello.member.dao.impl.MemberDaoImpl.";
	
    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }

	@Override
	public int insertNewMember(MemberRegistRequestVO memberRegistRequestVO) {
		return this.getSqlSession().insert(NAME_SPACE+"insertNewMember",memberRegistRequestVO);
	}

	@Override
	public int selectMemberCount(String email) {
		return this.getSqlSession().selectOne(NAME_SPACE+"selectMemberCount",email);
	}

	@Override
	public MembersVO selectOneMemeberBy(String email) {
		return this.getSqlSession().selectOne(NAME_SPACE+"selectOneMemeberBy",email);
	}

	@Override
	public int updateLoginFailCount(String email) {
		return this.getSqlSession().update(NAME_SPACE+"updateLoginFailCount",email);
	}

	@Override
	public int updateBlock(String email) {
		// TODO Auto-generated method stub
		return this.getSqlSession().update(NAME_SPACE+"updateBlock",email);
	}

	@Override
	public int updateLoginSuccess(String email) {
		// TODO Auto-generated method stub
		return this.getSqlSession().update(NAME_SPACE+"updateLoginSuccess",email);
	}


}