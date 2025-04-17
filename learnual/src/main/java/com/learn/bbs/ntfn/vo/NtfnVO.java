package com.learn.bbs.ntfn.vo;

/**
 * @TableName NTFN
 * @TableComment null
 * 알림
 */
public class NtfnVO {

    /**
     * @ColumnName NTFN_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 알림을 식별할 고유한 아이디(NT-YYYYMMDD-NNNNNN)
     */
    private String ntfnId;

    /**
     * @ColumnName NTFN_TTL
     * @ColumnType VARCHAR2(100)
     * @ColumnComment 알림이 온 게시글 혹은 댓글 제목
     */
    private String ntfnTtl;

    /**
     * @ColumnName NTFN_CTT
     * @ColumnType VARCHAR2(4000)
     * @ColumnComment 알림이 온 게시글 혹은 댓글 내용
     */
    private String ntfnCtt;

    /**
     * @ColumnName NTFN_PST_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 알림이 온 게시글 경로(endpoint/{게시글 ID}
     */
    private String ntfnPstId;

    /**
     * @ColumnName NTFN_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 알림이 등록된 날짜
     */
    private String ntfnRgstDt;

    /**
     * @ColumnName NTFN_UPDT_DT
     * @ColumnType DATE
     * @ColumnComment 알림이 수정된 날짜
     */
    private String ntfnUpdtDt;

    /**
     * @ColumnName NTFN_DEL_DT
     * @ColumnType DATE
     * @ColumnComment 알림이 삭제된 날짜
     */
    private String ntfnDelDt;

    /**
     * @ColumnName NTFN_DEL_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 알림의  삭제 여부
     */
    private String ntfnDelYn;

    /**
     * @ColumnName NTFN_RD_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 알림의 읽기 여부
     */
    private String ntfnRdYn;

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
     * @ColumnName CMCD_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 알림을 받은 회원의 권한(USER, ADMIN, PLTADM)(CM-YYYYMMDD-NNNNNN)
     */
    private String cmcdId;

    public String getNtfnId() {
        return this.ntfnId;
    }
    
    public void setNtfnId(String ntfnId) {
        this.ntfnId = ntfnId;
    }
    
    public String getNtfnTtl() {
        return this.ntfnTtl;
    }
    
    public void setNtfnTtl(String ntfnTtl) {
        this.ntfnTtl = ntfnTtl;
    }
    
    public String getNtfnCtt() {
        return this.ntfnCtt;
    }
    
    public void setNtfnCtt(String ntfnCtt) {
        this.ntfnCtt = ntfnCtt;
    }
    
    public String getNtfnPstId() {
        return this.ntfnPstId;
    }
    
    public void setNtfnPstId(String ntfnPstId) {
        this.ntfnPstId = ntfnPstId;
    }
    
    public String getNtfnRgstDt() {
        return this.ntfnRgstDt;
    }
    
    public void setNtfnRgstDt(String ntfnRgstDt) {
        this.ntfnRgstDt = ntfnRgstDt;
    }
    
    public String getNtfnUpdtDt() {
        return this.ntfnUpdtDt;
    }
    
    public void setNtfnUpdtDt(String ntfnUpdtDt) {
        this.ntfnUpdtDt = ntfnUpdtDt;
    }
    
    public String getNtfnDelDt() {
        return this.ntfnDelDt;
    }
    
    public void setNtfnDelDt(String ntfnDelDt) {
        this.ntfnDelDt = ntfnDelDt;
    }
    
    public String getNtfnDelYn() {
        return this.ntfnDelYn;
    }
    
    public void setNtfnDelYn(String ntfnDelYn) {
        this.ntfnDelYn = ntfnDelYn;
    }
    
    public String getNtfnRdYn() {
        return this.ntfnRdYn;
    }
    
    public void setNtfnRdYn(String ntfnRdYn) {
        this.ntfnRdYn = ntfnRdYn;
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
    
    public String getCmcdId() {
        return this.cmcdId;
    }
    
    public void setCmcdId(String cmcdId) {
        this.cmcdId = cmcdId;
    }
    
    @Override
    public String toString() {
        return "NtfnVO(ntfnId: " + ntfnId + ", ntfnTtl: " + ntfnTtl + ", ntfnCtt: " + ntfnCtt + ", ntfnPstId: " + ntfnPstId + ", ntfnRgstDt: " + ntfnRgstDt + ", ntfnUpdtDt: " + ntfnUpdtDt + ", ntfnDelDt: " + ntfnDelDt + ", ntfnDelYn: " + ntfnDelYn + ", ntfnRdYn: " + ntfnRdYn + ", insttnId: " + insttnId + ", userId: " + userId + ", cmcdId: " + cmcdId + ", )";
    }
}