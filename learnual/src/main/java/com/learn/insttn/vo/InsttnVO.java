package com.learn.insttn.vo;

/**
 * @TableName MENU
 * @TableComment null
 * 학원 메뉴
 */
public class InsttnVO {

    /**
     * @ColumnName INSTTN_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 기관(학원) 정보의 고유한 아이디(INSTTN-YYYYMMDD-NNNNNN)
     */
    private String insttnId;

    /**
     * @ColumnName INSTTN_NM
     * @ColumnType VARCHAR2(100)
     * @ColumnComment 기관(학원)의 이름
     */
    private String insttnNm;

    /**
     * @ColumnName INSTTN_BSNS_NB
     * @ColumnType VARCHAR2(20)
     * @ColumnComment 기관(학원)의 사업자 번호
     */
    private String insttnBsnsNb;

    /**
     * @ColumnName INSTTN_CEO_NM
     * @ColumnType VARCHAR2(100)
     * @ColumnComment 기관(학원)의 대표
     */
    private String insttnCeoNm;

    /**
     * @ColumnName INSTTN_ADRS
     * @ColumnType VARCHAR2(200)
     * @ColumnComment 기관(학원)의 주소
     */
    private String insttnAdrs;

    /**
     * @ColumnName INSTTN_PN
     * @ColumnType VARCHAR2(20)
     * @ColumnComment 기관(학원)의 전화번호
     */
    private String insttnPn;

    /**
     * @ColumnName INSTTN_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 기관(학원) 아이디 등록 날짜
     */
    private String insttnRgstDt;

    /**
     * @ColumnName INSTTN_UPDT_DT
     * @ColumnType DATE
     * @ColumnComment 기관(학원) 아이디 수정 날짜
     */
    private String insttnUpdtDt;

    /**
     * @ColumnName INSTTN_DEL_DT
     * @ColumnType DATE
     * @ColumnComment 기관(학원) 아이디 삭제 날짜
     */
    private String insttnDelDt;

    /**
     * @ColumnName INSTTN_DEL_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 기관(학원) 아이디 삭제 여부
     */
    private String insttnDelYn;

    public String getInsttnId() {
        return this.insttnId;
    }
    
    public void setInsttnId(String insttnId) {
        this.insttnId = insttnId;
    }
    
    public String getInsttnNm() {
        return this.insttnNm;
    }
    
    public void setInsttnNm(String insttnNm) {
        this.insttnNm = insttnNm;
    }
    
    public String getInsttnBsnsNb() {
        return this.insttnBsnsNb;
    }
    
    public void setInsttnBsnsNb(String insttnBsnsNb) {
        this.insttnBsnsNb = insttnBsnsNb;
    }
    
    public String getInsttnCeoNm() {
        return this.insttnCeoNm;
    }
    
    public void setInsttnCeoNm(String insttnCeoNm) {
        this.insttnCeoNm = insttnCeoNm;
    }
    
    public String getInsttnAdrs() {
        return this.insttnAdrs;
    }
    
    public void setInsttnAdrs(String insttnAdrs) {
        this.insttnAdrs = insttnAdrs;
    }
    
    public String getInsttnPn() {
        return this.insttnPn;
    }
    
    public void setInsttnPn(String insttnPn) {
        this.insttnPn = insttnPn;
    }
    
    public String getInsttnRgstDt() {
        return this.insttnRgstDt;
    }
    
    public void setInsttnRgstDt(String insttnRgstDt) {
        this.insttnRgstDt = insttnRgstDt;
    }
    
    public String getInsttnUpdtDt() {
        return this.insttnUpdtDt;
    }
    
    public void setInsttnUpdtDt(String insttnUpdtDt) {
        this.insttnUpdtDt = insttnUpdtDt;
    }
    
    public String getInsttnDelDt() {
        return this.insttnDelDt;
    }
    
    public void setInsttnDelDt(String insttnDelDt) {
        this.insttnDelDt = insttnDelDt;
    }
    
    public String getInsttnDelYn() {
        return this.insttnDelYn;
    }
    
    public void setInsttnDelYn(String insttnDelYn) {
        this.insttnDelYn = insttnDelYn;
    }
    
    @Override
    public String toString() {
        return "InsttnVO(insttnId: " + insttnId + ", insttnNm: " + insttnNm + ", insttnBsnsNb: " + insttnBsnsNb + ", insttnCeoNm: " + insttnCeoNm + ", insttnAdrs: " + insttnAdrs + ", insttnPn: " + insttnPn + ", insttnRgstDt: " + insttnRgstDt + ", insttnUpdtDt: " + insttnUpdtDt + ", insttnDelDt: " + insttnDelDt + ", insttnDelYn: " + insttnDelYn + ", )";
    }
}