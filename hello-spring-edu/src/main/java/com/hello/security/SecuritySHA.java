package com.hello.security;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.hello.beans.Sha;

public class SecuritySHA extends Sha implements PasswordEncoder{

	public String encode(CharSequence rawPassword, String salt) {
		return super.getEncrypt(rawPassword.toString(), salt); 
	}
	
	public boolean matches(CharSequence rawPassword, String salt, String encodedPassword) {
		String enteredPassword = this.encode(rawPassword,salt);
		boolean isMatches = this.matches(enteredPassword, encodedPassword);
		return isMatches;
	}
	@Override
	public String encode(CharSequence rawPassword) {
		return null;
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		String convertedRawPassword = rawPassword.toString();
		return convertedRawPassword.equals(encodedPassword);
	}

}
