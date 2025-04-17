package com.learn.bbs.usr.dao;

import com.learn.bbs.usr.vo.UsrRegistRequestVO;
import com.learn.bbs.usr.vo.UsrVO;

public interface UsrDao {
	
	// 사용자 등록 (회원 가입)
	public int insertNewUsr(UsrRegistRequestVO registRequestVO);
	
	// 이메일 중복 체크
	public int selectUsrCountBy (String usrMl); 
	
	// 이메일로 조회시 모든 정보를 가져옴.
	public UsrVO selectOneUsrBy(String usrMl); 
	
	// 사용자의 로그인 시도시 실패 횟수
	public int updateLoginFailCount(String usrMl);

	// 5회 이상 로그인 실패시 잠금
	public int updateBlock(String usrMl);
	
	// 로그인 성공 상태.
	public int updateLoginSuccess(String usrMl); 
	
	// 로그아웃 상태로 변경.
	public int updateLogoutStatus(String usrMl); 
	
	// 이메일 계정 삭제.
	// -> 물리적 삭제가 아닌 삭제 여부를 'Y'로 변경 후 변경된 당일 날짜 등록.
	public int deleteOneUsrBy(String usrMl);
	
}