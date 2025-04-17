package com.learn.bbs.cmnt.vo;

/**
 * @TableName CMNT
 * @TableComment null
 * 댓글
 */
public class CmntVO {

    /**
     * @ColumnName CMNT_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 댓글을 구분할 고유한 문자열
     */
    private String cmntId;

    /**
     * @ColumnName CMNT_PST_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 게시글을 구분할 고유한 문자열
     */
    private String cmntPstId;

    /**
     * @ColumnName CMNT_UPPR_ID
     * @ColumnType VARCHAR2(20)
     * @ColumnComment 댓글 상위 댓글 번호
     */
    private String cmntUpprId;

    /**
     * @ColumnName CMNT_CTT
     * @ColumnType VARCHAR2(4000)
     * @ColumnComment 댓글 내용
     */
    private String cmntCtt;

    /**
     * @ColumnName CMNT_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 댓글 등록 날짜
     */
    private String cmntRgstDt;

    /**
     * @ColumnName CMNT_UPDT_DT
     * @ColumnType DATE
     * @ColumnComment 댓글 수정 날짜
     */
    private String cmntUpdtDt;

    /**
     * @ColumnName CMNT_DEL_DT
     * @ColumnType DATE
     * @ColumnComment 댓글 삭제 날짜
     */
    private String cmntDelDt;

    /**
     * @ColumnName CMNT_DEL_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 댓글 삭제 여부
     */
    private String cmntDelYn;

    /**
     * @ColumnName ARTC_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 게시판을 구분할 고유한 문자열
     */
    private String artcId;

    /**
     * @ColumnName USR_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 회원을 구분할 고유한 문자열(USER-YYYYMMDD-NNNNNN)
     */
    private String usrId;

    public String getCmntId() {
        return this.cmntId;
    }
    
    public void setCmntId(String cmntId) {
        this.cmntId = cmntId;
    }
    
    public String getCmntPstId() {
        return this.cmntPstId;
    }
    
    public void setCmntPstId(String cmntPstId) {
        this.cmntPstId = cmntPstId;
    }
    
    public String getCmntUpprId() {
        return this.cmntUpprId;
    }
    
    public void setCmntUpprId(String cmntUpprId) {
        this.cmntUpprId = cmntUpprId;
    }
    
    public String getCmntCtt() {
        return this.cmntCtt;
    }
    
    public void setCmntCtt(String cmntCtt) {
        this.cmntCtt = cmntCtt;
    }
    
    public String getCmntRgstDt() {
        return this.cmntRgstDt;
    }
    
    public void setCmntRgstDt(String cmntRgstDt) {
        this.cmntRgstDt = cmntRgstDt;
    }
    
    public String getCmntUpdtDt() {
        return this.cmntUpdtDt;
    }
    
    public void setCmntUpdtDt(String cmntUpdtDt) {
        this.cmntUpdtDt = cmntUpdtDt;
    }
    
    public String getCmntDelDt() {
        return this.cmntDelDt;
    }
    
    public void setCmntDelDt(String cmntDelDt) {
        this.cmntDelDt = cmntDelDt;
    }
    
    public String getCmntDelYn() {
        return this.cmntDelYn;
    }
    
    public void setCmntDelYn(String cmntDelYn) {
        this.cmntDelYn = cmntDelYn;
    }
    
    public String getArtcId() {
        return this.artcId;
    }
    
    public void setArtcId(String artcId) {
        this.artcId = artcId;
    }
    
    public String getUsrId() {
        return this.usrId;
    }
    
    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }
    
    @Override
    public String toString() {
        return "CmntVO(cmntId: " + cmntId + ", cmntPstId: " + cmntPstId + ", cmntUpprId: " + cmntUpprId + ", cmntCtt: " + cmntCtt + ", cmntRgstDt: " + cmntRgstDt + ", cmntUpdtDt: " + cmntUpdtDt + ", cmntDelDt: " + cmntDelDt + ", cmntDelYn: " + cmntDelYn + ", artcId: " + artcId + ", usrId: " + usrId + ", )";
    }
}