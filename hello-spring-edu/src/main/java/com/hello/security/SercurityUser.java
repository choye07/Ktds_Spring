package com.hello.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.hello.member.vo.ActionVO;
import com.hello.member.vo.MembersVO;

public class SercurityUser implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 477938161833882306L;

	private MembersVO memberVO;

	public SercurityUser(MembersVO memberVO) {
		this.memberVO = memberVO;
	}

	public MembersVO getMemberVO() {
		return memberVO;
	}

	public void setMemberVO(MembersVO memberVO) {
		this.memberVO = memberVO;
	}

	
	//권한과 역할을 이제 DB에서 가져와야함.
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();
	
		//역할 부여 (ROLE)
		authorities.add(new SimpleGrantedAuthority(this.memberVO.getRole()));
		
		// 권한 부여 (ACTION)
		for(ActionVO actionVO : this.memberVO.getActionList()) {
			authorities.add(new SimpleGrantedAuthority(actionVO.getActionId()));
		}
		
		
		return authorities;
		
	
		
		/*
		 * return List.of(new SimpleGrantedAuthority("CREATE") , new
		 * SimpleGrantedAuthority("UPDATE") ,new SimpleGrantedAuthority("DLELTE") , new
		 * SimpleGrantedAuthority("READ"));
		 */
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.memberVO.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.memberVO.getEmail();
	}
	
	public String getSalt() {
		return memberVO.getSalt();
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return this.memberVO.getBlockYn().equals("N");
	}

}
