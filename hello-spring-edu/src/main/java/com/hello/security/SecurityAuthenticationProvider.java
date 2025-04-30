package com.hello.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

public class SecurityAuthenticationProvider implements AuthenticationProvider {

	private UserDetailsService userDetailsService;

	private PasswordEncoder passwordEncoder;

	public SecurityAuthenticationProvider(UserDetailsService userDetailsService, PasswordEncoder passwordEncoder) {
		this.userDetailsService = userDetailsService;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		// 사용자가 요청한 로그인을 수행하는 과정
		// 1. 사용자가 입력한 이메일을 받아온다.
		String email = authentication.getName();
		// 2. 사용자가 입력한 비밀번호를 받아온다.
		String password = authentication.getCredentials().toString();
		// 비밀번호가 Object인 이유?
		// -> String이 아니라 Object로 반환된다. passkey 즉, 지문일수도 있고 다른 케이스일 수도 있어서
		// 꼭 비밀번호가 문자열이다 라고 명시하지 않는다.

		// 3. 사용자가 입력한 이메일로 데이터베이스에서 회원의 정보를 조회한다. (userDetailsService:
		// SecurityUsersDetailsService)
		SercurityUser userDetails = (SercurityUser) this.userDetailsService.loadUserByUsername(email);
		if(!userDetails.isAccountNonLocked()) {
			throw new LockedException("계정 도용 사례로 의심되어 차단되었습니다.");
		}
		// 4. 사용자가 입력한 비밀번호로 회원의 비밀번호와 일치하는지 검색한다. (passwordEncoder: SecuritySHA)
		SecuritySHA securitySHA = (SecuritySHA) this.passwordEncoder;
		boolean isMatches = securitySHA.matches(password, userDetails.getSalt(), userDetails.getPassword());
		// 5. 비밀번호가 일치하지 않는다면! - BadCreadentioalException을 던진다.
		// - 비밀번호 틀린 횟수 1 증가 (LoginFailureHandler)
		// - 비밀번호가 5회 이상 틀리면 블럭 처리 (LoginFailureHandler)
 		if(!isMatches) {
     			throw new BadCredentialsException("아이디 또는 비밀번호가 일치하지 않습니다.");
			
		}
		// 6. 비밀번호가 일치한다면! - UsernamePasswordAuthenticationToken 인스턴스를 만들어서 반환시킨다.
		return new UsernamePasswordAuthenticationToken(userDetails.getMemberVO(), userDetails.getPassword(), userDetails.getAuthorities());
	}

	
	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}
