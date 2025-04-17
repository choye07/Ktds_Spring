package com.learn.bbs.crs.classcd.vo;

/**
 * @TableName CLSS_CD
 * @TableComment null
 * 수강코드
 */
public class ClssCdVO {

    /**
     * @ColumnName CLSS_CD_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 수강 코드를 구별하는 고유한 번호(CLSS_CD-YYYYMMDD-NNNNNN)
     */
    private String clssCdId;

    /**
     * @ColumnName CLSS_CD_NM
     * @ColumnType VARCHAR2(100)
     * @ColumnComment 수강 코드 이름
     */
    private String clssCdNm;

    /**
     * @ColumnName CLSS_CD_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 수강 코드 등록 날짜
     */
    private String clssCdRgstDt;

    /**
     * @ColumnName CLSS_CD_UPDT_DT
     * @ColumnType DATE
     * @ColumnComment 수강 코드 수정 날짜
     */
    private String clssCdUpdtDt;

    /**
     * @ColumnName CLSS_CD_DEL_DT
     * @ColumnType DATE
     * @ColumnComment 수강 코드 삭제 날짜
     */
    private String clssCdDelDt;

    /**
     * @ColumnName CLSS_CD_DEL_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 수강 코드 삭제 여부
     */
    private String clssCdDelYn;

    /**
     * @ColumnName CMCD_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 수강 종류를 구별하는 고유한 번호(CM-YYYYMMDD-NNNNNN)
     */
    private String cmcdId;

    public String getClssCdId() {
        return this.clssCdId;
    }
    
    public void setClssCdId(String clssCdId) {
        this.clssCdId = clssCdId;
    }
    
    public String getClssCdNm() {
        return this.clssCdNm;
    }
    
    public void setClssCdNm(String clssCdNm) {
        this.clssCdNm = clssCdNm;
    }
    
    public String getClssCdRgstDt() {
        return this.clssCdRgstDt;
    }
    
    public void setClssCdRgstDt(String clssCdRgstDt) {
        this.clssCdRgstDt = clssCdRgstDt;
    }
    
    public String getClssCdUpdtDt() {
        return this.clssCdUpdtDt;
    }
    
    public void setClssCdUpdtDt(String clssCdUpdtDt) {
        this.clssCdUpdtDt = clssCdUpdtDt;
    }
    
    public String getClssCdDelDt() {
        return this.clssCdDelDt;
    }
    
    public void setClssCdDelDt(String clssCdDelDt) {
        this.clssCdDelDt = clssCdDelDt;
    }
    
    public String getClssCdDelYn() {
        return this.clssCdDelYn;
    }
    
    public void setClssCdDelYn(String clssCdDelYn) {
        this.clssCdDelYn = clssCdDelYn;
    }
    
    public String getCmcdId() {
        return this.cmcdId;
    }
    
    public void setCmcdId(String cmcdId) {
        this.cmcdId = cmcdId;
    }
    
    @Override
    public String toString() {
        return "ClssCdVO(clssCdId: " + clssCdId + ", clssCdNm: " + clssCdNm + ", clssCdRgstDt: " + clssCdRgstDt + ", clssCdUpdtDt: " + clssCdUpdtDt + ", clssCdDelDt: " + clssCdDelDt + ", clssCdDelYn: " + clssCdDelYn + ", cmcdId: " + cmcdId + ", )";
    }
}