package com.hello.file.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hello.file.dao.FileDao;
import com.hello.file.vo.FileDowloadRequestVO;
import com.hello.file.vo.FileVO;


@Repository
public class FileDaoImpl extends SqlSessionDaoSupport implements FileDao {

	private final String NAME_SPACE="com.hello.file.dao.impl.FileDaoImpl.";
    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }

	@Override
	public int insertNewFile(FileVO fileVO) {
		return this.getSqlSession().insert(NAME_SPACE+"insertNewFile",fileVO);
	}

	@Override
	public FileVO selectOneFile(FileDowloadRequestVO fileDownloadRequestVO) {
		return this.getSqlSession().selectOne(NAME_SPACE+"selectOneFile",fileDownloadRequestVO);
	}


}