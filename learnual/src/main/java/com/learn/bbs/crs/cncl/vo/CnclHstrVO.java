package com.learn.bbs.crs.cncl.vo;

/**
 * @TableName CNCL_HSTR
 * @TableComment null
 * 취소 내역
 */
public class CnclHstrVO {

    /**
     * @ColumnName CNCL_HSTR_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 취소 내역을 구분할 고유한 문자열(CNCL-HSTR-YYYYMMDD-NNNNNN)
     */
    private String cnclHstrId;

    /**
     * @ColumnName CNCL_HSTR_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 회원이 강좌를 신청한 날짜
     */
    private String cnclHstrRgstDt;

    /**
     * @ColumnName APP_HSTR_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 신청 내역을 구분할 고유한 문자열(APP_HSTR-YYYYMMDD-NNNNNN)
     */
    private String appHstrId;

    public String getCnclHstrId() {
        return this.cnclHstrId;
    }
    
    public void setCnclHstrId(String cnclHstrId) {
        this.cnclHstrId = cnclHstrId;
    }
    
    public String getCnclHstrRgstDt() {
        return this.cnclHstrRgstDt;
    }
    
    public void setCnclHstrRgstDt(String cnclHstrRgstDt) {
        this.cnclHstrRgstDt = cnclHstrRgstDt;
    }
    
    public String getAppHstrId() {
        return this.appHstrId;
    }
    
    public void setAppHstrId(String appHstrId) {
        this.appHstrId = appHstrId;
    }
    
    @Override
    public String toString() {
        return "CnclHstrVO(cnclHstrId: " + cnclHstrId + ", cnclHstrRgstDt: " + cnclHstrRgstDt + ", appHstrId: " + appHstrId + ", )";
    }
}