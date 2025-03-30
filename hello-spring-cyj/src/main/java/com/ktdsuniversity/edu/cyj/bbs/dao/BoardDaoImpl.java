package com.ktdsuniversity.edu.cyj.bbs.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ktdsuniversity.edu.cyj.bbs.vo.BoardVO;

@Repository
public class BoardDaoImpl extends SqlSessionDaoSupport implements BoardDao {

	@Autowired
	@Override
	public void setSqlSessionTemplate(SqlSessionTemplate SqlSessionTemplate) {
		super.setSqlSessionTemplate(SqlSessionTemplate);
	}
	
	@Override
	public int selectBoardAllCount() {
		return getSqlSession().selectOne("selectBoardAllCount");
	}

	@Override
	public List<BoardVO> selectAllBoard() {
		return getSqlSession().selectList("selectAllBoard");
	}

	@Override
	public int insertNewBoard(BoardVO boardVO) {
		return getSqlSession().insert("insertNewBoard",boardVO);
	}

	@Override
	public int addViewCount(int id) {
		return getSqlSession().update("addViewCount",id);
	}

	@Override
	public BoardVO selectOneBoard(int id) {
		return getSqlSession().selectOne("selectOneBoard",id);
	}

	@Override
	public int updateOneBoard(BoardVO boardVO) {
		return getSqlSession().update("updateOneBoard",boardVO);
	}

	@Override
	public int deleteOneBoard(int id) {
		return getSqlSession().delete("deleteOneBoard",id);
	}

}
