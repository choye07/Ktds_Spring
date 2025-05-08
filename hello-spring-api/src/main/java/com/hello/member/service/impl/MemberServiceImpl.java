package com.hello.member.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hello.beans.Sha;
import com.hello.exceptions.ApiException;
import com.hello.member.dao.MemberDao;
import com.hello.member.service.MemberService;
import com.hello.member.vo.MemberAuthVO;
import com.hello.member.vo.MemberRegistRequestVO;
import com.hello.member.vo.MembersVO;
import com.hello.security.SecuritySHA;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDao memberDao;

    @Autowired
    private Sha sha;
    
    @Autowired
	private PasswordEncoder passwordEncoder;
    
    @Transactional
    @Override
    public boolean createNewMember(MemberRegistRequestVO memberRegistRequestVO) {
    	
    	int emailCount = this.memberDao.selectMemberCountBy(memberRegistRequestVO.getEmail());
    	if (emailCount == 1) {
    		throw new ApiException("이미 존재하는 이메일입니다.");
    	}
    	
    	// 사용자가 입력한 비밀번호 암호화를 위해 Salt를 발급 받는다.
    	// 암호화 -> 원문이 무엇인지 모르게 한다.
    	// "ABC" -> 암호화 -> "dsalkjas dlkfdsal fklajfs"
    	//                       A        B        C
    	//        Rainbow Sheet
    	//   Rainbow Sheet를 무력화. -> Salt를 이용.
    	// "123908123" -- 발급 할 때마다 다른 문자가 나온다.
    	// "ABC" + Salt = "123A908B123C" => 암호화 => "dsaflkdjsaf09r3ujioklsdnfas"
    	
    	String salt = this.sha.generateSalt();
    	
    	// 발급받은 Salt를 이용해 SHA 알고리즘으로 암호화를 진행한다. (복호화 불가능 암호화)
    	String password = memberRegistRequestVO.getPassword();
    	password = this.sha.getEncrypt(password, salt);
    	
    	// Salt값과 암호화된 비밀번호를 memberRegistRequestVO에 알맞게 할당한다.
    	memberRegistRequestVO.setPassword(password);
    	memberRegistRequestVO.setSalt(salt);
    	
    	int insertCount= this.memberDao.insertNewMember(memberRegistRequestVO);
    	
    	
    	if(insertCount > 0) {
    		MembersVO memberVO = new MembersVO ();
    		memberVO.setEmail(memberRegistRequestVO.getEmail());
    		memberVO.setRole("ROLE_USER");
    		this.memberDao.insertActions(memberVO);
    
    	}
    	
    	// 데이터베이스에 저장한다.
    	return insertCount > 0;
    }
    
    @Override
    public MembersVO auth(MemberAuthVO memberAuthVO) {
    	MembersVO membersVO = this.memberDao.selectOneMemberBy(memberAuthVO.getEmail());
		if (membersVO == null) {
			throw new ApiException("아이디 또는 비밀번호가 일치하지 않습니다.");
		}
		
		if (membersVO.getBlockYn().equals("Y")) {
			throw new ApiException("계정 도용 사례로 의심되어 차단되었습니다.");
		}
		
		SecuritySHA securitySHA = (SecuritySHA) passwordEncoder;
		boolean isMatches = securitySHA.matches(memberAuthVO.getPassword(), membersVO.getSalt(), membersVO.getPassword());
		if (!isMatches) {
			this.memberDao.updateLoginFailCount(memberAuthVO.getEmail());
			this.memberDao.updateBlock(memberAuthVO.getEmail());
			throw new ApiException("아이디 또는 비밀번호가 일치하지 않습니다.");
		}
		
		this.memberDao.updateLoginSuccess(memberAuthVO.getEmail());
    	return membersVO;
    }
    
    @Transactional(readOnly = true)
    @Override
    public boolean checkDuplicateEmail(String email) {
    	return this.memberDao.selectMemberCountBy(email) == 1;
    }
    
    @Transactional
    @Override
    public boolean doDeleteMe(String email) {
    	return this.memberDao.deleteOneMemberBy(email) > 0;
    }
    
}








