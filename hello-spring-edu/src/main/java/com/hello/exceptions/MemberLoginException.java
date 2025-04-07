package com.hello.exceptions;

import com.hello.member.vo.MemberLoginRequestVO;

public class MemberLoginException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3972793640531851256L;
	private MemberLoginRequestVO memberLoginRequestVO;

	public MemberLoginException(MemberLoginRequestVO memberLoginRequestVO) {
		super("비밀번호 또는 이메일을 잘못 작성했습니다. 확인 후 다시 시도해주세요.");
		this.memberLoginRequestVO = memberLoginRequestVO;
	}
	
	public MemberLoginException(MemberLoginRequestVO memberLoginRequestVO, int failCount) {
		super("비밀번호가 "+failCount+"차례 틀려 계정 접근이 제한되었습니다. 관리자에게 문의하세요.");
	}
	
	public MemberLoginRequestVO memberLoginRequestVO() {
		return this.memberLoginRequestVO;
	}
	

}
