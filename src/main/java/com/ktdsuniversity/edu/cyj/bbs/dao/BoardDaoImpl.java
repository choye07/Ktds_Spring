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

}
