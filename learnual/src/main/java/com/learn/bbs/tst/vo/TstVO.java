package com.learn.bbs.tst.vo;

/**
 * @TableName TST
 * @TableComment null
 * 시험
 */
public class TstVO {

    /**
     * @ColumnName TST_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 회원을 구분할 고유한 문자열(USER-YYYYMMDD-NNNNNN)
     */
    private String tstId;

    /**
     * @ColumnName TST_CTT
     * @ColumnType VARCHAR2(4000)
     * @ColumnComment 시험 게시글 내용
     */
    private String tstCtt;

    /**
     * @ColumnName TST_EXAM_DT
     * @ColumnType DATE
     * @ColumnComment 사전에 정해진 정규 시험 날짜
     */
    private String tstExamDt;

    /**
     * @ColumnName TST_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 시험 게시글 제출 시간
     */
    private String tstRgstDt;

    /**
     * @ColumnName TST_UPDT_DT
     * @ColumnType DATE
     * @ColumnComment 시험 게시글 수정 시간
     */
    private String tstUpdtDt;

    /**
     * @ColumnName TST_DEL_DT
     * @ColumnType DATE
     * @ColumnComment 시험 게시글 삭제 시간
     */
    private String tstDelDt;

    /**
     * @ColumnName TST_DEL_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 시험 게시글 삭제 여부 (Y/N)
     */
    private String tstDelYn;

    /**
     * @ColumnName TST_RSPNS_PTH
     * @ColumnType VARCHAR2(2083)
     * @ColumnComment 응답 구글 폼 경로 (URL)
     */
    private String tstRspnsPth;

    /**
     * @ColumnName TST_EDT_PTH
     * @ColumnType VARCHAR2(2083)
     * @ColumnComment 편집 구글 폼 경로 (URL)
     */
    private String tstEdtPth;

    /**
     * @ColumnName USR_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 회원을 구분할 고유한 문자열(USER-YYYYMMDD-NNNNNN)
     */
    private String usrId;

    /**
     * @ColumnName CRS_INF_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 강좌 정보를 구분할 고유한 문자열(CRS_INF-YYYYMMDD-NNNNNN)
     */
    private String crsInfId;

    /**
     * @ColumnName ARTC_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 게시판을 구분할 고유한 문자열
     */
    private String artcId;

    /**
     * @ColumnName TST_STAT
     * @ColumnType VARCHAR2(10)
     * @ColumnComment 시험 상태 - 확정 -> 시험 확정 시 편집 불가 - 마감 -> 시험 마감 시 편집 불가, 응시 불가
     */
    private String tstStat;

    /**
     * @ColumnName SBJ_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 과목을 구별하는 고유한 번호
     */
    private String sbjId;

    public String getTstId() {
        return this.tstId;
    }
    
    public void setTstId(String tstId) {
        this.tstId = tstId;
    }
    
    public String getTstCtt() {
        return this.tstCtt;
    }
    
    public void setTstCtt(String tstCtt) {
        this.tstCtt = tstCtt;
    }
    
    public String getTstExamDt() {
        return this.tstExamDt;
    }
    
    public void setTstExamDt(String tstExamDt) {
        this.tstExamDt = tstExamDt;
    }
    
    public String getTstRgstDt() {
        return this.tstRgstDt;
    }
    
    public void setTstRgstDt(String tstRgstDt) {
        this.tstRgstDt = tstRgstDt;
    }
    
    public String getTstUpdtDt() {
        return this.tstUpdtDt;
    }
    
    public void setTstUpdtDt(String tstUpdtDt) {
        this.tstUpdtDt = tstUpdtDt;
    }
    
    public String getTstDelDt() {
        return this.tstDelDt;
    }
    
    public void setTstDelDt(String tstDelDt) {
        this.tstDelDt = tstDelDt;
    }
    
    public String getTstDelYn() {
        return this.tstDelYn;
    }
    
    public void setTstDelYn(String tstDelYn) {
        this.tstDelYn = tstDelYn;
    }
    
    public String getTstRspnsPth() {
        return this.tstRspnsPth;
    }
    
    public void setTstRspnsPth(String tstRspnsPth) {
        this.tstRspnsPth = tstRspnsPth;
    }
    
    public String getTstEdtPth() {
        return this.tstEdtPth;
    }
    
    public void setTstEdtPth(String tstEdtPth) {
        this.tstEdtPth = tstEdtPth;
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
    
    public String getArtcId() {
        return this.artcId;
    }
    
    public void setArtcId(String artcId) {
        this.artcId = artcId;
    }
    
    public String getTstStat() {
        return this.tstStat;
    }
    
    public void setTstStat(String tstStat) {
        this.tstStat = tstStat;
    }
    
    public String getSbjId() {
        return this.sbjId;
    }
    
    public void setSbjId(String sbjId) {
        this.sbjId = sbjId;
    }
    
    @Override
    public String toString() {
        return "TstVO(tstId: " + tstId + ", tstCtt: " + tstCtt + ", tstExamDt: " + tstExamDt + ", tstRgstDt: " + tstRgstDt + ", tstUpdtDt: " + tstUpdtDt + ", tstDelDt: " + tstDelDt + ", tstDelYn: " + tstDelYn + ", tstRspnsPth: " + tstRspnsPth + ", tstEdtPth: " + tstEdtPth + ", usrId: " + usrId + ", crsInfId: " + crsInfId + ", artcId: " + artcId + ", tstStat: " + tstStat + ", sbjId: " + sbjId + ", )";
    }
}