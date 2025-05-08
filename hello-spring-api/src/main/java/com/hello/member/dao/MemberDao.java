package com.hello.member.dao;

import com.hello.member.vo.MemberRegistRequestVO;
import com.hello.member.vo.MembersVO;

public interface MemberDao {

	public int insertNewMember(MemberRegistRequestVO memberRegistRequestVO);
	
	public int selectMemberCountBy(String email);
	
	public MembersVO selectOneMemberBy(String email);

	public int updateLoginFailCount(String email);

	public int updateBlock(String email);

	public int updateLoginSuccess(String email);
	
	public int updateLogoutStatus(String email);
	
	public int deleteOneMemberBy(String email);

	public int insertActions(MembersVO memberVO);
}