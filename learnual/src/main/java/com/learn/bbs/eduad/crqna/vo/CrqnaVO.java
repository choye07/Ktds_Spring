package com.learn.bbs.eduad.crqna.vo;

/**
 * @TableName CRQNA
 * @TableComment null
 * 강좌 QnA
 */
public class CrqnaVO {

    /**
     * @ColumnName CRQNA_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 강좌 QnA 게시글의 고유한 아이디(CRQNA-YYYYMMDD-NNNNNN)
     */
    private String crqnaId;

    /**
     * @ColumnName CRQNA_TTL
     * @ColumnType VARCHAR2(100)
     * @ColumnComment 강좌 QnA 게시글 제목
     */
    private String crqnaTtl;

    /**
     * @ColumnName CRQNA_CTT
     * @ColumnType VARCHAR2(4000)
     * @ColumnComment 강좌 QnA 게시글 내용
     */
    private String crqnaCtt;

    /**
     * @ColumnName CRQNA_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 강좌 QnA 게시글 등록 날짜
     */
    private String crqnaRgstDt;

    /**
     * @ColumnName CRQNA_UPDT_DT
     * @ColumnType DATE
     * @ColumnComment 강좌 QnA 게시글 수정 날짜
     */
    private String crqnaUpdtDt;

    /**
     * @ColumnName CRQNA_DEL_DT
     * @ColumnType DATE
     * @ColumnComment 강좌 QnA 게시글 삭제 날짜
     */
    private String crqnaDelDt;

    /**
     * @ColumnName CRQNA_DEL_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 강좌 QnA 게시글 삭제 여부 (Y/N)
     */
    private String crqnaDelYn;

    /**
     * @ColumnName CRQNA_OPN_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 강좌 QnA 게시글 공개 여부 (Y/N)
     */
    private String crqnaOpnYn;

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
     * @ColumnName SBJ_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 과목을 구별하는 고유한 번호
     */
    private String sbjId;

    public String getCrqnaId() {
        return this.crqnaId;
    }
    
    public void setCrqnaId(String crqnaId) {
        this.crqnaId = crqnaId;
    }
    
    public String getCrqnaTtl() {
        return this.crqnaTtl;
    }
    
    public void setCrqnaTtl(String crqnaTtl) {
        this.crqnaTtl = crqnaTtl;
    }
    
    public String getCrqnaCtt() {
        return this.crqnaCtt;
    }
    
    public void setCrqnaCtt(String crqnaCtt) {
        this.crqnaCtt = crqnaCtt;
    }
    
    public String getCrqnaRgstDt() {
        return this.crqnaRgstDt;
    }
    
    public void setCrqnaRgstDt(String crqnaRgstDt) {
        this.crqnaRgstDt = crqnaRgstDt;
    }
    
    public String getCrqnaUpdtDt() {
        return this.crqnaUpdtDt;
    }
    
    public void setCrqnaUpdtDt(String crqnaUpdtDt) {
        this.crqnaUpdtDt = crqnaUpdtDt;
    }
    
    public String getCrqnaDelDt() {
        return this.crqnaDelDt;
    }
    
    public void setCrqnaDelDt(String crqnaDelDt) {
        this.crqnaDelDt = crqnaDelDt;
    }
    
    public String getCrqnaDelYn() {
        return this.crqnaDelYn;
    }
    
    public void setCrqnaDelYn(String crqnaDelYn) {
        this.crqnaDelYn = crqnaDelYn;
    }
    
    public String getCrqnaOpnYn() {
        return this.crqnaOpnYn;
    }
    
    public void setCrqnaOpnYn(String crqnaOpnYn) {
        this.crqnaOpnYn = crqnaOpnYn;
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
    
    public String getSbjId() {
        return this.sbjId;
    }
    
    public void setSbjId(String sbjId) {
        this.sbjId = sbjId;
    }
    
    @Override
    public String toString() {
        return "CrqnaVO(crqnaId: " + crqnaId + ", crqnaTtl: " + crqnaTtl + ", crqnaCtt: " + crqnaCtt + ", crqnaRgstDt: " + crqnaRgstDt + ", crqnaUpdtDt: " + crqnaUpdtDt + ", crqnaDelDt: " + crqnaDelDt + ", crqnaDelYn: " + crqnaDelYn + ", crqnaOpnYn: " + crqnaOpnYn + ", attId: " + attId + ", artcId: " + artcId + ", usrId: " + usrId + ", crsInfId: " + crsInfId + ", sbjId: " + sbjId + ", )";
    }
}