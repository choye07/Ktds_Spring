package com.learn.bbs.pltad.qna.vo;

/**
 * @TableName QNA_ANSR
 * @TableComment null
 * 전체 QnA 답변
 */
public class QnaAnsrVO {

    /**
     * @ColumnName QNA_ANSR_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment QnA 게시글의 고유한 아이디(QNA-YYYYMMDD-NNNNNN)
     */
    private String qnaAnsrId;

    /**
     * @ColumnName QNA_ANSR_CTT
     * @ColumnType VARCHAR2(100)
     * @ColumnComment 답변 내용
     */
    private String qnaAnsrCtt;

    /**
     * @ColumnName QNA_ANSR_WRT_DT
     * @ColumnType DATE
     * @ColumnComment 질문 답변 작성 날짜
     */
    private String qnaAnsrWrtDt;

    /**
     * @ColumnName QNA_ANSR_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 답변 등록 날짜
     */
    private String qnaAnsrRgstDt;

    /**
     * @ColumnName QNA_ANSR_UPDT_DT
     * @ColumnType DATE
     * @ColumnComment 답변 수정날짜
     */
    private String qnaAnsrUpdtDt;

    /**
     * @ColumnName QNA_ANSR_DEL_DT
     * @ColumnType DATE
     * @ColumnComment 답변 삭제 날짜
     */
    private String qnaAnsrDelDt;

    /**
     * @ColumnName QNA_ANSR_DEL_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 답변 삭제 여부
     */
    private String qnaAnsrDelYn;

    /**
     * @ColumnName ARTC_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 전체 QnA 답변 게시판을 구분할 고유한 코드
     */
    private String artcId;

    /**
     * @ColumnName PLT_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 회원의 고유한 아이디(USER-YYYYMMDD-NNNNNN)
     */
    private String pltId;

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
     * @ColumnName QNA_ARTC_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment QnA 게시글의 고유한 아이디(QNA-YYYYMMDD-NNNNNN)
     */
    private String qnaArtcId;

    public String getQnaAnsrId() {
        return this.qnaAnsrId;
    }
    
    public void setQnaAnsrId(String qnaAnsrId) {
        this.qnaAnsrId = qnaAnsrId;
    }
    
    public String getQnaAnsrCtt() {
        return this.qnaAnsrCtt;
    }
    
    public void setQnaAnsrCtt(String qnaAnsrCtt) {
        this.qnaAnsrCtt = qnaAnsrCtt;
    }
    
    public String getQnaAnsrWrtDt() {
        return this.qnaAnsrWrtDt;
    }
    
    public void setQnaAnsrWrtDt(String qnaAnsrWrtDt) {
        this.qnaAnsrWrtDt = qnaAnsrWrtDt;
    }
    
    public String getQnaAnsrRgstDt() {
        return this.qnaAnsrRgstDt;
    }
    
    public void setQnaAnsrRgstDt(String qnaAnsrRgstDt) {
        this.qnaAnsrRgstDt = qnaAnsrRgstDt;
    }
    
    public String getQnaAnsrUpdtDt() {
        return this.qnaAnsrUpdtDt;
    }
    
    public void setQnaAnsrUpdtDt(String qnaAnsrUpdtDt) {
        this.qnaAnsrUpdtDt = qnaAnsrUpdtDt;
    }
    
    public String getQnaAnsrDelDt() {
        return this.qnaAnsrDelDt;
    }
    
    public void setQnaAnsrDelDt(String qnaAnsrDelDt) {
        this.qnaAnsrDelDt = qnaAnsrDelDt;
    }
    
    public String getQnaAnsrDelYn() {
        return this.qnaAnsrDelYn;
    }
    
    public void setQnaAnsrDelYn(String qnaAnsrDelYn) {
        this.qnaAnsrDelYn = qnaAnsrDelYn;
    }
    
    public String getArtcId() {
        return this.artcId;
    }
    
    public void setArtcId(String artcId) {
        this.artcId = artcId;
    }
    
    public String getPltId() {
        return this.pltId;
    }
    
    public void setPltId(String pltId) {
        this.pltId = pltId;
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
    
    public String getQnaArtcId() {
        return this.qnaArtcId;
    }
    
    public void setQnaArtcId(String qnaArtcId) {
        this.qnaArtcId = qnaArtcId;
    }
    
    @Override
    public String toString() {
        return "QnaAnsrVO(qnaAnsrId: " + qnaAnsrId + ", qnaAnsrCtt: " + qnaAnsrCtt + ", qnaAnsrWrtDt: " + qnaAnsrWrtDt + ", qnaAnsrRgstDt: " + qnaAnsrRgstDt + ", qnaAnsrUpdtDt: " + qnaAnsrUpdtDt + ", qnaAnsrDelDt: " + qnaAnsrDelDt + ", qnaAnsrDelYn: " + qnaAnsrDelYn + ", artcId: " + artcId + ", pltId: " + pltId + ", crsInfId: " + crsInfId + ", attId: " + attId + ", sbjId: " + sbjId + ", qnaArtcId: " + qnaArtcId + ", )";
    }
}