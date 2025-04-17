package com.learn.main.ntc.vo;

/**
 * @TableName NTC
 * @TableComment null
 * 러뉴얼 공지사항 
 */
public class NtcVO {

    /**
     * @ColumnName NTC_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 전체 공지사항 게시글의 고유한 아이디(NTC-YYYYMMDD-NNNNNN)
     */
    private String ntcId;

    /**
     * @ColumnName NTC_TTL
     * @ColumnType VARCHAR2(100)
     * @ColumnComment 전체 공지사항 게시글 제목
     */
    private String ntcTtl;

    /**
     * @ColumnName NTC_CTT
     * @ColumnType VARCHAR2(4000)
     * @ColumnComment 전체 공지사항 게시글의 내용
     */
    private String ntcCtt;

    /**
     * @ColumnName NTC_WRTR_ID
     * @ColumnType VARCHAR2(4000)
     * @ColumnComment 전체 공지사항 게시글 작성자의 아이디
     */
    private String ntcWrtrId;

    /**
     * @ColumnName NTC_PINNED_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 전체 공지사항 게시글 상단 고정 여부
     */
    private String ntcPinnedYn;

    /**
     * @ColumnName NTC_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 전체 공지사항 게시글 게시 날짜
     */
    private String ntcRgstDt;

    /**
     * @ColumnName NTC_UPDT_DT
     * @ColumnType DATE
     * @ColumnComment 전체 공지사항 게시글 수정 날짜
     */
    private String ntcUpdtDt;

    /**
     * @ColumnName NTC_DEL_DT
     * @ColumnType CHAR(1)
     * @ColumnComment 전체 공지사항 게시글 삭제 날짜
     */
    private String ntcDelDt;

    /**
     * @ColumnName NTC_DEL_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 전체 공지사항 게시글 삭제 여부
     */
    private String ntcDelYn;

    /**
     * @ColumnName ARTC_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 게시판을 구분할 고유한 문자열
     */
    private String artcId;

    public String getNtcId() {
        return this.ntcId;
    }
    
    public void setNtcId(String ntcId) {
        this.ntcId = ntcId;
    }
    
    public String getNtcTtl() {
        return this.ntcTtl;
    }
    
    public void setNtcTtl(String ntcTtl) {
        this.ntcTtl = ntcTtl;
    }
    
    public String getNtcCtt() {
        return this.ntcCtt;
    }
    
    public void setNtcCtt(String ntcCtt) {
        this.ntcCtt = ntcCtt;
    }
    
    public String getNtcWrtrId() {
        return this.ntcWrtrId;
    }
    
    public void setNtcWrtrId(String ntcWrtrId) {
        this.ntcWrtrId = ntcWrtrId;
    }
    
    public String getNtcPinnedYn() {
        return this.ntcPinnedYn;
    }
    
    public void setNtcPinnedYn(String ntcPinnedYn) {
        this.ntcPinnedYn = ntcPinnedYn;
    }
    
    public String getNtcRgstDt() {
        return this.ntcRgstDt;
    }
    
    public void setNtcRgstDt(String ntcRgstDt) {
        this.ntcRgstDt = ntcRgstDt;
    }
    
    public String getNtcUpdtDt() {
        return this.ntcUpdtDt;
    }
    
    public void setNtcUpdtDt(String ntcUpdtDt) {
        this.ntcUpdtDt = ntcUpdtDt;
    }
    
    public String getNtcDelDt() {
        return this.ntcDelDt;
    }
    
    public void setNtcDelDt(String ntcDelDt) {
        this.ntcDelDt = ntcDelDt;
    }
    
    public String getNtcDelYn() {
        return this.ntcDelYn;
    }
    
    public void setNtcDelYn(String ntcDelYn) {
        this.ntcDelYn = ntcDelYn;
    }
    
    public String getArtcId() {
        return this.artcId;
    }
    
    public void setArtcId(String artcId) {
        this.artcId = artcId;
    }
    
    @Override
    public String toString() {
        return "NtcVO(ntcId: " + ntcId + ", ntcTtl: " + ntcTtl + ", ntcCtt: " + ntcCtt + ", ntcWrtrId: " + ntcWrtrId + ", ntcPinnedYn: " + ntcPinnedYn + ", ntcRgstDt: " + ntcRgstDt + ", ntcUpdtDt: " + ntcUpdtDt + ", ntcDelDt: " + ntcDelDt + ", ntcDelYn: " + ntcDelYn + ", artcId: " + artcId + ", )";
    }
}