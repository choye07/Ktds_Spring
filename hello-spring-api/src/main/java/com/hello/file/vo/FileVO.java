package com.hello.file.vo;

/**
 * @TableName FILE
 * @TableComment 첨부파일
 */
public class FileVO {

    /**
     * @ColumnName FL_ID
     * @ColumnType NUMBER(38, 0)
     * @ColumnComment 첨부파일의 아이디
     */
    private int flId;

    /**
     * @ColumnName ID
     * @ColumnType NUMBER(38, 0)
     * @ColumnComment 게시글의 아이디
     */
    private int id;

    /**
     * @ColumnName FL_NM
     * @ColumnType VARCHAR2(255)
     * @ColumnComment 사용자에게 노출될 원본 파일의 이름
     */
    private String flNm;

    /**
     * @ColumnName OBFS_FL_NM
     * @ColumnType VARCHAR2(255)
     * @ColumnComment 난독화된 파일의 이름
     */
    private String obfsFlNm;

    /**
     * @ColumnName OBFS_FL_PTH
     * @ColumnType VARCHAR2(2000)
     * @ColumnComment 파일이 저장된 서버의 물리적인 경로
     */
    private String obfsFlPth;

    /**
     * @ColumnName FL_SZ
     * @ColumnType NUMBER(38, 0)
     * @ColumnComment 업로드된 파일의 크기 (Bytes)
     */
    private long flSz;

    public int getFlId() {
        return this.flId;
    }
    
    public void setFlId(int flId) {
        this.flId = flId;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getFlNm() {
        return this.flNm;
    }
    
    public void setFlNm(String flNm) {
        this.flNm = flNm;
    }
    
    public String getObfsFlNm() {
        return this.obfsFlNm;
    }
    
    public void setObfsFlNm(String obfsFlNm) {
        this.obfsFlNm = obfsFlNm;
    }
    
    public String getObfsFlPth() {
        return this.obfsFlPth;
    }
    
    public void setObfsFlPth(String obfsFlPth) {
        this.obfsFlPth = obfsFlPth;
    }
    
    public long getFlSz() {
        return this.flSz;
    }
    
    public void setFlSz(long flSz) {
        this.flSz = flSz;
    }
    
    @Override
    public String toString() {
        return "FileVO(flId: " + flId + ", id: " + id + ", flNm: " + flNm + ", obfsFlNm: " + obfsFlNm + ", obfsFlPth: " + obfsFlPth + ", flSz: " + flSz + ", )";
    }
}