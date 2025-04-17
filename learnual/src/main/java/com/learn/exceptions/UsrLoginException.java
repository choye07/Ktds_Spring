package com.learn.exceptions;

import com.learn.bbs.usr.vo.UsrLoginRequestVO;

public class UsrLoginException extends RuntimeException {

	private static final long serialVersionUID = -2450461635407439914L;

	private UsrLoginRequestVO usrLoginRequestVO;
	
	public UsrLoginException(UsrLoginRequestVO usrLoginRequestVO) {
		super("비밀번호 또는 이메일을 잘못 작성했습니다. 확인 후 다시 시도해 주세요.");
		this.usrLoginRequestVO = usrLoginRequestVO;
	}
	
	public UsrLoginException(UsrLoginRequestVO usrLoginRequestVO, int failCount) {
		super("비밀번호가" + failCount + "차례 틀려 계정 접근이 제한되었습니다. 관리자에게 문의하세요.");
		this.usrLoginRequestVO = usrLoginRequestVO;
	}

	public UsrLoginRequestVO getUsrLoginRequestVO() {
		return usrLoginRequestVO;
	}
	

}
