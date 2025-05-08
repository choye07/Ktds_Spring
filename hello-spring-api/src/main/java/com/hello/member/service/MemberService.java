package com.hello.member.service;

import com.hello.member.vo.MemberAuthVO;
import com.hello.member.vo.MemberRegistRequestVO;
import com.hello.member.vo.MembersVO;

public interface MemberService {

	public boolean createNewMember(MemberRegistRequestVO memberRegistRequestVO);
	
	public MembersVO auth(MemberAuthVO memberVO);
	
	public boolean checkDuplicateEmail(String email);
	
	public boolean doDeleteMe(String email);
	
}