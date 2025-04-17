package com.learn.bbs.eduad.crclm.vo;

/**
 * @TableName CRCLM
 * @TableComment null
 * 커리큘럼
 */
public class CrclmVO {

    /**
     * @ColumnName CRCLM_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 커리큘럼을 구별하는 고유한 번호
     */
    private String crclmId;

    /**
     * @ColumnName CRCLM_DESC
     * @ColumnType VARCHAR2(4000)
     * @ColumnComment 커리큘럼 설명
     */
    private String crclmDesc;

    /**
     * @ColumnName CRCLM_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 커리큘럼을 등록한 날짜
     */
    private String crclmRgstDt;

    /**
     * @ColumnName CRCLM_UPDT_DT
     * @ColumnType DATE
     * @ColumnComment 커리큘럼을 수정한 날짜
     */
    private String crclmUpdtDt;

    /**
     * @ColumnName SBJ_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 과목을 구별하는 고유한 번호
     */
    private String sbjId;

    /**
     * @ColumnName CRS_INF_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 강좌 정보를 구분할 고유한 문자열(CRS_INF-YYYYMMDD-NNNNNN)
     */
    private String crsInfId;

    public String getCrclmId() {
        return this.crclmId;
    }
    
    public void setCrclmId(String crclmId) {
        this.crclmId = crclmId;
    }
    
    public String getCrclmDesc() {
        return this.crclmDesc;
    }
    
    public void setCrclmDesc(String crclmDesc) {
        this.crclmDesc = crclmDesc;
    }
    
    public String getCrclmRgstDt() {
        return this.crclmRgstDt;
    }
    
    public void setCrclmRgstDt(String crclmRgstDt) {
        this.crclmRgstDt = crclmRgstDt;
    }
    
    public String getCrclmUpdtDt() {
        return this.crclmUpdtDt;
    }
    
    public void setCrclmUpdtDt(String crclmUpdtDt) {
        this.crclmUpdtDt = crclmUpdtDt;
    }
    
    public String getSbjId() {
        return this.sbjId;
    }
    
    public void setSbjId(String sbjId) {
        this.sbjId = sbjId;
    }
    
    public String getCrsInfId() {
        return this.crsInfId;
    }
    
    public void setCrsInfId(String crsInfId) {
        this.crsInfId = crsInfId;
    }
    
    @Override
    public String toString() {
        return "CrclmVO(crclmId: " + crclmId + ", crclmDesc: " + crclmDesc + ", crclmRgstDt: " + crclmRgstDt + ", crclmUpdtDt: " + crclmUpdtDt + ", sbjId: " + sbjId + ", crsInfId: " + crsInfId + ", )";
    }
}