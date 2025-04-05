package com.hello.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.hello.beans.interceptors.CheckSessionInterceptor;

//@Configurable --> Bean을 매번 생성하는 역할(Prototype scope)
//원래는 bean container에 한 번 만들면 저장 되는게 일반인데, 이 Prototype scope은
//한번만 생성하고 사용하면 사라진다.
@Configuration //Bean을 한 번만 Singleton scope
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer{
	
	
	/**
	 * View Resolver 설정
	 */
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/views/",".jsp");
	}
	
	/**
	 *  Static Resource 설정
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/js/**")
				.addResourceLocations("classpath:/static/");
		registry.addResourceHandler("/css/**")
				.addResourceLocations("classpath:/static/");
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(new CheckSessionInterceptor())
		        .addPathPatterns("/**")
		        .excludePathPatterns("/member/regist",
		        		"/member/available",
		        		"/member/login",
		        		"/member/*-delete-me",
		        		"/board/list",
		        		"/css/**",
		        		"/js/**");
	
	}
}
