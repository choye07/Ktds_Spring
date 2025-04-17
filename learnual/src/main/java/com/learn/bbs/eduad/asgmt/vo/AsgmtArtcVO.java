package com.learn.bbs.eduad.asgmt.vo;

/**
 * @TableName ASGMT_ARTC
 * @TableComment null
 * 과제 게시판
 */
public class AsgmtArtcVO {

    /**
     * @ColumnName ASGMT_ARTC_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 과제 게시판의 게시글 고유한 아이디(ASGMT_ARTC-YYYYMMDD-NNNNNN)
     */
    private String asgmtArtcId;

    /**
     * @ColumnName ASGMT_ARTC_TTL
     * @ColumnType VARCHAR2(100)
     * @ColumnComment 과제 게시판 게시글 제목
     */
    private String asgmtArtcTtl;

    /**
     * @ColumnName ASGMT_ARTC_CTT
     * @ColumnType VARCHAR2(4000)
     * @ColumnComment 과제 게시판 게시글의 내용
     */
    private String asgmtArtcCtt;

    /**
     * @ColumnName ASGMT_ARTC_SBM_TM
     * @ColumnType DATE
     * @ColumnComment 과제 게시판에 회원이 과제를 제출한 시간
     */
    private String asgmtArtcSbmTm;

    /**
     * @ColumnName ASGMT_ARTC_RGST_TM
     * @ColumnType DATE
     * @ColumnComment 과제 게시판 게시글 게시 날짜
     */
    private String asgmtArtcRgstTm;

    /**
     * @ColumnName ASGMT_ARTC_UPDT_TM
     * @ColumnType DATE
     * @ColumnComment 과제 게시판 게시글 수정 날짜
     */
    private String asgmtArtcUpdtTm;

    /**
     * @ColumnName ASGMT_ARTC_DEL_DT
     * @ColumnType DATE
     * @ColumnComment 과제 게시판 게시글 삭제 날짜
     */
    private String asgmtArtcDelDt;

    /**
     * @ColumnName ASGMT_ARTC_DEL_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 과제 게시판 게시글 삭제 여부
     */
    private String asgmtArtcDelYn;

    /**
     * @ColumnName ASGMT_ARTC_RSPNS_PTH
     * @ColumnType VARCHAR2(2083)
     * @ColumnComment 과제 게시판 게시글 응답 구글 폼 경로 (URL)
     */
    private String asgmtArtcRspnsPth;

    /**
     * @ColumnName ASGMT_ARTC_EDT_PTH
     * @ColumnType VARCHAR2(2083)
     * @ColumnComment 과제 게시판 게시글 편집 구글 폼 경로 (URL)
     */
    private String asgmtArtcEdtPth;

    /**
     * @ColumnName CRS_INF_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 강좌 정보를 구분할 고유한 문자열(CRS_INF-YYYYMMDD-NNNNNN)
     */
    private String crsInfId;

    /**
     * @ColumnName ARTC_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 게시판을 구분할 고유한 문자열
     */
    private String artcId;

    /**
     * @ColumnName ASGMT_ARTC_DDLN_DT
     * @ColumnType DATE
     * @ColumnComment 과제를 제출해야하는 마감 날짜
     */
    private String asgmtArtcDdlnDt;

    /**
     * @ColumnName SBJ_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 과목을 구별하는 고유한 번호
     */
    private String sbjId;

    public String getAsgmtArtcId() {
        return this.asgmtArtcId;
    }
    
    public void setAsgmtArtcId(String asgmtArtcId) {
        this.asgmtArtcId = asgmtArtcId;
    }
    
    public String getAsgmtArtcTtl() {
        return this.asgmtArtcTtl;
    }
    
    public void setAsgmtArtcTtl(String asgmtArtcTtl) {
        this.asgmtArtcTtl = asgmtArtcTtl;
    }
    
    public String getAsgmtArtcCtt() {
        return this.asgmtArtcCtt;
    }
    
