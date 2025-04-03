package com.hello.member.dao;

import com.hello.member.vo.MemberRegistRequestVO;

public interface MemberDao {
	public int insertNewMember(MemberRegistRequestVO memberRegistRequestVO);
}