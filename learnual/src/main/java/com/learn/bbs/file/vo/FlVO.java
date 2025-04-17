package com.learn.bbs.file.vo;

/**
 * @TableName FL
 * @TableComment null
 * 파일
 */
public class FlVO {

    /**
     * @ColumnName FL_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 파일 아이디(시퀀스 번호)
     */
    private String flId;

    /**
     * @ColumnName FL_NM
     * @ColumnType VARCHAR2(100)
     * @ColumnComment 원본 파일 이름
     */
    private String flNm;

    /**
     * @ColumnName FL_OBFS_NM
     * @ColumnType VARCHAR2(100)
     * @ColumnComment 난독화된 파일 이름
     */
    private String flObfsNm;

    /**
     * @ColumnName FL_PTH
     * @ColumnType VARCHAR2(2083)
     * @ColumnComment 파일 경로
     */
    private String flPth;

    /**
     * @ColumnName FL_OBFS_PTH
     * @ColumnType VARCHAR2(2083)
     * @ColumnComment 난독화된 파일 경로
     */
    private String flObfsPth;

    /**
     * @ColumnName FL_SZ
     * @ColumnType NUMBER(, )
     * @ColumnComment 파일 크기
     */
    private int flSz;

    /**
     * @ColumnName FL_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 파일 등록 날짜
     */
    private String flRgstDt;

    /**
     * @ColumnName FL_UPDT_DT
     * @ColumnType DATE
     * @ColumnComment 파일 수정 날짜
     */
    private String flUpdtDt;

    /**
     * @ColumnName FL_DEL_DT
     * @ColumnType DATE
     * @ColumnComment 파일 삭제 날짜
     */
    private String flDelDt;

    /**
     * @ColumnName FL_DEL_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 파일 삭제 여부 (Y/N)
     */
    private String flDelYn;

    /**
     * @ColumnName FL_TYPE_ID
     * @ColumnType VARCHAR2(5)
     * @ColumnComment 파일 확장자명(기존 확장자)
     */
    private String flTypeId;

    /**
     * @ColumnName ARTC_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 게시판을 구분할 고유한 문자열
     */
    private String artcId;

    /**
     * @ColumnName ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment insert 과정 간소화 때문에 미리 발급해야한다.
     */
    private String id;

    public String getFlId() {
        return this.flId;
    }
    
    public void setFlId(String flId) {
        this.flId = flId;
    }
    
    public String getFlNm() {
        return this.flNm;
    }
    
    public void setFlNm(String flNm) {
        this.flNm = flNm;
    }
    
    public String getFlObfsNm() {
        return this.flObfsNm;
    }
    
    public void setFlObfsNm(String flObfsNm) {
        this.flObfsNm = flObfsNm;
    }
    
    public String getFlPth() {
        return this.flPth;
    }
    
    public void setFlPth(String flPth) {
        this.flPth = flPth;
    }
    
    public String getFlObfsPth() {
        return this.flObfsPth;
    }
    
    public void setFlObfsPth(String flObfsPth) {
        this.flObfsPth = flObfsPth;
    }
    
    public int getFlSz() {
        return this.flSz;
    }
    
    public void setFlSz(int flSz) {
        this.flSz = flSz;
    }
    
    public String getFlRgstDt() {
        return this.flRgstDt;
    }
    
    public void setFlRgstDt(String flRgstDt) {
        this.flRgstDt = flRgstDt;
    }
    
    public String getFlUpdtDt() {
        return this.flUpdtDt;
    }
    
    public void setFlUpdtDt(String flUpdtDt) {
        this.flUpdtDt = flUpdtDt;
    }
    
    public String getFlDelDt() {
        return this.flDelDt;
    }
    
    public void setFlDelDt(String flDelDt) {
        this.flDelDt = flDelDt;
    }
    
    public String getFlDelYn() {
        return this.flDelYn;
    }
    
    public void setFlDelYn(String flDelYn) {
        this.flDelYn = flDelYn;
    }
    
    public String getFlTypeId() {
        return this.flTypeId;
    }
    
    public void setFlTypeId(String flTypeId) {
        this.flTypeId = flTypeId;
    }
    
    public String getArtcId() {
        return this.artcId;
    }
    
    public void setArtcId(String artcId) {
        this.artcId = artcId;
    }
    
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "FlVO(flId: " + flId + ", flNm: " + flNm + ", flObfsNm: " + flObfsNm + ", flPth: " + flPth + ", flObfsPth: " + flObfsPth + ", flSz: " + flSz + ", flRgstDt: " + flRgstDt + ", flUpdtDt: " + flUpdtDt + ", flDelDt: " + flDelDt + ", flDelYn: " + flDelYn + ", flTypeId: " + flTypeId + ", artcId: " + artcId + ", id: " + id + ", )";
    }
}