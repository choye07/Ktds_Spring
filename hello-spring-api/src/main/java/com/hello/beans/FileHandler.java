package com.hello.beans;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

public class FileHandler {

	private String baseDirWindows;
	private String baseDirLinux;
	private String baseDirMacos;

	private boolean obfuscationEnable;
	private boolean obfuscationHideExtEnable;

	private String osname;

	public void setBaseDirWindows(String baseDirWindows) {
		this.baseDirWindows = baseDirWindows;
	}

	public void setBaseDirLinux(String baseDirLinux) {
		this.baseDirLinux = baseDirLinux;
	}

	public void setBaseDirMacos(String baseDirMacos) {
		this.baseDirMacos = baseDirMacos;
	}

	public void setObfuscationEnable(boolean obfuscationEnable) {
		this.obfuscationEnable = obfuscationEnable;
	}

	public void setObfuscationHideExtEnable(boolean obfuscationHideExtEnable) {
		this.obfuscationHideExtEnable = obfuscationHideExtEnable;
	}

	public void setOsname(String osname) {
		this.osname = osname;
	}

	public StoredFile store(MultipartFile multipartFile) {
		
		if (multipartFile == null || multipartFile.isEmpty()) {
			return null;
		}
		
		String fileName = this.getObfuscationFileName( multipartFile.getOriginalFilename() );
		
		File storePath = null;
		// 목적지 설정
		if ( osname.startsWith("windows") ) {
			storePath = new File(this.baseDirWindows, fileName);
		}
		else if ( osname.startsWith("mac") ) {
			String homePath = System.getProperty("user.home");
			storePath = new File(homePath + this.baseDirMacos, fileName);
		}
		else {
			storePath = new File(this.baseDirLinux, fileName);
		}
		
		if ( ! storePath.getParentFile().exists() ) {
			storePath.getParentFile().mkdirs();
		}
		
		// 업로드한 파일을 저장.
		try {
			multipartFile.transferTo(storePath);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
			// 업로드 실패!
			// 파일을 저장하는 경로가 접근불가능한 경로 일 때 (Windows기준: C:\\ 직접 업로드할 때)
			// 디스크의 남은 용량이 부족할 때. (남아있는 용량 < 업로드한 파일의 크기)
			return null;
		}
		
		// 업로드 성공!
		// String fileName, String realFileName, String realFilePath, long fileSize
		return new StoredFile( 
				multipartFile.getOriginalFilename(), 
				fileName,
				storePath.getAbsolutePath(),
				storePath.length());
	}

	public String getObfuscationFileName(String fileName) {
		if (obfuscationEnable) {
			String ext = fileName.substring( fileName.lastIndexOf(".") );
			fileName = UUID.randomUUID().toString();
			
			if ( ! obfuscationHideExtEnable) {
				fileName += ext;
			}
		}
		
		return fileName;
	}

	public class StoredFile {
		private String fileName;
		private String realFileName;
		private String realFilePath;
		private long fileSize;

		public StoredFile(String fileName, String realFileName, String realFilePath, long fileSize) {
			this.fileName = fileName;
			this.realFileName = realFileName;
			this.realFilePath = realFilePath;
			this.fileSize = fileSize;
		}

		public String getFileName() {
			return fileName;
		}

		public String getRealFileName() {
			return realFileName;
		}

		public String getRealFilePath() {
			return realFilePath;
		}

		public long getFileSize() {
			return fileSize;
		}

	}
}
