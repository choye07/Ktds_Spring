package com.learn.bbs.pltad.cnfr.vo;

/**
 * @TableName CNFR_HSTR
 * @TableComment null
 * 확정 내역
 */
public class CnfrHstrVO {

    /**
     * @ColumnName CNFR_HSTR_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 확정 내역을 구분할 고유한 문자열(CNFR_HSTR-YYYYMMDD-NNNNNN)
     */
    private String cnfrHstrId;

    /**
     * @ColumnName CNFR_HSTR_APP_DT
     * @ColumnType DATE
     * @ColumnComment 확정이 된 날짜
     */
    private String cnfrHstrAppDt;

    /**
     * @ColumnName CNFR_HSTR_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 확정이 됐는지에 대한 여부
     */
    private String cnfrHstrYn;

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

    public String getCnfrHstrId() {
        return this.cnfrHstrId;
    }
    
    public void setCnfrHstrId(String cnfrHstrId) {
        this.cnfrHstrId = cnfrHstrId;
    }
    
    public String getCnfrHstrAppDt() {
        return this.cnfrHstrAppDt;
    }
    
    public void setCnfrHstrAppDt(String cnfrHstrAppDt) {
        this.cnfrHstrAppDt = cnfrHstrAppDt;
    }
    
    public String getCnfrHstrYn() {
        return this.cnfrHstrYn;
    }
    
    public void setCnfrHstrYn(String cnfrHstrYn) {
        this.cnfrHstrYn = cnfrHstrYn;
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
        return "CnfrHstrVO(cnfrHstrId: " + cnfrHstrId + ", cnfrHstrAppDt: " + cnfrHstrAppDt + ", cnfrHstrYn: " + cnfrHstrYn + ", crsInfId: " + crsInfId + ", usrId: " + usrId + ", )";
    }
}