package com.ktdsuniversity.edu.cyj.bbs.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.ktdsuniversity.edu.cyj.bbs.vo.BoardVO;

public interface BoardDao {
	public void setSqlSessionTemplate(SqlSessionTemplate SqlSessionTemplate);

	/**
	 * DB에 저장된 모든 게시글의 수를 조회
	 * 
	 * @return
	 */
	public int getBoardAllCount();

	/**
	 * DB에 저장된 모든 게시글의 목록을 조회
	 * 
	 * @return
	 */
	public List<BoardVO> getAllBoard();

}
