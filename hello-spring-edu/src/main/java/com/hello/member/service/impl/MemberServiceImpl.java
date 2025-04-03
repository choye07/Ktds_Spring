package com.hello.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.beans.Sha;
import com.hello.member.dao.MemberDao;
import com.hello.member.service.MemberService;
import com.hello.member.vo.MemberRegistRequestVO;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDao memberDao;

    @Autowired
    private Sha sha;
    
	@Override
	public boolean createNewMember(MemberRegistRequestVO memberRegistRequestVO) {
		//사용자가 입력한 비밀 번호 암호화를 위해 Sqlt를 발급 받는다.
		//암호화 -> 원문이 무엇인지 모르게 한다. 
		// 암호화 특징: "ABC"-> "asdf asd gsa"
//							   A     B  C
		// RainbowSheet를 무력화 -> Salt를 이용
		// "23135456" -- 발급할 때마다 다른 문자가 나온다.
		//"ABC" + Salt = "231A354B56C" =>  암호화를 시키게 되면 => asdfjslfjdsasdlkfsdf"
		//발급 받은 Salt를 이용해 SHA 알고리즘으로 암호화를 진행한다. (복호화 불가능 암호화)
		
		//Sqlt값과 암호화된 비밀번호를 memberRegistRequestVO에 알맞게 해당한다.
		
		// 데이터베이스에 저장한다.
		
		String salt=this.sha.generateSalt();
		
		String password = memberRegistRequestVO.getPassword();
		password = this.sha.getEncrypt(password, salt);
		
		memberRegistRequestVO.setPassword(password);
		memberRegistRequestVO.setSalt(salt);
		
		
		return this.memberDao.insertNewMember(memberRegistRequestVO) > 0;
	}

}