    public void setAsgmtArtcCtt(String asgmtArtcCtt) {
        this.asgmtArtcCtt = asgmtArtcCtt;
    }
    
    public String getAsgmtArtcSbmTm() {
        return this.asgmtArtcSbmTm;
    }
    
    public void setAsgmtArtcSbmTm(String asgmtArtcSbmTm) {
        this.asgmtArtcSbmTm = asgmtArtcSbmTm;
    }
    
    public String getAsgmtArtcRgstTm() {
        return this.asgmtArtcRgstTm;
    }
    
    public void setAsgmtArtcRgstTm(String asgmtArtcRgstTm) {
        this.asgmtArtcRgstTm = asgmtArtcRgstTm;
    }
    
    public String getAsgmtArtcUpdtTm() {
        return this.asgmtArtcUpdtTm;
    }
    
    public void setAsgmtArtcUpdtTm(String asgmtArtcUpdtTm) {
        this.asgmtArtcUpdtTm = asgmtArtcUpdtTm;
    }
    
    public String getAsgmtArtcDelDt() {
        return this.asgmtArtcDelDt;
    }
    
    public void setAsgmtArtcDelDt(String asgmtArtcDelDt) {
        this.asgmtArtcDelDt = asgmtArtcDelDt;
    }
    
    public String getAsgmtArtcDelYn() {
        return this.asgmtArtcDelYn;
    }
    
    public void setAsgmtArtcDelYn(String asgmtArtcDelYn) {
        this.asgmtArtcDelYn = asgmtArtcDelYn;
    }
    
    public String getAsgmtArtcRspnsPth() {
        return this.asgmtArtcRspnsPth;
    }
    
    public void setAsgmtArtcRspnsPth(String asgmtArtcRspnsPth) {
        this.asgmtArtcRspnsPth = asgmtArtcRspnsPth;
    }
    
    public String getAsgmtArtcEdtPth() {
        return this.asgmtArtcEdtPth;
    }
    
    public void setAsgmtArtcEdtPth(String asgmtArtcEdtPth) {
        this.asgmtArtcEdtPth = asgmtArtcEdtPth;
    }
    
    public String getCrsInfId() {
        return this.crsInfId;
    }
    
    public void setCrsInfId(String crsInfId) {
        this.crsInfId = crsInfId;
    }
    
    public String getArtcId() {
        return this.artcId;
    }
    
    public void setArtcId(String artcId) {
        this.artcId = artcId;
    }
    
    public String getAsgmtArtcDdlnDt() {
        return this.asgmtArtcDdlnDt;
    }
    
    public void setAsgmtArtcDdlnDt(String asgmtArtcDdlnDt) {
        this.asgmtArtcDdlnDt = asgmtArtcDdlnDt;
    }
    
    public String getSbjId() {
        return this.sbjId;
    }
    
    public void setSbjId(String sbjId) {
        this.sbjId = sbjId;
    }
    
    @Override
    public String toString() {
        return "AsgmtArtcVO(asgmtArtcId: " + asgmtArtcId + ", asgmtArtcTtl: " + asgmtArtcTtl + ", asgmtArtcCtt: " + asgmtArtcCtt + ", asgmtArtcSbmTm: " + asgmtArtcSbmTm + ", asgmtArtcRgstTm: " + asgmtArtcRgstTm + ", asgmtArtcUpdtTm: " + asgmtArtcUpdtTm + ", asgmtArtcDelDt: " + asgmtArtcDelDt + ", asgmtArtcDelYn: " + asgmtArtcDelYn + ", asgmtArtcRspnsPth: " + asgmtArtcRspnsPth + ", asgmtArtcEdtPth: " + asgmtArtcEdtPth + ", crsInfId: " + crsInfId + ", artcId: " + artcId + ", asgmtArtcDdlnDt: " + asgmtArtcDdlnDt + ", sbjId: " + sbjId + ", )";
    }
}