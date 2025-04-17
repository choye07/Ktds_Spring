package com.learn.bbs.rsm.vo;

/**
 * @TableName RSM
 * @TableComment null
 * 이력서
 */
public class RsmVO {

    /**
     * @ColumnName RSM_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 이력서의 고유한 아이디
     */
    private String rsmId;

    /**
     * @ColumnName RSM_TTL
     * @ColumnType VARCHAR2(100)
     * @ColumnComment 이력서 제목
     */
    private String rsmTtl;

    /**
     * @ColumnName RSM_CTT
     * @ColumnType VARCHAR2(4000)
     * @ColumnComment 이력서내용
     */
    private String rsmCtt;

    /**
     * @ColumnName RSM_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 이력서 등록 날짜
     */
    private String rsmRgstDt;

    /**
     * @ColumnName RSM_UPDT_DT
     * @ColumnType DATE
     * @ColumnComment 이력서 수정 날짜
     */
    private String rsmUpdtDt;

    /**
     * @ColumnName RSM_DEL_DT
     * @ColumnType DATE
     * @ColumnComment 이력서 삭제 날짜
     */
    private String rsmDelDt;

    /**
     * @ColumnName RSM_DEL_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 이력서 삭제 여부
     */
    private String rsmDelYn;

    /**
     * @ColumnName USR_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 회원을 구분할 고유한 문자열(USER-YYYYMMDD-NNNNNN)
     */
    private String usrId;

    /**
     * @ColumnName ATT_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 파일 아이디(시퀀스 번호)
     */
    private String attId;

    /**
     * @ColumnName ARTC_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 게시판을 구분할 고유한 문자열
     */
    private String artcId;

    public String getRsmId() {
        return this.rsmId;
    }
    
    public void setRsmId(String rsmId) {
        this.rsmId = rsmId;
    }
    
    public String getRsmTtl() {
        return this.rsmTtl;
    }
    
    public void setRsmTtl(String rsmTtl) {
        this.rsmTtl = rsmTtl;
    }
    
    public String getRsmCtt() {
        return this.rsmCtt;
    }
    
    public void setRsmCtt(String rsmCtt) {
        this.rsmCtt = rsmCtt;
    }
    
    public String getRsmRgstDt() {
        return this.rsmRgstDt;
    }
    
    public void setRsmRgstDt(String rsmRgstDt) {
        this.rsmRgstDt = rsmRgstDt;
    }
    
    public String getRsmUpdtDt() {
        return this.rsmUpdtDt;
    }
    
    public void setRsmUpdtDt(String rsmUpdtDt) {
        this.rsmUpdtDt = rsmUpdtDt;
    }
    
    public String getRsmDelDt() {
        return this.rsmDelDt;
    }
    
    public void setRsmDelDt(String rsmDelDt) {
        this.rsmDelDt = rsmDelDt;
    }
    
    public String getRsmDelYn() {
        return this.rsmDelYn;
    }
    
    public void setRsmDelYn(String rsmDelYn) {
        this.rsmDelYn = rsmDelYn;
    }
    
    public String getUsrId() {
        return this.usrId;
    }
    
    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }
    
    public String getAttId() {
        return this.attId;
    }
    
    public void setAttId(String attId) {
        this.attId = attId;
    }
    
    public String getArtcId() {
        return this.artcId;
    }
    
    public void setArtcId(String artcId) {
        this.artcId = artcId;
    }
    
    @Override
    public String toString() {
        return "RsmVO(rsmId: " + rsmId + ", rsmTtl: " + rsmTtl + ", rsmCtt: " + rsmCtt + ", rsmRgstDt: " + rsmRgstDt + ", rsmUpdtDt: " + rsmUpdtDt + ", rsmDelDt: " + rsmDelDt + ", rsmDelYn: " + rsmDelYn + ", usrId: " + usrId + ", attId: " + attId + ", artcId: " + artcId + ", )";
    }
}