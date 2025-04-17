package com.learn.bbs.crs.sbj.vo;

/**
 * @TableName SBJ
 * @TableComment null
 */
public class SbjVO {

    /**
     * @ColumnName SBJ_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 과목을 구별하는 고유한 번호
     */
    private String sbjId;

    /**
     * @ColumnName SBJ_NM
     * @ColumnType VARCHAR2(100)
     * @ColumnComment 과목 명
     */
    private String sbjNm;

    /**
     * @ColumnName SBJ_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 과목을 등록한 날짜
     */
    private String sbjRgstDt;

    /**
     * @ColumnName SBJ_UPDT_DT
     * @ColumnType DATE
     * @ColumnComment 과목을 수정한 날짜
     */
    private String sbjUpdtDt;

    /**
     * @ColumnName SBJ_DEL_DT
     * @ColumnType DATE
     * @ColumnComment 과목을 삭제한 날짜
     */
    private String sbjDelDt;

    /**
     * @ColumnName SBJ_DEL_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 과목 삭제 여부
     */
    private String sbjDelYn;

    /**
     * @ColumnName CLSS_CD_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 수강 코드를 구별하는 고유한 번호(CLSS_CD-YYYYMMDD-NNNNNN)
     */
    private String clssCdId;

    public String getSbjId() {
        return this.sbjId;
    }
    
    public void setSbjId(String sbjId) {
        this.sbjId = sbjId;
    }
    
    public String getSbjNm() {
        return this.sbjNm;
    }
    
    public void setSbjNm(String sbjNm) {
        this.sbjNm = sbjNm;
    }
    
    public String getSbjRgstDt() {
        return this.sbjRgstDt;
    }
    
    public void setSbjRgstDt(String sbjRgstDt) {
        this.sbjRgstDt = sbjRgstDt;
    }
    
    public String getSbjUpdtDt() {
        return this.sbjUpdtDt;
    }
    
    public void setSbjUpdtDt(String sbjUpdtDt) {
        this.sbjUpdtDt = sbjUpdtDt;
    }
    
    public String getSbjDelDt() {
        return this.sbjDelDt;
    }
    
    public void setSbjDelDt(String sbjDelDt) {
        this.sbjDelDt = sbjDelDt;
    }
    
    public String getSbjDelYn() {
        return this.sbjDelYn;
    }
    
    public void setSbjDelYn(String sbjDelYn) {
        this.sbjDelYn = sbjDelYn;
    }
    
    public String getClssCdId() {
        return this.clssCdId;
    }
    
    public void setClssCdId(String clssCdId) {
        this.clssCdId = clssCdId;
    }
    
    @Override
    public String toString() {
        return "SbjVO(sbjId: " + sbjId + ", sbjNm: " + sbjNm + ", sbjRgstDt: " + sbjRgstDt + ", sbjUpdtDt: " + sbjUpdtDt + ", sbjDelDt: " + sbjDelDt + ", sbjDelYn: " + sbjDelYn + ", clssCdId: " + clssCdId + ", )";
    }
}