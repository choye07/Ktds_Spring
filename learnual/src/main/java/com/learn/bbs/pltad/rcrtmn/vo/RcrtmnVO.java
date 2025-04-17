package com.learn.bbs.pltad.rcrtmn.vo;

/**
 * @TableName RCRTMN
 * @TableComment null
 * 채용 현황 관리
 */
public class RcrtmnVO {

    /**
     * @ColumnName RCRTMN_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 사용자 채용현황의 고유한 아이디(RCRTMN-YYYYMMDD-NNNNNN)
     */
    private String rcrtmnId;

    /**
     * @ColumnName RCRTMN_CMPN_NM
     * @ColumnType VARCHAR2(100)
     * @ColumnComment 회원이 채용된 회사이름
     */
    private String rcrtmnCmpnNm;

    /**
     * @ColumnName RCRTMN_DT
     * @ColumnType DATE
     * @ColumnComment 회원이 채용된 날짜
     */
    private String rcrtmnDt;

    /**
     * @ColumnName RCRTMN_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 회원 채용아이디  등록 날짜
     */
    private String rcrtmnRgstDt;

    /**
     * @ColumnName RCRTMN_UPDT_DT
     * @ColumnType DATE
     * @ColumnComment 회원 채용아이디  수정 날짜
     */
    private String rcrtmnUpdtDt;

    /**
     * @ColumnName RCRTMN_DEL_DT
     * @ColumnType DATE
     * @ColumnComment 회원 채용아이디  삭제 날짜
     */
    private String rcrtmnDelDt;

    /**
     * @ColumnName RCRTMN_DEL_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 회원 채용아이디 삭제 여부
     */
    private String rcrtmnDelYn;

    /**
     * @ColumnName INSTTN_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 기관(학원) 정보의 고유한 아이디(INSTTN-YYYYMMDD-NNNNNN)
     */
    private String insttnId;

    /**
     * @ColumnName USER_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 회원을 구분할 고유한 문자열(USER-YYYYMMDD-NNNNNN)
     */
    private String userId;

    /**
     * @ColumnName ARTC_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 게시판을 구분할 고유한 문자열
     */
    private String artcId;

    public String getRcrtmnId() {
        return this.rcrtmnId;
    }
    
    public void setRcrtmnId(String rcrtmnId) {
        this.rcrtmnId = rcrtmnId;
    }
    
    public String getRcrtmnCmpnNm() {
        return this.rcrtmnCmpnNm;
    }
    
    public void setRcrtmnCmpnNm(String rcrtmnCmpnNm) {
        this.rcrtmnCmpnNm = rcrtmnCmpnNm;
    }
    
    public String getRcrtmnDt() {
        return this.rcrtmnDt;
    }
    
    public void setRcrtmnDt(String rcrtmnDt) {
        this.rcrtmnDt = rcrtmnDt;
    }
    
    public String getRcrtmnRgstDt() {
        return this.rcrtmnRgstDt;
    }
    
    public void setRcrtmnRgstDt(String rcrtmnRgstDt) {
        this.rcrtmnRgstDt = rcrtmnRgstDt;
    }
    
    public String getRcrtmnUpdtDt() {
        return this.rcrtmnUpdtDt;
    }
    
    public void setRcrtmnUpdtDt(String rcrtmnUpdtDt) {
        this.rcrtmnUpdtDt = rcrtmnUpdtDt;
    }
    
    public String getRcrtmnDelDt() {
        return this.rcrtmnDelDt;
    }
    
    public void setRcrtmnDelDt(String rcrtmnDelDt) {
        this.rcrtmnDelDt = rcrtmnDelDt;
    }
    
    public String getRcrtmnDelYn() {
        return this.rcrtmnDelYn;
    }
    
    public void setRcrtmnDelYn(String rcrtmnDelYn) {
        this.rcrtmnDelYn = rcrtmnDelYn;
    }
    
    public String getInsttnId() {
        return this.insttnId;
    }
    
    public void setInsttnId(String insttnId) {
        this.insttnId = insttnId;
    }
    
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public String getArtcId() {
        return this.artcId;
    }
    
    public void setArtcId(String artcId) {
        this.artcId = artcId;
    }
    
    @Override
    public String toString() {
        return "RcrtmnVO(rcrtmnId: " + rcrtmnId + ", rcrtmnCmpnNm: " + rcrtmnCmpnNm + ", rcrtmnDt: " + rcrtmnDt + ", rcrtmnRgstDt: " + rcrtmnRgstDt + ", rcrtmnUpdtDt: " + rcrtmnUpdtDt + ", rcrtmnDelDt: " + rcrtmnDelDt + ", rcrtmnDelYn: " + rcrtmnDelYn + ", insttnId: " + insttnId + ", userId: " + userId + ", artcId: " + artcId + ", )";
    }
}