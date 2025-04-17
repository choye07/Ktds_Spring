package com.learn.bbs.usr.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.bbs.usr.dao.UsrDao;
import com.learn.bbs.usr.vo.UsrRegistRequestVO;
import com.learn.bbs.usr.vo.UsrVO;

@Repository
public class UsrDaoImpl extends SqlSessionDaoSupport implements UsrDao {

	private final String NAME_SPACE = "com.learn.bbs.usr.dao.impl.UsrDaoImpl.";
    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }
	@Override
	public int insertNewUsr(UsrRegistRequestVO usrRegistRequestVO) {
		return this.getSqlSession().insert(NAME_SPACE + "insertNewUsr", usrRegistRequestVO);
	}
	
	@Override
	public int selectUsrCountBy(String usrMl) {
		return this.getSqlSession().selectOne(NAME_SPACE + "selectUsrCountBy", usrMl);
	}
	
	@Override
	public UsrVO selectOneUsrBy(String usrMl) {
		return this.getSqlSession().selectOne(NAME_SPACE + "selectOneUsrBy", usrMl);
	}
	
	@Override
	public int updateLoginFailCount(String usrMl) {
		return this.getSqlSession().update(NAME_SPACE + "updateLoginFailCount",usrMl);
	}

	@Override
	public int updateBlock(String usrMl) {
		return this.getSqlSession().update(NAME_SPACE + "updateBlock",usrMl);
	}
	
	@Override
	public int updateLogoutStatus(String usrMl) {
		return this.getSqlSession().update(NAME_SPACE + "updateLogoutStatus",usrMl);
	}

	@Override
	public int updateLoginSuccess(String usrMl) {
		return this.getSqlSession().update(NAME_SPACE + "updateLoginSuccess",usrMl);
	}

	@Override
	public int deleteOneUsrBy(String usrMl) {
		return this.getSqlSession().update(NAME_SPACE + "deleteOneUsrBy",usrMl);
	}
	
	
}