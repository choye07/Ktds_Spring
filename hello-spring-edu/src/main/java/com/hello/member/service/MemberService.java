package com.hello.member.service;

import com.hello.member.vo.MemberRegistRequestVO;

public interface MemberService {
	public boolean createNewMember(MemberRegistRequestVO memberRegistRequestVO);
}