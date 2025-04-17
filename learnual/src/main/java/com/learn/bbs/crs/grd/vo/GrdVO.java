package com.learn.bbs.crs.grd.vo;

/**
 * @TableName GRD
 * @TableComment null
 * 성적
 */
public class GrdVO {

    /**
     * @ColumnName GRD_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 강좌 정보를 구분할 고유한 문자열(CRS_INF-YYYYMMDD-NNNNNN)
     */
    private String grdId;

    /**
     * @ColumnName GRD_SCR
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 추가 논의 필요
     */
    private String grdScr;

    /**
     * @ColumnName GRD_EXAM_DT
     * @ColumnType DATE
     * @ColumnComment 사전에 정해진 정규 시험 날짜 (시험 응시일이 없으면 시험 게시글 불필요 -> NOT NULL)
     */
    private String grdExamDt;

    /**
     * @ColumnName GRD_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 강좌를 진행할 강의실 이름
     */
    private String grdRgstDt;

    /**
     * @ColumnName CRS_INF_UPDT_DT
     * @ColumnType DATE
     * @ColumnComment 시험날짜를 수정한 날짜
     */
    private String crsInfUpdtDt;

    /**
     * @ColumnName GRD_DEL_DT
     * @ColumnType DATE
     * @ColumnComment 시험을 삭제한 날짜
     */
    private String grdDelDt;

    /**
     * @ColumnName GRD_DEL_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 시험을 삭제한 여부
     */
    private String grdDelYn;

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

    public String getGrdId() {
        return this.grdId;
    }
    
    public void setGrdId(String grdId) {
        this.grdId = grdId;
    }
    
    public String getGrdScr() {
        return this.grdScr;
    }
    
    public void setGrdScr(String grdScr) {
        this.grdScr = grdScr;
    }
    
    public String getGrdExamDt() {
        return this.grdExamDt;
    }
    
    public void setGrdExamDt(String grdExamDt) {
        this.grdExamDt = grdExamDt;
    }
    
    public String getGrdRgstDt() {
        return this.grdRgstDt;
    }
    
    public void setGrdRgstDt(String grdRgstDt) {
        this.grdRgstDt = grdRgstDt;
    }
    
    public String getCrsInfUpdtDt() {
        return this.crsInfUpdtDt;
    }
    
    public void setCrsInfUpdtDt(String crsInfUpdtDt) {
        this.crsInfUpdtDt = crsInfUpdtDt;
    }
    
    public String getGrdDelDt() {
        return this.grdDelDt;
    }
    
    public void setGrdDelDt(String grdDelDt) {
        this.grdDelDt = grdDelDt;
    }
    
    public String getGrdDelYn() {
        return this.grdDelYn;
    }
    
    public void setGrdDelYn(String grdDelYn) {
        this.grdDelYn = grdDelYn;
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
        return "GrdVO(grdId: " + grdId + ", grdScr: " + grdScr + ", grdExamDt: " + grdExamDt + ", grdRgstDt: " + grdRgstDt + ", crsInfUpdtDt: " + crsInfUpdtDt + ", grdDelDt: " + grdDelDt + ", grdDelYn: " + grdDelYn + ", crsInfId: " + crsInfId + ", sbjId: " + sbjId + ", )";
    }
}