package com.hello.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

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

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return List.of(new SimpleGrantedAuthority("CREATE"), new SimpleGrantedAuthority("UPDATE"),
				new SimpleGrantedAuthority("DLELTE"), new SimpleGrantedAuthority("READ"));
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
