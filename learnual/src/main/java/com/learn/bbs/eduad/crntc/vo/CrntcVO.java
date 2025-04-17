package com.learn.bbs.eduad.crntc.vo;

/**
 * @TableName CRNTC
 * @TableComment null
 * 강좌 공지사항
 */
public class CrntcVO {

    /**
     * @ColumnName CRNTC_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 강좌 공지사항 게시글의 고유한 아이디(CRNTC-YYYYMMDD-NNNNNN)
     */
    private String crntcId;

    /**
     * @ColumnName CRNTC_TTL
     * @ColumnType VARCHAR2(100)
     * @ColumnComment 강좌 공지사항 게시글의 제목
     */
    private String crntcTtl;

    /**
     * @ColumnName CRNTC_CTT
     * @ColumnType VARCHAR2(4000)
     * @ColumnComment 강좌 공지사항 게시글의 내용
     */
    private String crntcCtt;

    /**
     * @ColumnName CRNTC_PINNED_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 강좌 공지사항 게시글 상단 고정 여부
     */
    private String crntcPinnedYn;

    /**
     * @ColumnName CRNTC_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 강좌 공지사항 게시글 게시 날짜
     */
    private String crntcRgstDt;

    /**
     * @ColumnName CRNTC_UPDT_DT
     * @ColumnType DATE
     * @ColumnComment 강좌 공지사항 게시글 수정 날짜
     */
    private String crntcUpdtDt;

    /**
     * @ColumnName CRNTC_DEL_DT
     * @ColumnType DATE
     * @ColumnComment 강좌 공지사항 게시글 삭제 날짜
     */
    private String crntcDelDt;

    /**
     * @ColumnName CRNTC_DEL_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 강좌 공지사항 게시글 삭제 여부
     */
    private String crntcDelYn;

    /**
     * @ColumnName ARTC_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 게시판의 고유한 아이디(ARTC-YYYYMMDD-NNNNNN)
     */
    private String artcId;

    /**
     * @ColumnName CRS_INF_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 강좌 정보의 고유한 아이디(CRS_INF-YYYYMMDD-NNNNNN)
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

    public String getCrntcId() {
        return this.crntcId;
    }
    
    public void setCrntcId(String crntcId) {
        this.crntcId = crntcId;
    }
    
    public String getCrntcTtl() {
        return this.crntcTtl;
    }
    
    public void setCrntcTtl(String crntcTtl) {
        this.crntcTtl = crntcTtl;
    }
    
    public String getCrntcCtt() {
        return this.crntcCtt;
    }
    
    public void setCrntcCtt(String crntcCtt) {
        this.crntcCtt = crntcCtt;
    }
    
    public String getCrntcPinnedYn() {
        return this.crntcPinnedYn;
    }
    
    public void setCrntcPinnedYn(String crntcPinnedYn) {
        this.crntcPinnedYn = crntcPinnedYn;
    }
    
    public String getCrntcRgstDt() {
        return this.crntcRgstDt;
    }
    
    public void setCrntcRgstDt(String crntcRgstDt) {
        this.crntcRgstDt = crntcRgstDt;
    }
    
    public String getCrntcUpdtDt() {
        return this.crntcUpdtDt;
    }
    
    public void setCrntcUpdtDt(String crntcUpdtDt) {
        this.crntcUpdtDt = crntcUpdtDt;
    }
    
    public String getCrntcDelDt() {
        return this.crntcDelDt;
    }
    
    public void setCrntcDelDt(String crntcDelDt) {
        this.crntcDelDt = crntcDelDt;
    }
    
    public String getCrntcDelYn() {
        return this.crntcDelYn;
    }
    
    public void setCrntcDelYn(String crntcDelYn) {
        this.crntcDelYn = crntcDelYn;
    }
    
    public String getArtcId() {
        return this.artcId;
    }
    
    public void setArtcId(String artcId) {
        this.artcId = artcId;
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
    
    public void setSbjId2(String sbjId) {
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
        return "CrntcVO(crntcId: " + crntcId + ", crntcTtl: " + crntcTtl + ", crntcCtt: " + crntcCtt + ", crntcPinnedYn: " + crntcPinnedYn + ", crntcRgstDt: " + crntcRgstDt + ", crntcUpdtDt: " + crntcUpdtDt + ", crntcDelDt: " + crntcDelDt + ", crntcDelYn: " + crntcDelYn + ", artcId: " + artcId + ", crsInfId: " + crsInfId + ", sbjId: " + sbjId + ", instrId: " + instrId + ", )";
    }
}