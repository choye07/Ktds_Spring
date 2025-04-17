package com.learn.bbs.crs.apphstr.vo;

/**
 * @TableName APP_HSTR
 * @TableComment null
 * 신청 내역
 */
public class AppHstrVO {

    /**
     * @ColumnName APP_HSTR_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 신청 내역을 구분할 고유한 문자열(APP_HSTR-YYYYMMDD-NNNNNN)
     */
    private String appHstrId;

    /**
     * @ColumnName APP_HSTR_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 회원이 강좌를 신청한 날짜
     */
    private String appHstrRgstDt;

    /**
     * @ColumnName CRS_INF_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 강좌 정보를 구분할 고유한 문자열(CRS_INF-YYYYMMDD-NNNNNN)
     */
    private String crsInfId;

    /**
     * @ColumnName USR_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 회원을 구분할 고유한 문자열(USER-YYYYMMDD-NNNNNN)
     */
    private String usrId;

    public String getAppHstrId() {
        return this.appHstrId;
    }
    
    public void setAppHstrId(String appHstrId) {
        this.appHstrId = appHstrId;
    }
    
    public String getAppHstrRgstDt() {
        return this.appHstrRgstDt;
    }
    
    public void setAppHstrRgstDt(String appHstrRgstDt) {
        this.appHstrRgstDt = appHstrRgstDt;
    }
    
    public String getCrsInfId() {
        return this.crsInfId;
    }
    
    public void setCrsInfId(String crsInfId) {
        this.crsInfId = crsInfId;
    }
    
    public String getUsrId() {
        return this.usrId;
    }
    
    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }
    
    @Override
    public String toString() {
        return "AppHstrVO(appHstrId: " + appHstrId + ", appHstrRgstDt: " + appHstrRgstDt + ", crsInfId: " + crsInfId + ", usrId: " + usrId + ", )";
    }
}