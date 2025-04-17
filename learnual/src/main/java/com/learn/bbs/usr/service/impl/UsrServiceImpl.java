package com.learn.bbs.usr.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import com.learn.bbs.usr.dao.UsrDao;
import com.learn.bbs.usr.service.UsrService;
import com.learn.bbs.usr.vo.UsrLoginRequestVO;
import com.learn.bbs.usr.vo.UsrRegistRequestVO;
import com.learn.bbs.usr.vo.UsrVO;
import com.learn.beans.Sha;
import com.learn.exceptions.UsrLoginException;
import com.learn.exceptions.UsrRegistException;

@Service
public class UsrServiceImpl implements UsrService {

    @Autowired
    private UsrDao usrDao;

    @Autowired
    private Sha sha; // 암호화
    
    @Transactional
	@Override
	public boolean createNewUsr(UsrRegistRequestVO usrRegistRequestVO) {
		
		int emailCount = this.usrDao.selectUsrCountBy(usrRegistRequestVO.getUsrMl());
    	if (emailCount == 1) {
    		throw new UsrRegistException(usrRegistRequestVO);
    	}
    	
		String salt=  this.sha.generateSalt();
		
		// 발급받은 Salt 를 이용해 SHA 알고리즘으로 암호화를 진행한다. (복호화 불가능 암호화)
		String password =  usrRegistRequestVO.getUsrPw();
		password = this.sha.getEncrypt(password, salt); // 암호화가 된 패스워드
		
		// Salt 값과 암호화된 비밀번호를 memberRegistRequestVO 에 알맞게 할당한다.
		usrRegistRequestVO.setUsrPw(password);
		usrRegistRequestVO.setUsrSlt(salt);
		
		// 데이터베이스에 저장한다. 
		return this.usrDao.insertNewUsr(usrRegistRequestVO) > 0;
	}

    @Transactional(readOnly= true)
	@Override
	public boolean checkDuplicateEmail(String usrMl) {
		// true 라면 쓸 수 없는 email
		return this.usrDao.selectUsrCountBy(usrMl) == 1;
	}

	@Override
	public UsrVO doLogin(UsrLoginRequestVO usrLoginRequestVO) {
		
		// 1. email 로 회원의 모든 정보를 조회한다.
		UsrVO usrVO = this.usrDao.selectOneUsrBy(usrLoginRequestVO.getUsrMl());
	
		// 1-1. 회원의 정보가 null 이면 사용자에게 예외를 던져버린다. 
		//		 "비밀번호 또는 이메일을 잘 못 작성했습니다. 확인 후 다시 시도해주세요."
		if (usrVO == null) {
			throw new UsrLoginException(usrLoginRequestVO);
   	}
		
		// 2. 회원의 정보 중 BLOCK_YN 이 "Y" 라면 예외를 던져버린다.ㅣ
		//		"비밀번호가 n 차례 틀려 계정 접근이 제한되었습니다. 관리자에게 문의 하세요."
		if (usrVO.getUsrBlkYn().equals("Y")) {
			throw new UsrLoginException(usrLoginRequestVO, usrVO.getUsrLgnFailCnt());
	}
		// 3. SALT 를 이용해 memberLoginRequestVO의 password 를 암호화 한다.
		String salt = usrVO.getUsrSlt();
		String password = usrLoginRequestVO.getUsrPw();
		password = sha.getEncrypt(password, salt);
		
		// 4. 회원의 정보 중 password 값이 memberLoginRequestVO 의 암호화된 password 와 같은지 비교한다.
		if ( ! usrVO.getUsrPw().equals(password)) {
			// 5. 만약 다르면 MEMBERS 테이블의 LOGIN_FAIL_COUNT 값을 1 증가시킨다.
			//		LATEST_LOGIN_FAIL_DATE는 현재시간으로 업데이트 시킨다.
			this.usrDao.updateLoginFailCount(usrLoginRequestVO.getUsrMl());
			
			// 6. 업데이트된 LOGIN_FAIL_COUNT 의 값이 5 이상이라면 "BLOCK_YN" 값을 "Y" 로 업데이트 시킨다.
			this.usrDao.updateBlock(usrLoginRequestVO.getUsrMl());
			
			// 7. 사용자에게 예외를 던져버린다.
			// 	"비밀번호 또는 이메일을 잘 못 작성했습니다. 확인 후 다시 시도해주세요."
		   	throw new UsrLoginException(usrLoginRequestVO);
		}
		

		// 8. 회원의 정보 중 password 값이 memberLoginRequestVO 의 암호화된 password와 같다면
		// MEMBERS 테이블의 LOGIN_FAIL_COUNT는 0 으로 수정한다.
		// LATEST_LOGIN_DATE는 현재시간으로 업데이트 한다.
		// LATEST_LOGIN_IP 는 사용자의 IP 로 업데이트 한다.
		// LOGIN_YN 은 "Y" 로 업데이트 한다.
		else {
			this.usrDao.updateLoginSuccess(usrLoginRequestVO.getUsrMl());
		}
	
	// 9 조회된 사용자 정보를 반환 시킨다. 
		return usrVO;
	}
	
	@Transactional
    @Override
    public boolean doLogout(String usrMl) {
    	return this.usrDao.updateLogoutStatus(usrMl) > 0;
    }
	
    @Transactional
    @Override
    public boolean doDeleteUsr(String usrMl) {
    	return this.usrDao.deleteOneUsrBy(usrMl) > 0;
    }

}