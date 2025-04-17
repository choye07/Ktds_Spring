package com.learn.bbs.pltad.cmcd.vo;

/**
 * @TableName CM_CODE
 * @TableComment null
 * 공통 코드
 */
public class CmCodeVO {

    /**
     * @ColumnName CMCD_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 코드를 구별하는 고유한 번호(CM-YYYYMMDD-NNNNNN)
     */
    private String cmcdId;

    /**
     * @ColumnName HGH_RNK_CMCD_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 코드를 구별하는 상위 코드 번호
     */
    private String hghRnkCmcdId;

    /**
     * @ColumnName CMCD_NM
     * @ColumnType VARCHAR2(100)
     * @ColumnComment 코드 이름
     */
    private String cmcdNm;

    /**
     * @ColumnName CMCD_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 코드 등록 날짜
     */
    private String cmcdRgstDt;

    /**
     * @ColumnName CMCD_UPDT_DT
     * @ColumnType DATE
     * @ColumnComment 코드 수정 날짜
     */
    private String cmcdUpdtDt;

    /**
     * @ColumnName CMCD_DEL_DT
     * @ColumnType DATE
     * @ColumnComment 코드 삭제 날짜
     */
    private String cmcdDelDt;

    /**
     * @ColumnName CMCD_DEL_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 코드 삭제 여부
     */
    private String cmcdDelYn;

    public String getCmcdId() {
        return this.cmcdId;
    }
    
    public void setCmcdId(String cmcdId) {
        this.cmcdId = cmcdId;
    }
    
    public String getHghRnkCmcdId() {
        return this.hghRnkCmcdId;
    }
    
    public void setHghRnkCmcdId(String hghRnkCmcdId) {
        this.hghRnkCmcdId = hghRnkCmcdId;
    }
    
    public String getCmcdNm() {
        return this.cmcdNm;
    }
    
    public void setCmcdNm(String cmcdNm) {
        this.cmcdNm = cmcdNm;
    }
    
    public String getCmcdRgstDt() {
        return this.cmcdRgstDt;
    }
    
    public void setCmcdRgstDt(String cmcdRgstDt) {
        this.cmcdRgstDt = cmcdRgstDt;
    }
    
    public String getCmcdUpdtDt() {
        return this.cmcdUpdtDt;
    }
    
    public void setCmcdUpdtDt(String cmcdUpdtDt) {
        this.cmcdUpdtDt = cmcdUpdtDt;
    }
    
    public String getCmcdDelDt() {
        return this.cmcdDelDt;
    }
    
    public void setCmcdDelDt(String cmcdDelDt) {
        this.cmcdDelDt = cmcdDelDt;
    }
    
    public String getCmcdDelYn() {
        return this.cmcdDelYn;
    }
    
    public void setCmcdDelYn(String cmcdDelYn) {
        this.cmcdDelYn = cmcdDelYn;
    }
    
    @Override
    public String toString() {
        return "CmCodeVO(cmcdId: " + cmcdId + ", hghRnkCmcdId: " + hghRnkCmcdId + ", cmcdNm: " + cmcdNm + ", cmcdRgstDt: " + cmcdRgstDt + ", cmcdUpdtDt: " + cmcdUpdtDt + ", cmcdDelDt: " + cmcdDelDt + ", cmcdDelYn: " + cmcdDelYn + ", )";
    }
}