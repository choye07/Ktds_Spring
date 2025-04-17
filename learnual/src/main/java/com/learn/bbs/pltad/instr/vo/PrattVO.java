package com.learn.bbs.pltad.instr.vo;

/**
 * @TableName PRATT
 * @TableComment null
 * 강사 이력
 */
public class PrattVO {

    /**
     * @ColumnName PRATT_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 강사의 고유한 이력 아이디
     */
    private String prattId;

    /**
     * @ColumnName PRATT_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 등록 날짜
     */
    private String prattRgstDt;

    /**
     * @ColumnName PRATT_UPDT_DT
     * @ColumnType DATE
     * @ColumnComment 수정 날짜
     */
    private String prattUpdtDt;

    /**
     * @ColumnName PRATT_DEL_DT
     * @ColumnType DATE
     * @ColumnComment 삭제 날짜
     */
    private String prattDelDt;

    /**
     * @ColumnName PRATT_DEL_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 삭제 여부 (Y/N)
     */
    private String prattDelYn;

    /**
     * @ColumnName INSTTN_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 기관(학원) 정보의 고유한 아이디(INSTTN-YYYYMMDD-NNNNNN)
     */
    private String insttnId;

    /**
     * @ColumnName INSTR_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 강사의 고유한 아이디
     */
    private String instrId;

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

    public String getPrattId() {
        return this.prattId;
    }
    
    public void setPrattId(String prattId) {
        this.prattId = prattId;
    }
    
    public String getPrattRgstDt() {
        return this.prattRgstDt;
    }
    
    public void setPrattRgstDt(String prattRgstDt) {
        this.prattRgstDt = prattRgstDt;
    }
    
    public String getPrattUpdtDt() {
        return this.prattUpdtDt;
    }
    
    public void setPrattUpdtDt(String prattUpdtDt) {
        this.prattUpdtDt = prattUpdtDt;
    }
    
    public String getPrattDelDt() {
        return this.prattDelDt;
    }
    
    public void setPrattDelDt(String prattDelDt) {
        this.prattDelDt = prattDelDt;
    }
    
    public String getPrattDelYn() {
        return this.prattDelYn;
    }
    
    public void setPrattDelYn(String prattDelYn) {
        this.prattDelYn = prattDelYn;
    }
    
    public String getInsttnId() {
        return this.insttnId;
    }
    
    public void setInsttnId(String insttnId) {
        this.insttnId = insttnId;
    }
    
    public String getInstrId() {
        return this.instrId;
    }
    
    public void setInstrId(String instrId) {
        this.instrId = instrId;
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
    
    @Override
    public String toString() {
        return "PrattVO(prattId: " + prattId + ", prattRgstDt: " + prattRgstDt + ", prattUpdtDt: " + prattUpdtDt + ", prattDelDt: " + prattDelDt + ", prattDelYn: " + prattDelYn + ", insttnId: " + insttnId + ", instrId: " + instrId + ", crsInfId: " + crsInfId + ", sbjId: " + sbjId + ", )";
    }
}