package com.learn.bbs.eduad.crqnaansr.vo;

/**
 * @TableName CRQNA_ANSR
 * @TableComment null
 * 강좌 QnA 답변
 */
public class CrqnaAnsrVO {

    /**
     * @ColumnName CRQNA_ANSR_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 강좌 QnA 답변 게시글 의 고유한 아이디(CRQNA_ANSR-YYYYMMDD-NNNNNN)
     */
    private String crqnaAnsrId;

    /**
     * @ColumnName CRQNA_ANSR_TTL
     * @ColumnType VARCHAR2(100)
     * @ColumnComment 강좌 QnA 답변 제목
     */
    private String crqnaAnsrTtl;

    /**
     * @ColumnName CRQNA_ANSR_CTT
     * @ColumnType VARCHAR2(4000)
     * @ColumnComment 강좌 QnA 답변 내용
     */
    private String crqnaAnsrCtt;

    /**
     * @ColumnName CRQNA_ANSR_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 강좌 QnA 답변 등록 날짜
     */
    private String crqnaAnsrRgstDt;

    /**
     * @ColumnName CRQNA_ANSR_UPDT_DT
     * @ColumnType DATE
     * @ColumnComment 강좌 QnA 답변 수정 날짜
     */
    private String crqnaAnsrUpdtDt;

    /**
     * @ColumnName CRQNA_ANSR_DEL_DT
     * @ColumnType DATE
     * @ColumnComment 강좌 QnA 답변 삭제 날짜
     */
    private String crqnaAnsrDelDt;

    /**
     * @ColumnName CRQNA_ANSR_DEL_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 강좌 QnA 답변 삭제 여부
     */
    private String crqnaAnsrDelYn;

    /**
     * @ColumnName CRQNA_ANSR_OPN_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 강좌 QnA 답변 공개 여부
     */
    private String crqnaAnsrOpnYn;

    /**
     * @ColumnName ARTC_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 게시판을 구분할 고유한 아이디(ARTC-YYYYMMDD-NNNNNN)
     */
    private String artcId;

    /**
     * @ColumnName USR_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 회원의 고유한 아이디(USER-YYYYMMDD-NNNNNN)
     */
    private String usrId;

    /**
     * @ColumnName CRS_INF_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 강좌 정보를 구분할 고유한 문자열(CRS_INF-YYYYMMDD-NNNNNN)
     */
    private String crsInfId;

    /**
     * @ColumnName ATT_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 파일 아이디(시퀀스 번호)
     */
    private String attId;

    /**
     * @ColumnName SBJ_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 과목을 구별하는 고유한 번호
     */
    private String sbjId;

    /**
     * @ColumnName CRQNA_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 강좌 QnA 게시글의 고유한 아이디(CRQNA-YYYYMMDD-NNNNNN)
     */
    private String crqnaId;

    public String getCrqnaAnsrId() {
        return this.crqnaAnsrId;
    }
    
    public void setCrqnaAnsrId(String crqnaAnsrId) {
        this.crqnaAnsrId = crqnaAnsrId;
    }
    
    public String getCrqnaAnsrTtl() {
        return this.crqnaAnsrTtl;
    }
    
    public void setCrqnaAnsrTtl(String crqnaAnsrTtl) {
        this.crqnaAnsrTtl = crqnaAnsrTtl;
    }
    
    public String getCrqnaAnsrCtt() {
        return this.crqnaAnsrCtt;
    }
    
    public void setCrqnaAnsrCtt(String crqnaAnsrCtt) {
        this.crqnaAnsrCtt = crqnaAnsrCtt;
    }
    
    public String getCrqnaAnsrRgstDt() {
        return this.crqnaAnsrRgstDt;
    }
    
    public void setCrqnaAnsrRgstDt(String crqnaAnsrRgstDt) {
        this.crqnaAnsrRgstDt = crqnaAnsrRgstDt;
    }
    
    public String getCrqnaAnsrUpdtDt() {
        return this.crqnaAnsrUpdtDt;
    }
    
    public void setCrqnaAnsrUpdtDt(String crqnaAnsrUpdtDt) {
        this.crqnaAnsrUpdtDt = crqnaAnsrUpdtDt;
    }
    
    public String getCrqnaAnsrDelDt() {
        return this.crqnaAnsrDelDt;
    }
    
    public void setCrqnaAnsrDelDt(String crqnaAnsrDelDt) {
        this.crqnaAnsrDelDt = crqnaAnsrDelDt;
    }
    
    public String getCrqnaAnsrDelYn() {
        return this.crqnaAnsrDelYn;
    }
    
    public void setCrqnaAnsrDelYn(String crqnaAnsrDelYn) {
        this.crqnaAnsrDelYn = crqnaAnsrDelYn;
    }
    
    public String getCrqnaAnsrOpnYn() {
        return this.crqnaAnsrOpnYn;
    }
    
    public void setCrqnaAnsrOpnYn(String crqnaAnsrOpnYn) {
        this.crqnaAnsrOpnYn = crqnaAnsrOpnYn;
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
    
    public String getCrsInfId() {
        return this.crsInfId;
    }
    
    public void setCrsInfId(String crsInfId) {
        this.crsInfId = crsInfId;
    }
    
    public String getAttId() {
        return this.attId;
    }
    
    public void setAttId(String attId) {
        this.attId = attId;
    }
    
    public String getSbjId() {
        return this.sbjId;
    }
    
    public void setSbjId(String sbjId) {
        this.sbjId = sbjId;
    }
    
    public String getCrqnaId() {
        return this.crqnaId;
    }
    
    public void setCrqnaId(String crqnaId) {
        this.crqnaId = crqnaId;
    }
    
    @Override
    public String toString() {
        return "CrqnaAnsrVO(crqnaAnsrId: " + crqnaAnsrId + ", crqnaAnsrTtl: " + crqnaAnsrTtl + ", crqnaAnsrCtt: " + crqnaAnsrCtt + ", crqnaAnsrRgstDt: " + crqnaAnsrRgstDt + ", crqnaAnsrUpdtDt: " + crqnaAnsrUpdtDt + ", crqnaAnsrDelDt: " + crqnaAnsrDelDt + ", crqnaAnsrDelYn: " + crqnaAnsrDelYn + ", crqnaAnsrOpnYn: " + crqnaAnsrOpnYn + ", artcId: " + artcId + ", usrId: " + usrId + ", crsInfId: " + crsInfId + ", attId: " + attId + ", sbjId: " + sbjId + ", crqnaId: " + crqnaId + ", )";
    }
}