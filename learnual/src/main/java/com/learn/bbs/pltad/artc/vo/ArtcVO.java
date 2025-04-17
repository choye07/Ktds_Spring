package com.learn.bbs.pltad.artc.vo;

/**
 * @TableName ARTC
 * @TableComment null
 * 게시판
 */
public class ArtcVO {

    /**
     * @ColumnName ARTC_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 게시판을 구분할 고유한 문자열
     */
    private String artcId;

    /**
     * @ColumnName ARTC_NM
     * @ColumnType VARCHAR2(100)
     * @ColumnComment 게시판의 이름
     */
    private String artcNm;

    /**
     * @ColumnName ARTC_PHT_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 사진이 포함되어 있는지에 대한 여부
     */
    private String artcPhtYn;

    /**
     * @ColumnName ARTC_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 게시판 등록 날짜
     */
    private String artcRgstDt;

    /**
     * @ColumnName ARTC_UPDT_DT
     * @ColumnType DATE
     * @ColumnComment 게시판 수정 날짜
     */
    private String artcUpdtDt;

    /**
     * @ColumnName ARTC_DEL_DT
     * @ColumnType DATE
     * @ColumnComment 게시판 삭제 날짜
     */
    private String artcDelDt;

    /**
     * @ColumnName ARTC_DEL_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 게시판 삭제 여부
     */
    private String artcDelYn;

    /**
     * @ColumnName ARTC_ACC_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 게시판을 CRUD할 수 있는 권한 아이디(회원, 강사, 플랫폼 관리자 권한 ID)
     */
    private String artcAccId;

    /**
     * @ColumnName INSTTN_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 기관(학원) 정보의 고유한 아이디(INSTTN-YYYYMMDD-NNNNNN)
     */
    private String insttnId;

    public String getArtcId() {
        return this.artcId;
    }
    
    public void setArtcId(String artcId) {
        this.artcId = artcId;
    }
    
    public String getArtcNm() {
        return this.artcNm;
    }
    
    public void setArtcNm(String artcNm) {
        this.artcNm = artcNm;
    }
    
    public String getArtcPhtYn() {
        return this.artcPhtYn;
    }
    
    public void setArtcPhtYn(String artcPhtYn) {
        this.artcPhtYn = artcPhtYn;
    }
    
    public String getArtcRgstDt() {
        return this.artcRgstDt;
    }
    
    public void setArtcRgstDt(String artcRgstDt) {
        this.artcRgstDt = artcRgstDt;
    }
    
    public String getArtcUpdtDt() {
        return this.artcUpdtDt;
    }
    
    public void setArtcUpdtDt(String artcUpdtDt) {
        this.artcUpdtDt = artcUpdtDt;
    }
    
    public String getArtcDelDt() {
        return this.artcDelDt;
    }
    
    public void setArtcDelDt(String artcDelDt) {
        this.artcDelDt = artcDelDt;
    }
    
    public String getArtcDelYn() {
        return this.artcDelYn;
    }
    
    public void setArtcDelYn(String artcDelYn) {
        this.artcDelYn = artcDelYn;
    }
    
    public String getArtcAccId() {
        return this.artcAccId;
    }
    
    public void setArtcAccId(String artcAccId) {
        this.artcAccId = artcAccId;
    }
    
    public String getInsttnId() {
        return this.insttnId;
    }
    
    public void setInsttnId(String insttnId) {
        this.insttnId = insttnId;
    }
    
    @Override
    public String toString() {
        return "ArtcVO(artcId: " + artcId + ", artcNm: " + artcNm + ", artcPhtYn: " + artcPhtYn + ", artcRgstDt: " + artcRgstDt + ", artcUpdtDt: " + artcUpdtDt + ", artcDelDt: " + artcDelDt + ", artcDelYn: " + artcDelYn + ", artcAccId: " + artcAccId + ", insttnId: " + insttnId + ", )";
    }
}