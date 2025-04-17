package com.learn.bbs.pltad.instr.vo;

/**
 * @TableName CRR
 * @TableComment null
 * 강사 경력
 */
public class CrrVO {

    /**
     * @ColumnName CRR_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 강사의 고유한 경력 아이디
     */
    private String crrId;

    /**
     * @ColumnName CRR_CMPN_NM
     * @ColumnType VARCHAR2(100)
     * @ColumnComment 경력 회사명
     */
    private String crrCmpnNm;

    /**
     * @ColumnName CRR_JOB_NM
     * @ColumnType VARCHAR2(100)
     * @ColumnComment 경력 직무명
     */
    private String crrJobNm;

    /**
     * @ColumnName CRR_ST_DT
     * @ColumnType DATE
     * @ColumnComment 경력 시작 날짜
     */
    private String crrStDt;

    /**
     * @ColumnName CRR_END_DT
     * @ColumnType DATE
     * @ColumnComment 경력 종료 날짜
     */
    private String crrEndDt;

    /**
     * @ColumnName CRR_PRJ_NM
     * @ColumnType CLOB
     * @ColumnComment 프로젝트 경력 명/ CLOB: 길이제한 없음
     */
    private String crrPrjNm;

    /**
     * @ColumnName CRR_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 등록 날짜
     */
    private String crrRgstDt;

    /**
     * @ColumnName CRR_UPDT_DT
     * @ColumnType DATE
     * @ColumnComment 수정 날짜
     */
    private String crrUpdtDt;

    /**
     * @ColumnName CRR_DEL_DT
     * @ColumnType DATE
     * @ColumnComment 삭제 날짜
     */
    private String crrDelDt;

    /**
     * @ColumnName CRR_DEL_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 삭제 여부 (Y/N)
     */
    private String crrDelYn;

    /**
     * @ColumnName INSTR_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 강사의 고유한 아이디
     */
    private String instrId;

    public String getCrrId() {
        return this.crrId;
    }
    
    public void setCrrId(String crrId) {
        this.crrId = crrId;
    }
    
    public String getCrrCmpnNm() {
        return this.crrCmpnNm;
    }
    
    public void setCrrCmpnNm(String crrCmpnNm) {
        this.crrCmpnNm = crrCmpnNm;
    }
    
    public String getCrrJobNm() {
        return this.crrJobNm;
    }
    
    public void setCrrJobNm(String crrJobNm) {
        this.crrJobNm = crrJobNm;
    }
    
    public String getCrrStDt() {
        return this.crrStDt;
    }
    
    public void setCrrStDt(String crrStDt) {
        this.crrStDt = crrStDt;
    }
    
    public String getCrrEndDt() {
        return this.crrEndDt;
    }
    
    public void setCrrEndDt(String crrEndDt) {
        this.crrEndDt = crrEndDt;
    }
    
    public String getCrrPrjNm() {
        return this.crrPrjNm;
    }
    
    public void setCrrPrjNm(String crrPrjNm) {
        this.crrPrjNm = crrPrjNm;
    }
    
    public String getCrrRgstDt() {
        return this.crrRgstDt;
    }
    
    public void setCrrRgstDt(String crrRgstDt) {
        this.crrRgstDt = crrRgstDt;
    }
    
    public String getCrrUpdtDt() {
        return this.crrUpdtDt;
    }
    
    public void setCrrUpdtDt(String crrUpdtDt) {
        this.crrUpdtDt = crrUpdtDt;
    }
    
    public String getCrrDelDt() {
        return this.crrDelDt;
    }
    
    public void setCrrDelDt(String crrDelDt) {
        this.crrDelDt = crrDelDt;
    }
    
    public String getCrrDelYn() {
        return this.crrDelYn;
    }
    
    public void setCrrDelYn(String crrDelYn) {
        this.crrDelYn = crrDelYn;
    }
    
    public String getInstrId() {
        return this.instrId;
    }
    
    public void setInstrId(String instrId) {
        this.instrId = instrId;
    }
    
    @Override
    public String toString() {
        return "CrrVO(crrId: " + crrId + ", crrCmpnNm: " + crrCmpnNm + ", crrJobNm: " + crrJobNm + ", crrStDt: " + crrStDt + ", crrEndDt: " + crrEndDt + ", crrPrjNm: " + crrPrjNm + ", crrRgstDt: " + crrRgstDt + ", crrUpdtDt: " + crrUpdtDt + ", crrDelDt: " + crrDelDt + ", crrDelYn: " + crrDelYn + ", instrId: " + instrId + ", )";
    }
}