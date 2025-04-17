package com.learn.main.ntc.vo;

import jakarta.validation.constraints.NotEmpty;

public class NtcWriteRequestVO {
	private String ntcId; //NTC_ID
	
	@NotEmpty(message = "제목은 필수 입력값입니다.")
	private String ntcTtl; // NTC_TTL
	
	@NotEmpty(message = "내용은 필수 입력값입니다.")
	private String ntcCtt; // NTC_CTT
	
	private String ntcWrtrId; // NTC_WRTR_ID
	
	private String ntcPinnedYn; // NTC_PINNED_YN
	
//	private String ntcRgstDt; //NTC_RGST_DT
//	private String ntcUpdtDt; //NTC_UPDT_DT
//	private String ntcDelDt; //NTC_DEL_DT
//	private String ntcDelYn; //NTC_DEL_YN
	
	private String artcId; // ARTC_ID
	
	public String getNtcId() {
		return ntcId;
	}

	public void setNtcId(String ntcId) {
		this.ntcId = ntcId;
	}

	public String getNtcTtl() {
		return ntcTtl;
	}

	public void setNtcTtl(String ntcTtl) {
		this.ntcTtl = ntcTtl;
	}

	public String getNtcCtt() {
		return ntcCtt;
	}

	public void setNtcCtt(String ntcCtt) {
		this.ntcCtt = ntcCtt;
	}

	public String getNtcWrtrId() {
		return ntcWrtrId;
	}

	public void setNtcWrtrId(String ntcWrtrId) {
		this.ntcWrtrId = ntcWrtrId;
	}

	public String getNtcPinnedYn() {
		return ntcPinnedYn;
	}

	public void setNtcPinnedYn(String ntcPinnedYn) {
		this.ntcPinnedYn = ntcPinnedYn;
	}

	public String getArtcId() {
		return artcId;
	}

	public void setArtcId(String artcId) {
		this.artcId = artcId;
	}

}
