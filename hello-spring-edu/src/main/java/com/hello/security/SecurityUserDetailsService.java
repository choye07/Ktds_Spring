package com.hello.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.hello.member.dao.MemberDao;
import com.hello.member.vo.MembersVO;

/**
 * 
 */
public class SecurityUserDetailsService implements UserDetailsService {
	private MemberDao memberDao;
	

	public MemberDao getMemberDao() {
		return memberDao;
	}

	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public SecurityUserDetailsService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		MembersVO membersVO= this.memberDao.selectOneMemeberBy(username);
		
		if (membersVO==null) {
			throw new UsernameNotFoundException("아이디 또는 비밀번호가 일치하지 않습니다.");
			
		}
		
		UserDetails userDetails = new SercurityUser(membersVO);
		
		return userDetails;
	}

}
