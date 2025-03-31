package com.hello.board.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hello.board.dao.BoardDao;
import com.hello.board.vo.BoardVO;

@Repository
public class BoardDaoImpl extends SqlSessionDaoSupport implements BoardDao {

	private static final String NAME_SPACE="com.hello.board.dao.impl.BoardDaoImpl.";
    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }

	@Override
	public int selectBoardAllCount() {
//		return getSqlSession().selectOne("sqlid",parameter); -> 기본 구조 다른 mapper 파일에서 동일하게 사용할 수 있기 때문에
		// com.hello.board.dao.impl.BoardDaoImpl -> xml 파일에 있는 namespace를 앞에 붙여주면 좋다. -> 상수로 만들어서 사용하면 편하다
		// class에 만들던 인터페이스에 쓰면 된다.
		return getSqlSession().selectOne(NAME_SPACE+"selectBoardAllCount");
	}

	@Override
	public List<BoardVO> selectAllBoard() {
		return getSqlSession().selectList(NAME_SPACE+"selectAllBoard");
	}


}