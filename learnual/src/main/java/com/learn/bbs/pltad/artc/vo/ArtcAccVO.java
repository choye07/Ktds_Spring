package com.learn.bbs.pltad.artc.vo;

/**
 * @TableName ARTC_ACC
 * @TableComment null
 * 게시판 권한
 */
public class ArtcAccVO {

    /**
     * @ColumnName ARTC_ACC_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 게시판을 CRUD할 수 있는 권한 아이디(회원, 강사, 플랫폼 관리자 권한 ID)
     */
    private String artcAccId;

    /**
     * @ColumnName ARTC_ACC_WR
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 현 게시판에 글을 쓸 수 있는 권한
     */
    private String artcAccWr;

    /**
     * @ColumnName ARTC_ACC_RD
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 현 게시판에 글을 읽을 수 있는 권한
     */
    private String artcAccRd;

    /**
     * @ColumnName ARTC_ACC_UPDT
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 현 게시판에 글을 수정할 수 있는 권한
     */
    private String artcAccUpdt;

    /**
     * @ColumnName ARTC_ACC_DEL
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 현 게시판에 글을 삭제할 수 있는 권한
     */
    private String artcAccDel;

    /**
     * @ColumnName ARTC_ID
     * @ColumnType VARCHAR2(255)
     * @ColumnComment null
     */
    private String artcId;

    public String getArtcAccId() {
        return this.artcAccId;
    }
    
    public void setArtcAccId(String artcAccId) {
        this.artcAccId = artcAccId;
    }
    
    public String getArtcAccWr() {
        return this.artcAccWr;
    }
    
    public void setArtcAccWr(String artcAccWr) {
        this.artcAccWr = artcAccWr;
    }
    
    public String getArtcAccRd() {
        return this.artcAccRd;
    }
    
    public void setArtcAccRd(String artcAccRd) {
        this.artcAccRd = artcAccRd;
    }
    
    public String getArtcAccUpdt() {
        return this.artcAccUpdt;
    }
    
    public void setArtcAccUpdt(String artcAccUpdt) {
        this.artcAccUpdt = artcAccUpdt;
    }
    
    public String getArtcAccDel() {
        return this.artcAccDel;
    }
    
    public void setArtcAccDel(String artcAccDel) {
        this.artcAccDel = artcAccDel;
    }
    
    public String getArtcId() {
        return this.artcId;
    }
    
    public void setArtcId(String artcId) {
        this.artcId = artcId;
    }
    
    @Override
    public String toString() {
        return "ArtcAccVO(artcAccId: " + artcAccId + ", artcAccWr: " + artcAccWr + ", artcAccRd: " + artcAccRd + ", artcAccUpdt: " + artcAccUpdt + ", artcAccDel: " + artcAccDel + ", artcId: " + artcId + ", )";
    }
}