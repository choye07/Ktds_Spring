package com.hello.member.dao;

import com.hello.member.vo.MemberRegistRequestVO;
import com.hello.member.vo.MembersVO;

public interface MemberDao {
	public int insertNewMember(MemberRegistRequestVO memberRegistRequestVO);
	
	public int selectMemberCount(String email);
	
	public MembersVO selectOneMemeberBy(String email);

	public int updateLoginFailCount(String email);

	public int updateBlock(String email);

	public int updateLoginSuccess(String email);
}