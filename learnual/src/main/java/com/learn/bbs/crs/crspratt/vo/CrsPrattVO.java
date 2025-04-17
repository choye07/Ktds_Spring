package com.learn.bbs.crs.crspratt.vo;

/**
 * @TableName CRS_PRATT
 * @TableComment null
 * 수강이력
 */
public class CrsPrattVO {

    /**
     * @ColumnName CRS_PRATT_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 강좌를 구분할 고유한 문자열(CRS-YYYYMMDD-NNNNNN)
     */
    private String crsPrattId;

    /**
     * @ColumnName CRS_PRATT_UPDT_DT
     * @ColumnType DATE
     * @ColumnComment 코드 수정 날짜
     */
    private String crsPrattUpdtDt;

    /**
     * @ColumnName CRS_PRATT_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 코드 등록 날짜
     */
    private String crsPrattRgstDt;

    /**
     * @ColumnName CRS_PRATT_DEL_DT
     * @ColumnType DATE
     * @ColumnComment 코드 삭제 날짜
     */
    private String crsPrattDelDt;

    /**
     * @ColumnName CRS_PRATT_DEL_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 코드 삭제 여부를 나타내는 컬럼
     */
    private String crsPrattDelYn;

    /**
     * @ColumnName USR_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 회원을 구분할 고유한 문자열(USER-YYYYMMDD-NNNNNN)
     */
    private String usrId;

    /**
     * @ColumnName CRS_INF_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 강좌 정보를 구분할 고유한 문자열(CRS_INF-YYYYMMDD-NNNNNN)
     */
    private String crsInfId;

    /**
     * @ColumnName SBJ_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 과목을 구별하는 고유한 번호
     */
    private String sbjId;

    /**
     * @ColumnName INSTR_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 강사의 고유한 아이디
     */
    private String instrId;

    public String getCrsPrattId() {
        return this.crsPrattId;
    }
    
    public void setCrsPrattId(String crsPrattId) {
        this.crsPrattId = crsPrattId;
    }
    
    public String getCrsPrattUpdtDt() {
        return this.crsPrattUpdtDt;
    }
    
    public void setCrsPrattUpdtDt(String crsPrattUpdtDt) {
        this.crsPrattUpdtDt = crsPrattUpdtDt;
    }
    
    public String getCrsPrattRgstDt() {
        return this.crsPrattRgstDt;
    }
    
    public void setCrsPrattRgstDt(String crsPrattRgstDt) {
        this.crsPrattRgstDt = crsPrattRgstDt;
    }
    
    public String getCrsPrattDelDt() {
        return this.crsPrattDelDt;
    }
    
    public void setCrsPrattDelDt(String crsPrattDelDt) {
        this.crsPrattDelDt = crsPrattDelDt;
    }
    
    public String getCrsPrattDelYn() {
        return this.crsPrattDelYn;
    }
    
    public void setCrsPrattDelYn(String crsPrattDelYn) {
        this.crsPrattDelYn = crsPrattDelYn;
    }
    
    public String getUsrId() {
        return this.usrId;
    }
    
    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }
    
    public String getCrsInfId() {
        return this.crsInfId;
    }
    
    public void setCrsInfId(String crsInfId) {
        this.crsInfId = crsInfId;
    }
    
    public String getSbjId() {
        return this.sbjId;
    }
    
    public void setSbjId(String sbjId) {
        this.sbjId = sbjId;
    }
    
    public String getInstrId() {
        return this.instrId;
    }
    
    public void setInstrId(String instrId) {
        this.instrId = instrId;
    }
    
    @Override
    public String toString() {
        return "CrsPrattVO(crsPrattId: " + crsPrattId + ", crsPrattUpdtDt: " + crsPrattUpdtDt + ", crsPrattRgstDt: " + crsPrattRgstDt + ", crsPrattDelDt: " + crsPrattDelDt + ", crsPrattDelYn: " + crsPrattDelYn + ", usrId: " + usrId + ", crsInfId: " + crsInfId + ", sbjId: " + sbjId + ", instrId: " + instrId + ", )";
    }
}