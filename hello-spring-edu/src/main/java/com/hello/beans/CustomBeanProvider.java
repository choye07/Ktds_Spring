package com.hello.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hello.board.dao.BoardDao;
import com.hello.replies.dao.ReplyDao;

/**
 * hello-spring-edu project에 필요한 bean들을 생성하는 역할
 * 생성하는 bean들의 종류
 * @Controller, @Service, @Repository, @Component를 제외한 모든 빈.
 */

@Configuration // Spring Boot Applicatio의 설정을 담당 & Bean 생성
public class CustomBeanProvider {

	//application.yml 파일의 설정을 얻어올 수 있음.
	// -> @Controller, @Service, @Repository, @Component에서 얻어올 수 있음.
	@Value("${app.multipart.base-dir.windows:C:\\upload-files}")
	private String baseDirWindows;
	@Value("${app.multipart.base-dir.linux:/var/local/src/upload-files}")
	private String baseDirLinux;
	@Value("${app.multipart.base-dir.macos:/Users/codemakers/document/upload-files}")
	private String baseDirMacos;
	@Value("${app.multipart.obfuscation.enable:false}")
	private boolean obfuscationEnable;
	@Value("${app.multipart.obfuscation.hide-ext.enable:false}")
	private boolean obfuscationHideExtEnable;
	
	@Autowired
	private BoardDao boardDao;
	
	@Autowired
	private ReplyDao replyDao;
	
	@Bean
	ResourceAccessHandler rah() {
		return new ResourceAccessHandler(boardDao, replyDao);
	}
	
	
	//FileHandler Bean 생성 (빈의 이름을 명시하지 않으면 메소드의 이름이 빈의 이름이 된다.)
	@Bean
	FileHandler fileHendler() {
		FileHandler fileHandler = new FileHandler();
		fileHandler.setBaseDirWindows(baseDirWindows);
		fileHandler.setBaseDirLinux(baseDirLinux);
		fileHandler.setBaseDirMacos(baseDirMacos);
		
		String osname= System.getProperty("os.name");
		fileHandler.setOsname(osname.toLowerCase());
		
		return fileHandler;
	}
	@Bean
	Sha sha() {
		return new Sha();
	}
	
}
