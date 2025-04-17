package com.learn.bbs.pltad.crsinf.vo;

/**
 * @TableName CRS_INF
 * @TableComment null
 * 강좌 정보
 */
public class CrsInfVO {

    /**
     * @ColumnName CRS_INF_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 강좌 정보를 구분할 고유한 문자열(CRS_INF-YYYYMMDD-NNNNNN)
     */
    private String crsInfId;

    /**
     * @ColumnName CRS_INF_ST_DT
     * @ColumnType DATE
     * @ColumnComment 강좌 시작 날짜
     */
    private String crsInfStDt;

    /**
     * @ColumnName CRS_INF_END_DT
     * @ColumnType DATE
     * @ColumnComment 강좌 종료 날짜
     */
    private String crsInfEndDt;

    /**
     * @ColumnName CRS_INF_NM
     * @ColumnType VARCHAR2(100)
     * @ColumnComment 강좌 이름
     */
    private String crsInfNm;

    /**
     * @ColumnName CRS_INF_CRS_ROOM_NM
     * @ColumnType VARCHAR2(100)
     * @ColumnComment 강좌를 진행할 강의실 이름
     */
    private String crsInfCrsRoomNm;

    /**
     * @ColumnName CRS_INF_UPDT_DT
     * @ColumnType DATE
     * @ColumnComment 강좌 수정 날짜
     */
    private String crsInfUpdtDt;

    /**
     * @ColumnName CRS_INF_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 강좌 등록 날짜
     */
    private String crsInfRgstDt;

    /**
     * @ColumnName CRS_INF_DEL_DT
     * @ColumnType DATE
     * @ColumnComment 강좌 삭제 날짜
     */
    private String crsInfDelDt;

    /**
     * @ColumnName CRS_INF_DEL_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 강좌 정보 삭제 여부
     */
    private String crsInfDelYn;

    /**
     * @ColumnName CRS_INF_APP_DT
     * @ColumnType DATE
     * @ColumnComment 강좌 신청 날짜
     */
    private String crsInfAppDt;

    /**
     * @ColumnName CRS_INF_DDLN_DT
     * @ColumnType DATE
     * @ColumnComment 강좌 신청 마감 날짜
     */
    private String crsInfDdlnDt;

    /**
     * @ColumnName CRS_INF_DDLN_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 강좌 신청 마감 여부
     */
    private String crsInfDdlnYn;

    /**
     * @ColumnName INSTR_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 강사의 고유한 아이디
     */
    private String instrId;

    /**
     * @ColumnName CRS_INF_PRS_CNT
     * @ColumnType NUMBER(3, 0)
     * @ColumnComment 강좌 수강인원
     */
    private int crsInfPrsCnt;

    /**
     * @ColumnName CRS_INF_ST_TM
     * @ColumnType DATE
     * @ColumnComment 강좌 시작 시간
     */
    private String crsInfStTm;

    /**
     * @ColumnName CRS_INF_END_TM
     * @ColumnType DATE
     * @ColumnComment 강좌 종료 시간
     */
    private String crsInfEndTm;

    public String getCrsInfId() {
        return this.crsInfId;
    }
    
    public void setCrsInfId(String crsInfId) {
        this.crsInfId = crsInfId;
    }
    
    public String getCrsInfStDt() {
        return this.crsInfStDt;
    }
    
    public void setCrsInfStDt(String crsInfStDt) {
        this.crsInfStDt = crsInfStDt;
    }
    
    public String getCrsInfEndDt() {
        return this.crsInfEndDt;
    }
    
    public void setCrsInfEndDt(String crsInfEndDt) {
        this.crsInfEndDt = crsInfEndDt;
    }
    
    public String getCrsInfNm() {
        return this.crsInfNm;
    }
    
    public void setCrsInfNm(String crsInfNm) {
        this.crsInfNm = crsInfNm;
    }
    
    public String getCrsInfCrsRoomNm() {
        return this.crsInfCrsRoomNm;
    }
    
    public void setCrsInfCrsRoomNm(String crsInfCrsRoomNm) {
        this.crsInfCrsRoomNm = crsInfCrsRoomNm;
    }
    
    public String getCrsInfUpdtDt() {
        return this.crsInfUpdtDt;
    }
    
    public void setCrsInfUpdtDt(String crsInfUpdtDt) {
        this.crsInfUpdtDt = crsInfUpdtDt;
    }
    
    public String getCrsInfRgstDt() {
        return this.crsInfRgstDt;
    }
    
    public void setCrsInfRgstDt(String crsInfRgstDt) {
        this.crsInfRgstDt = crsInfRgstDt;
    }
    
    public String getCrsInfDelDt() {
        return this.crsInfDelDt;
    }
    
    public void setCrsInfDelDt(String crsInfDelDt) {
        this.crsInfDelDt = crsInfDelDt;
    }
    
    public String getCrsInfDelYn() {
        return this.crsInfDelYn;
    }
    
    public void setCrsInfDelYn(String crsInfDelYn) {
        this.crsInfDelYn = crsInfDelYn;
    }
    
    public String getCrsInfAppDt() {
        return this.crsInfAppDt;
    }
    
    public void setCrsInfAppDt(String crsInfAppDt) {
        this.crsInfAppDt = crsInfAppDt;
    }
    
    public String getCrsInfDdlnDt() {
        return this.crsInfDdlnDt;
    }
    
    public void setCrsInfDdlnDt(String crsInfDdlnDt) {
        this.crsInfDdlnDt = crsInfDdlnDt;
    }
    
    public String getCrsInfDdlnYn() {
        return this.crsInfDdlnYn;
    }
    
    public void setCrsInfDdlnYn(String crsInfDdlnYn) {
        this.crsInfDdlnYn = crsInfDdlnYn;
    }
    
    public String getInstrId() {
        return this.instrId;
    }
    
    public void setInstrId(String instrId) {
        this.instrId = instrId;
    }
    
    public int getCrsInfPrsCnt() {
        return this.crsInfPrsCnt;
    }
    
    public void setCrsInfPrsCnt(int crsInfPrsCnt) {
        this.crsInfPrsCnt = crsInfPrsCnt;
    }
    
    public String getCrsInfStTm() {
        return this.crsInfStTm;
    }
    
    public void setCrsInfStTm(String crsInfStTm) {
        this.crsInfStTm = crsInfStTm;
    }
    
    public String getCrsInfEndTm() {
        return this.crsInfEndTm;
    }
    
    public void setCrsInfEndTm(String crsInfEndTm) {
        this.crsInfEndTm = crsInfEndTm;
    }
    
    @Override
    public String toString() {
        return "CrsInfVO(crsInfId: " + crsInfId + ", crsInfStDt: " + crsInfStDt + ", crsInfEndDt: " + crsInfEndDt + ", crsInfNm: " + crsInfNm + ", crsInfCrsRoomNm: " + crsInfCrsRoomNm + ", crsInfUpdtDt: " + crsInfUpdtDt + ", crsInfRgstDt: " + crsInfRgstDt + ", crsInfDelDt: " + crsInfDelDt + ", crsInfDelYn: " + crsInfDelYn + ", crsInfAppDt: " + crsInfAppDt + ", crsInfDdlnDt: " + crsInfDdlnDt + ", crsInfDdlnYn: " + crsInfDdlnYn + ", instrId: " + instrId + ", crsInfPrsCnt: " + crsInfPrsCnt + ", crsInfStTm: " + crsInfStTm + ", crsInfEndTm: " + crsInfEndTm + ", )";
    }
}