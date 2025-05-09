package com.hello.member.dao;

import com.hello.member.vo.MemberRegistRequestVO;
import com.hello.member.vo.MembersVO;
import com.hello.member.vo.OAuthMemberVO;

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
	
	public int insertOAuthMember(OAuthMemberVO oAuthMemberVO);
	
	public int selectCountOAuthMember(OAuthMemberVO oAuthMemberVO);
	
	public OAuthMemberVO selectOAuthMember(OAuthMemberVO oAuthMemberVO);
}