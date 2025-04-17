package com.learn.bbs.usr.service;

import com.learn.bbs.usr.vo.UsrLoginRequestVO;
import com.learn.bbs.usr.vo.UsrRegistRequestVO;
import com.learn.bbs.usr.vo.UsrVO;

public interface UsrService {
	
	// 사용자 회원가입 기능 
	public boolean createNewUsr(UsrRegistRequestVO usrRegistRequestVO);
	
	// 이메일 중복 검사 기능 
	public boolean checkDuplicateEmail(String usrMl);
	
	// 사용자 로그인 기능
	public UsrVO doLogin(UsrLoginRequestVO usrLoginRequestVO);
	
	// 사용자 로그아웃 기능
	public boolean doLogout(String usrMl);
	
	// 사용자 계정 삭제 기능
	public boolean doDeleteUsr(String usrMl);
}