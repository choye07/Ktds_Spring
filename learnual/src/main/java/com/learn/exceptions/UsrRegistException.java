package com.learn.exceptions;

import com.learn.bbs.usr.vo.UsrRegistRequestVO;

public class UsrRegistException extends RuntimeException {

	private static final long serialVersionUID = 8893087561472910712L;
	
	private UsrRegistRequestVO usrRegistRequestVO;
	
	public UsrRegistException(UsrRegistRequestVO usrRegistRequestVO) {
		super(usrRegistRequestVO.getUsrMl() + "은 이미 사용중인 이메일 입니다.");
		this.usrRegistRequestVO = usrRegistRequestVO;
	}

	public UsrRegistRequestVO getUsrRegistRequestVO() {
		return usrRegistRequestVO;
	}

}