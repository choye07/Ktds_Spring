package com.learn.bbs.cnsl.vo;

/**
 * @TableName CNSL
 * @TableComment null
 * 상담
 */
public class CnslVO {

    /**
     * @ColumnName CNSL_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 상담 게시글의 고유한 아이디(CNSL-YYYYMMDD-NNNNNN)
     */
    private String cnslId;

    /**
     * @ColumnName CNSL_TTL
     * @ColumnType VARCHAR2(100)
     * @ColumnComment 상담 게시글의 제목
     */
    private String cnslTtl;

    /**
     * @ColumnName CNSL_CTT
     * @ColumnType VARCHAR2(4000)
     * @ColumnComment 상담 게시글의 내용
     */
    private String cnslCtt;

    /**
     * @ColumnName CNSL_APPLY_DT
     * @ColumnType DATE
     * @ColumnComment 상담 요청일
     */
    private String cnslApplyDt;

    /**
     * @ColumnName CNSL_FINISH_DT
     * @ColumnType DATE
     * @ColumnComment 상담 완료일
     */
    private String cnslFinishDt;

    /**
     * @ColumnName CNSL_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 상담 정보 게시글 게시 날짜
     */
    private String cnslRgstDt;

    /**
     * @ColumnName CNSL_UPDT_DT
     * @ColumnType DATE
     * @ColumnComment 상담 정보 게시글 수정 날짜
     */
    private String cnslUpdtDt;

    /**
     * @ColumnName CNSL_DEL_DT
     * @ColumnType DATE
     * @ColumnComment 상담 정보 게시글 삭제 날짜
     */
    private String cnslDelDt;

    /**
     * @ColumnName CNSL_DEL_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 상담 정보 게시글 삭제 여부
     */
    private String cnslDelYn;

    /**
     * @ColumnName CNSL_COM_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 상담 완료 여부
     */
    private String cnslComYn;

    /**
     * @ColumnName ARTC_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 게시판의 고유한 아이디(ARTC-YYYYMMDD-NNNNNN)
     */
    private String artcId;

    /**
     * @ColumnName INSTR_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 강좌 정보를 구분할 고유한 문자열(CRS_INF-YYYYMMDD-NNNNNN)
     */
    private String instrId;

    /**
     * @ColumnName USR_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 사용자의 고유한 아이디(USER-YYYYMMDD-NNNNNN)
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

    public String getCnslId() {
        return this.cnslId;
    }
    
    public void setCnslId(String cnslId) {
        this.cnslId = cnslId;
    }
    
    public String getCnslTtl() {
        return this.cnslTtl;
    }
    
    public void setCnslTtl(String cnslTtl) {
        this.cnslTtl = cnslTtl;
    }
    
    public String getCnslCtt() {
        return this.cnslCtt;
    }
    
    public void setCnslCtt(String cnslCtt) {
        this.cnslCtt = cnslCtt;
    }
    
    public String getCnslApplyDt() {
        return this.cnslApplyDt;
    }
    
    public void setCnslApplyDt(String cnslApplyDt) {
        this.cnslApplyDt = cnslApplyDt;
    }
    
    public String getCnslFinishDt() {
        return this.cnslFinishDt;
    }
    
    public void setCnslFinishDt(String cnslFinishDt) {
        this.cnslFinishDt = cnslFinishDt;
    }
    
    public String getCnslRgstDt() {
        return this.cnslRgstDt;
    }
    
    public void setCnslRgstDt(String cnslRgstDt) {
        this.cnslRgstDt = cnslRgstDt;
    }
    
    public String getCnslUpdtDt() {
        return this.cnslUpdtDt;
    }
    
    public void setCnslUpdtDt(String cnslUpdtDt) {
        this.cnslUpdtDt = cnslUpdtDt;
    }
    
    public String getCnslDelDt() {
        return this.cnslDelDt;
    }
    
    public void setCnslDelDt(String cnslDelDt) {
        this.cnslDelDt = cnslDelDt;
    }
    
    public String getCnslDelYn() {
        return this.cnslDelYn;
    }
    
    public void setCnslDelYn(String cnslDelYn) {
        this.cnslDelYn = cnslDelYn;
    }
    
    public String getCnslComYn() {
        return this.cnslComYn;
    }
    
    public void setCnslComYn(String cnslComYn) {
        this.cnslComYn = cnslComYn;
    }
    
    public String getArtcId() {
        return this.artcId;
    }
    
    public void setArtcId(String artcId) {
        this.artcId = artcId;
    }
    
    public String getInstrId() {
        return this.instrId;
    }
    
    public void setInstrId(String instrId) {
        this.instrId = instrId;
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
    
    @Override
    public String toString() {
        return "CnslVO(cnslId: " + cnslId + ", cnslTtl: " + cnslTtl + ", cnslCtt: " + cnslCtt + ", cnslApplyDt: " + cnslApplyDt + ", cnslFinishDt: " + cnslFinishDt + ", cnslRgstDt: " + cnslRgstDt + ", cnslUpdtDt: " + cnslUpdtDt + ", cnslDelDt: " + cnslDelDt + ", cnslDelYn: " + cnslDelYn + ", cnslComYn: " + cnslComYn + ", artcId: " + artcId + ", instrId: " + instrId + ", usrId: " + usrId + ", crsInfId: " + crsInfId + ", sbjId: " + sbjId + ", )";
    }
}