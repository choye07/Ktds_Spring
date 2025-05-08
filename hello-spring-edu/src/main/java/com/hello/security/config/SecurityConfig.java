package com.hello.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.hello.member.dao.MemberDao;
import com.hello.security.SecurityAuthenticationProvider;
import com.hello.security.SecuritySHA;
import com.hello.security.SecurityUserDetailsService;
import com.hello.security.handler.LoginFailureHandler;
import com.hello.security.handler.LoginSuccessHandler;
import com.hello.security.jwt.JsonWebTokenProvider;

//spring을 위한 것이 아니라서 webconfig와는 분리

@Configuration
@EnableWebSecurity // -> 우리가 커스터마이징을 한 것들을 적용해준다.
//권한 제어를 Annotaion으로 처리할 수 있게 설정. (Service + Controller Method에 적용)
@EnableMethodSecurity(securedEnabled = true)
public class SecurityConfig {

	@Value("${app.jwt.issuer}")
	private String jwtIssuer;
	
	@Value("${app.jwt.secret-key}")
	private String jwtSecretKey;
	
	@Autowired
	private MemberDao memberDao;

	@Bean
	UserDetailsService userDetailsService() {
		SecurityUserDetailsService userDetailsService = new SecurityUserDetailsService(memberDao);
		userDetailsService.setMemberDao(memberDao);
		return userDetailsService;

	}
	
	@Bean
	JsonWebTokenProvider jwtProvider() {
		return new JsonWebTokenProvider(this.jwtIssuer, this.jwtSecretKey);
	}
	@Bean
	PasswordEncoder passwordEncoder() {
		return new SecuritySHA();
	}

	@Bean
	AuthenticationProvider authenticationProvider() {
		return new SecurityAuthenticationProvider(this.userDetailsService(), this.passwordEncoder());
	}

	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		// Stpring Security Form Login 정책 설정하기
		http.formLogin((formLogin) -> formLogin// .defaultSuccessUrl("/board/list")//인증에 성공했을 때 보낼 주소
				.failureHandler(new LoginFailureHandler(this.memberDao)) // 로그인 실패 후처리
				.successHandler(new LoginSuccessHandler(this.memberDao))// 로그인 성공 후처리
				.loginPage("/member/login") // 로그인을 요청할 수 있는 페이지의 주소 작성
				// 인증이 필요할 경우 Spring Security에 의해서 /member/login 페이지로 자동으로 이동시킨다.
				.loginProcessingUrl("/member/do-login") // 인증을 수행시킬 URL -> 우리가 controller에 만들지 않은 url
														// Spring Security를 커스텀한 코드 중 AuthenticationProvider를 구현한 클래스를
														// 실행시킬 URL
				.usernameParameter("email")
				.passwordParameter("password"));
		
		//CRSF 공격 방어 비활성화
//		http.csrf(csrf ->csrf.disable());
		return http.build();
	}
}
