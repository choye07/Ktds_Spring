package com.hello.member.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hello.member.dao.MemberDao;
import com.hello.member.vo.MemberRegistRequestVO;

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


}