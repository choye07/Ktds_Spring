package com.hello.member.service;

import com.hello.member.vo.MemberLoginRequestVO;
import com.hello.member.vo.MemberRegistRequestVO;
import com.hello.member.vo.MembersVO;

public interface MemberService {
	public boolean createNewMember(MemberRegistRequestVO memberRegistRequestVO);
	
	public boolean checkDuplicateEmail(String email);


	public MembersVO doLogin(MemberLoginRequestVO memberLoginRequestVO);
}