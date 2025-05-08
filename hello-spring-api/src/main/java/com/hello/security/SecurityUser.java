package com.hello.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.hello.member.vo.ActionVO;
import com.hello.member.vo.MembersVO;

public class SecurityUser implements UserDetails {

	private static final long serialVersionUID = -7519087630087512483L;
	
	private MembersVO membersVO;
	
	public SecurityUser(MembersVO membersVO) {
		this.membersVO = membersVO;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// 권한/역할 정보는 데이터베이스에서 관리.
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();
		
		// 역할 부여 (ROLE)
		authorities.add(new SimpleGrantedAuthority(this.membersVO.getRole()));
		
		// 권한 부여 (ACTION)
		for (ActionVO actionVO : this.membersVO.getActionList()) {
			authorities.add(new SimpleGrantedAuthority(actionVO.getActionId()));
		}
		
		return authorities;
	}

	@Override
	public String getPassword() {
		return this.membersVO.getPassword();
	}

	@Override
	public String getUsername() {
		return this.membersVO.getEmail();
	}
	
	public MembersVO getMembersVO() {
		return this.membersVO;
	}
	
	public String getSalt() {
		return this.membersVO.getSalt();
	}
	
	@Override
	public boolean isAccountNonLocked() {
		return this.membersVO.getBlockYn().equals("N");
	}

}






