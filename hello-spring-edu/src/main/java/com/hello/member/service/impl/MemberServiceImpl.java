package com.hello.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hello.beans.Sha;
import com.hello.exceptions.MemberLoginException;
import com.hello.exceptions.MemberRegistException;
import com.hello.member.dao.MemberDao;
import com.hello.member.service.MemberService;
import com.hello.member.vo.MemberLoginRequestVO;
import com.hello.member.vo.MemberRegistRequestVO;
import com.hello.member.vo.MembersVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDao memberDao;

	@Autowired
	private Sha sha;

	
	@Transactional
	@Override
	public boolean createNewMember(MemberRegistRequestVO memberRegistRequestVO) {

		int emailCount = this.memberDao.selectMemberCount(memberRegistRequestVO.getEmail());
		if (emailCount == 1) {
//			throw new IllegalArgumentException("이미 사용중인 이메일입니다. 다른 이메일을 입력해주세요.");
			throw new MemberRegistException(memberRegistRequestVO);
		}
		// 사용자가 입력한 비밀 번호 암호화를 위해 Sqlt를 발급 받는다.
		// 암호화 -> 원문이 무엇인지 모르게 한다.
		// 암호화 특징: "ABC"-> "asdf asd gsa"
//							   A     B  C
		// RainbowSheet를 무력화 -> Salt를 이용
		// "23135456" -- 발급할 때마다 다른 문자가 나온다.
		// "ABC" + Salt = "231A354B56C" => 암호화를 시키게 되면 => asdfjslfjdsasdlkfsdf"
		// 발급 받은 Salt를 이용해 SHA 알고리즘으로 암호화를 진행한다. (복호화 불가능 암호화)

		// Sqlt값과 암호화된 비밀번호를 memberRegistRequestVO에 알맞게 해당한다.

		// 데이터베이스에 저장한다.

		String salt = this.sha.generateSalt();

		String password = memberRegistRequestVO.getPassword();
		password = this.sha.getEncrypt(password, salt);

		memberRegistRequestVO.setPassword(password);
		memberRegistRequestVO.setSalt(salt);

		return this.memberDao.insertNewMember(memberRegistRequestVO) > 0;
	}
	@Transactional(readOnly=true)
	@Override
	public boolean checkDuplicateEmail(String email) {
		// count -> 1이면 true
		return this.memberDao.selectMemberCount(email) == 1;
	}

	@Override
	public MembersVO doLogin(MemberLoginRequestVO memberLoginRequestVO) {

		// 1. email로 회원의 모든 정보를 조회한다.
		MembersVO memberVO = this.memberDao.selectOneMemeberBy(memberLoginRequestVO.getEmail());
		// 1-1 회원의 정보가 null이면 사용자가에게 예외를 던져 버린다.
		// "비밀번호 또는 이메일을 잘못 작성했습니다. 확인 후 다시 시도해주세요"
		if (memberVO == null) {
//			throw new IllegalArgumentException("비밀번호 또는 이메일을 잘못 작성했습니다. 확인 후 다시 시도해주세요");
			throw new MemberLoginException(memberLoginRequestVO);
		}

		// 2. 회원의 정보 중 BLOCK_YN ="Y" 라면 예외릘 던져버린다.
		// "비밀번호가 N차례 틀려 계정 접근이 제한 되었습니다. 관리자에게 문의하세요."
		if (memberVO.getBlockYn().equals("Y")) {
//			throw new IllegalArgumentException(
//					"비밀번호가 " + memberVO.getLoginFailCount() + "차례 틀려 계정 접근이 제한 되었습니다. 관리자에게 문의하세요.");
			throw new MemberLoginException(memberLoginRequestVO, memberVO.getLoginFailCount());
		}

		// 3. SALT를 이용해 memberLoginRequestVO의 password를 암호화 한다.
		String salt = memberVO.getSalt();
		String password = memberLoginRequestVO.getPassword();
		password = sha.getEncrypt(password, salt);

		// 4. 회원의 정보 중 password 값이 memberLoginRequestVO의 암호화된 password와 같은지 비교한다.
		if (!memberVO.getPassword().equals(password)) {
			// 5. 만약 다르면 members 테이블의 loginFailCount 값을 1 증가시킨다.
			// latestLoginFailDate는 현재시간으로 업데이트 시킨다.
			this.memberDao.updateLoginFailCount(memberLoginRequestVO.getEmail());
			// 6. 업데이트된 loginFailCount의 길이 5이상이라면 "BLOCK_YN"값을 "Y"로 업데이트 시킨다.
			this.memberDao.updateBlock(memberLoginRequestVO.getEmail());
			// 7. 사용자에게 예외를 던져버린다.
			// "비밀번호 또는 이메일을 잘못 작성했습니다. 확인 후 다시 시도해주세요."
//			throw new IllegalArgumentException("비밀번호 또는 이메일을 잘못 작성했습니다. 확인 후 다시 시도해주세요.");
			throw new MemberLoginException(memberLoginRequestVO);
			// 8. 회원의 정보 중 password 값이 memberLoginRequestVO의 암호화된 password와 같다면
			// Members 테이블의 loginFailCount는 0으로 수정한다.
			// latestLoginDate 현재 시간으로 업데이트한다.
			// latestLoginIp는 사용자의 IP로 업데이트한다.
			// LOGIN_YN은 "Y"로 업데이트 한다.

		} else {
			this.memberDao.updateLoginSuccess(memberLoginRequestVO.getEmail());
		}

		return memberVO;
	}
	@Transactional
	@Override
	public boolean doLogout(String email) {
		return this.memberDao.updateLogOutStatus(email)>0;
	}
	
	@Transactional
	@Override
	public boolean doDeleteMe(String email) {
		// TODO Auto-generated method stub
		return this.memberDao.deleteOneMemberBy(email) > 0;
	}

}