package com.learn.bbs.attd.vo;


/**
 * @TableName ATTD
 * @TableComment null
 * 신청내역 VO
 */
public class AttdVO {

    /**
     * @ColumnName ATTD_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 출석을 구분할 고유한 아이디(-YYYYMMDD-NNNNNN)
     */
    private String attdId;

    /**
     * @ColumnName ATTD_DLY_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 일일 출석여부
     */
    private String attdDlyYn;

    /**
     * @ColumnName ATTD_TM
     * @ColumnType DATE
     * @ColumnComment 일일 출석 시간
     */
    private String attdTm;

    /**
     * @ColumnName ATTD_TD_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 회원의 지각 여부
     */
    private String attdTdYn;

    /**
     * @ColumnName ATTD_TD_TM
     * @ColumnType DATE
     * @ColumnComment null
     */
    private String attdTdTm;

    /**
     * @ColumnName ATTD_ERLV_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 회원의 조퇴 여부
     */
    private String attdErlvYn;

    /**
     * @ColumnName ATTD_EALV_TM
     * @ColumnType DATE
     * @ColumnComment null
     */
    private String attdEalvTm;

    /**
     * @ColumnName ATTD_ABS_RSN
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 회원의 결석 여부
     */
    private String attdAbsRsn;

    /**
     * @ColumnName ATTD_ABS_TM
     * @ColumnType DATE
     * @ColumnComment null
     */
    private String attdAbsTm;

    /**
     * @ColumnName ATTD_OTNG_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 회원의 외출 여부를 나타내는 컬럼
     */
    private String attdOtngYn;

    /**
     * @ColumnName ATTD_OTNG_TM
     * @ColumnType DATE
     * @ColumnComment null
     */
    private String attdOtngTm;

    /**
     * @ColumnName ATTD_RT_TM
     * @ColumnType DATE
     * @ColumnComment 외출 시 복귀 시간
     */
    private String attdRtTm;

    /**
     * @ColumnName ATTD_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 출석 등록 날짜
     */
    private String attdRgstDt;

    /**
     * @ColumnName ATTD_UPDT_DT
     * @ColumnType DATE
     * @ColumnComment 데이터가 수정된 날짜
     */
    private String attdUpdtDt;

    /**
     * @ColumnName ATTD_DEL_DT
     * @ColumnType DATE
     * @ColumnComment 데이터가 삭제된 날짜
     */
    private String attdDelDt;

    /**
     * @ColumnName ATTD_DEL_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 출석 데이터 삭제 여부
     */
    private String attdDelYn;

    /**
     * @ColumnName CRS_INF_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 강좌 정보를 구분할 고유한 문자열(CRS_INF-YYYYMMDD-NNNNNN)
     */
    private String crsInfId;

    /**
     * @ColumnName USR_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 회원을 구분할 고유한 문자열(USER-YYYYMMDD-NNNNNN)
     */
    private String usrId;

    /**
     * @ColumnName SBJ_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 과목을 구별하는 고유한 번호
     */
    private String sbjId;

    public String getAttdId() {
        return this.attdId;
    }
    
    public void setAttdId(String attdId) {
        this.attdId = attdId;
    }
    
    public String getAttdDlyYn() {
        return this.attdDlyYn;
    }
    
    public void setAttdDlyYn(String attdDlyYn) {
        this.attdDlyYn = attdDlyYn;
    }
    
    public String getAttdTm() {
        return this.attdTm;
    }
    
    public void setAttdTm(String attdTm) {
        this.attdTm = attdTm;
    }
    
    public String getAttdTdYn() {
        return this.attdTdYn;
    }
    
    public void setAttdTdYn(String attdTdYn) {
        this.attdTdYn = attdTdYn;
    }
    
    public String getAttdTdTm() {
        return this.attdTdTm;
    }
    
    public void setAttdTdTm(String attdTdTm) {
        this.attdTdTm = attdTdTm;
    }
    
    public String getAttdErlvYn() {
        return this.attdErlvYn;
    }
    
    public void setAttdErlvYn(String attdErlvYn) {
        this.attdErlvYn = attdErlvYn;
    }
    
    public String getAttdEalvTm() {
        return this.attdEalvTm;
    }
    
    public void setAttdEalvTm(String attdEalvTm) {
        this.attdEalvTm = attdEalvTm;
    }
    
    public String getAttdAbsRsn() {
        return this.attdAbsRsn;
    }
    
    public void setAttdAbsRsn(String attdAbsRsn) {
        this.attdAbsRsn = attdAbsRsn;
    }
    
    public String getAttdAbsTm() {
        return this.attdAbsTm;
    }
    
    public void setAttdAbsTm(String attdAbsTm) {
        this.attdAbsTm = attdAbsTm;
    }
    
    public String getAttdOtngYn() {
        return this.attdOtngYn;
    }
    
    public void setAttdOtngYn(String attdOtngYn) {
        this.attdOtngYn = attdOtngYn;
    }
    
    public String getAttdOtngTm() {
        return this.attdOtngTm;
    }
    
    public void setAttdOtngTm(String attdOtngTm) {
        this.attdOtngTm = attdOtngTm;
    }
    
    public String getAttdRtTm() {
        return this.attdRtTm;
    }
    
    public void setAttdRtTm(String attdRtTm) {
        this.attdRtTm = attdRtTm;
    }
    
    public String getAttdRgstDt() {
        return this.attdRgstDt;
    }
    
    public void setAttdRgstDt(String attdRgstDt) {
        this.attdRgstDt = attdRgstDt;
    }
    
    public String getAttdUpdtDt() {
        return this.attdUpdtDt;
    }
    
    public void setAttdUpdtDt(String attdUpdtDt) {
        this.attdUpdtDt = attdUpdtDt;
    }
    
    public String getAttdDelDt() {
        return this.attdDelDt;
    }
    
    public void setAttdDelDt(String attdDelDt) {
        this.attdDelDt = attdDelDt;
    }
    
    public String getAttdDelYn() {
        return this.attdDelYn;
    }
    
    public void setAttdDelYn(String attdDelYn) {
        this.attdDelYn = attdDelYn;
    }
    
    public String getCrsInfId() {
        return this.crsInfId;
    }
    
    public void setCrsInfId(String crsInfId) {
        this.crsInfId = crsInfId;
    }
    
    public String getUsrId() {
        return this.usrId;
    }
    
    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }
    
    public String getSbjId() {
        return this.sbjId;
    }
    
    public void setSbjId(String sbjId) {
        this.sbjId = sbjId;
    }
    
    @Override
    public String toString() {
        return "AttdVO(attdId: " + attdId + ", attdDlyYn: " + attdDlyYn + ", attdTm: " + attdTm + ", attdTdYn: " + attdTdYn + ", attdTdTm: " + attdTdTm + ", attdErlvYn: " + attdErlvYn + ", attdEalvTm: " + attdEalvTm + ", attdAbsRsn: " + attdAbsRsn + ", attdAbsTm: " + attdAbsTm + ", attdOtngYn: " + attdOtngYn + ", attdOtngTm: " + attdOtngTm + ", attdRtTm: " + attdRtTm + ", attdRgstDt: " + attdRgstDt + ", attdUpdtDt: " + attdUpdtDt + ", attdDelDt: " + attdDelDt + ", attdDelYn: " + attdDelYn + ", crsInfId: " + crsInfId + ", usrId: " + usrId + ", sbjId: " + sbjId + ", )";
    }
}