package com.hello.security.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserService;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AnonymousAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;

import com.hello.security.SecuritySHA;
import com.hello.security.jwt.JsonWebTokenAuthenticationFilter;
import com.hello.security.jwt.JsonWebTokenProvider;
import com.hello.security.oauth.OAuthService;
import com.hello.security.oauth.handlers.OAuthSuccessHandler;

@Configuration
@EnableWebSecurity(debug = true) // Security Filter 를 등록한다.
// 권한 제어를 Annotation으로 처리할 수 있게 설정. (Service + Controller Method에 적용)
@EnableMethodSecurity(securedEnabled = true)
public class SecurityConfig {

	@Value("${app.jwt.issuer}")
	private String jwtIssuer;
	
	@Value("${app.jwt.secret-key}")
	private String jwtSecretKey;
	
	@Autowired
	private OAuthService oAuthService; 
	
//	@Bean
//	OAuth2UserService<OAuth2UserRequest,OAuth2User> oAuthRequestor() {
//		return new DefaultOAuth2UserService();
//	}
	
	@Bean
	JsonWebTokenProvider jwtProvider() {
		return new JsonWebTokenProvider(this.jwtIssuer, this.jwtSecretKey);
	}
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new SecuritySHA();
	}
	
	@Bean
	WebSecurityCustomizer configureIgnoringFilterChain() {
		// 아래에 작성된 URL은 Spring Security Filter Chain의 대상에서 제외된다.
		return web -> web.ignoring()
						 .requestMatchers("/api/v1/auth")
						 .requestMatchers("/api/v1/member/available")
						 .requestMatchers("POST", "/api/v1/member")
						;
	}
	
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		// CSRF 공격 방어 비활성화.
		http.csrf(csrf -> csrf.disable());
		
		// CORS 설정
		// 도메인(호스트)가 다른 서버 혹은 URL에서 오는 요청을 제한시킨다.
		http.cors(cors -> {
			CorsConfigurationSource source = exchage -> {
				CorsConfiguration config = new CorsConfiguration();
				// 1. 외부에서 요청가능한 URL 선별. 아래에 작성된 URL에서만 본 서버에 접근 가능.
				config.setAllowedOrigins(List.of("http://localhost:3000")); // React 서버.
				// 2. 외부에서 요청가능한 METHOD 선별. 아래에 작성된 METHOD만 본 서버에 접근 가능.
				// OPTIONS?
				//  - CORS 정책에 위배되지 않는지 확인하기 위해서 실제 요청 전에 보내는 테스트 요청.
				//  - OPTIONS메소드의 응답이 정상이라면 CORS 정책에 위배되지 않는다. 판단.
				config.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "OPTIONS"));
				// 3. 외부에서 요청가능한 HEADER 선별. 아래에 작성된 HEADER만 본 서버에 접근 가능.
				//  - REQUEST HEADER - HTTP Request Header (Referer, Cookie, Content-Type, ...)
				config.setAllowedHeaders(List.of("*"));
				return config;
			};
			
			cors.configurationSource(source);
		});
		
		http.addFilterAfter(
				new JsonWebTokenAuthenticationFilter(this.jwtProvider()), 
				AnonymousAuthenticationFilter.class);
		
		//oauthLoginFilter 사용한다고 알려주는 코드.
		//토큰을 받고 응답이 왔을 때 처리해주는 것.
		http.oauth2Login(oauth -> 
							oauth.successHandler(new OAuthSuccessHandler(this.jwtProvider()))
							.userInfoEndpoint(user->
								user.userService(this.oAuthService)));
		
		return http.build();
	}
}









