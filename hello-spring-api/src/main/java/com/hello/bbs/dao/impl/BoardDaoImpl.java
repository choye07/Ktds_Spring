package com.hello.bbs.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hello.bbs.dao.BoardDao;
import com.hello.bbs.vo.BoardDeleteRequestVO;
import com.hello.bbs.vo.BoardSearchRequestVO;
import com.hello.bbs.vo.BoardUpdateRequestVO;
import com.hello.bbs.vo.BoardVO;
import com.hello.bbs.vo.BoardWriteRequestVO;

@Repository
public class BoardDaoImpl extends SqlSessionDaoSupport implements BoardDao {

	private static final String NAME_SPACE = "com.hello.bbs.dao.impl.BoardDaoImpl.";

	@Autowired
	@Override
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}

	@Override
	public int selectBoardAllCount(BoardSearchRequestVO boardSearchRequestVO) {
		return this.getSqlSession().selectOne(NAME_SPACE + "selectBoardAllCount", boardSearchRequestVO);
	}

	@Override
	public List<BoardVO> selectBoardAll(BoardSearchRequestVO boardSearchRequestVO) {
		return this.getSqlSession().selectList(NAME_SPACE + "selectBoardAll", boardSearchRequestVO);
	}

	@Override
	public int insertNewBoard(BoardWriteRequestVO boardWriteRequestVO) {
		return this.getSqlSession().insert(NAME_SPACE + "insertNewBoard", boardWriteRequestVO);
	}

	@Override
	public BoardVO selectOneBoard(int id) {
		return this.getSqlSession().selectOne(NAME_SPACE + "selectOneBoard", id);
	}

	@Override
	public int updateViewCountBy(int id) {
		return this.getSqlSession().update(NAME_SPACE + "updateViewCountBy", id);
	}

	@Override
	public int deleteOneBoard(BoardDeleteRequestVO boardDeleteRequestVO) {
		return this.getSqlSession().delete(NAME_SPACE + "deleteOneBoard", boardDeleteRequestVO);
	}

	@Override
	public int updateOneBoard(BoardUpdateRequestVO boardUpdateRequestVO) {
		return this.getSqlSession().update(NAME_SPACE + "updateOneBoard", boardUpdateRequestVO);
	}
}
