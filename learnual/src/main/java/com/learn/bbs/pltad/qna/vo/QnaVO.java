package com.learn.bbs.pltad.qna.vo;

/**
 * @TableName QNA
 * @TableComment null
 * 전체 QnA
 */
public class QnaVO {

    /**
     * @ColumnName QNA_ARTC_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment QnA 게시글의 고유한 아이디(QNA-YYYYMMDD-NNNNNN)
     */
    private String qnaArtcId;

    /**
     * @ColumnName QNA_TTL
     * @ColumnType VARCHAR2(100)
     * @ColumnComment 질문/답변 제목
     */
    private String qnaTtl;

    /**
     * @ColumnName QNA_CTT
     * @ColumnType VARCHAR2(4000)
     * @ColumnComment 질문/답변 내용
     */
    private String qnaCtt;

    /**
     * @ColumnName QNA_WRT_DT
     * @ColumnType DATE
     * @ColumnComment 질문 답변 작성 날짜
     */
    private String qnaWrtDt;

    /**
     * @ColumnName QNA_OPN_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 질문 공개 여부
     */
    private String qnaOpnYn;

    /**
     * @ColumnName QNA_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 질문 등록 날짜
     */
    private String qnaRgstDt;

    /**
     * @ColumnName QNA_UPDT_DT
     * @ColumnType DATE
     * @ColumnComment 질문/답변 수정날짜
     */
    private String qnaUpdtDt;

    /**
     * @ColumnName QNA_DEL_DT
     * @ColumnType DATE
     * @ColumnComment 질문/답변 삭제 날짜
     */
    private String qnaDelDt;

    /**
     * @ColumnName QNA_DEL_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 질문/답변 삭제 여부
     */
    private String qnaDelYn;

    /**
     * @ColumnName ARTC_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment QnA  게시판을 구분할 고유한 코드
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
     * @ColumnComment 강좌의 고유한 아이디(CRS-YYYYMMDD-NNNNNN)
     */
    private String crsInfId;

    /**
     * @ColumnName SBJ_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 과목을 구별하는 고유한 번호
     */
    private String sbjId;

    public String getQnaArtcId() {
        return this.qnaArtcId;
    }
    
    public void setQnaArtcId(String qnaArtcId) {
        this.qnaArtcId = qnaArtcId;
    }
    
    public String getQnaTtl() {
        return this.qnaTtl;
    }
    
    public void setQnaTtl(String qnaTtl) {
        this.qnaTtl = qnaTtl;
    }
    
    public String getQnaCtt() {
        return this.qnaCtt;
    }
    
    public void setQnaCtt(String qnaCtt) {
        this.qnaCtt = qnaCtt;
    }
    
    public String getQnaWrtDt() {
        return this.qnaWrtDt;
    }
    
    public void setQnaWrtDt(String qnaWrtDt) {
        this.qnaWrtDt = qnaWrtDt;
    }
    
    public String getQnaOpnYn() {
        return this.qnaOpnYn;
    }
    
    public void setQnaOpnYn(String qnaOpnYn) {
        this.qnaOpnYn = qnaOpnYn;
    }
    
    public String getQnaRgstDt() {
        return this.qnaRgstDt;
    }
    
    public void setQnaRgstDt(String qnaRgstDt) {
        this.qnaRgstDt = qnaRgstDt;
    }
    
    public String getQnaUpdtDt() {
        return this.qnaUpdtDt;
    }
    
    public void setQnaUpdtDt(String qnaUpdtDt) {
        this.qnaUpdtDt = qnaUpdtDt;
    }
    
    public String getQnaDelDt() {
        return this.qnaDelDt;
    }
    
    public void setQnaDelDt(String qnaDelDt) {
        this.qnaDelDt = qnaDelDt;
    }
    
    public String getQnaDelYn() {
        return this.qnaDelYn;
    }
    
    public void setQnaDelYn(String qnaDelYn) {
        this.qnaDelYn = qnaDelYn;
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
        return "QnaVO(qnaArtcId: " + qnaArtcId + ", qnaTtl: " + qnaTtl + ", qnaCtt: " + qnaCtt + ", qnaWrtDt: " + qnaWrtDt + ", qnaOpnYn: " + qnaOpnYn + ", qnaRgstDt: " + qnaRgstDt + ", qnaUpdtDt: " + qnaUpdtDt + ", qnaDelDt: " + qnaDelDt + ", qnaDelYn: " + qnaDelYn + ", artcId: " + artcId + ", usrId: " + usrId + ", crsInfId: " + crsInfId + ", sbjId: " + sbjId + ", )";
    }
}