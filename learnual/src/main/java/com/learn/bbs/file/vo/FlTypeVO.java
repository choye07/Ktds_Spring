package com.learn.bbs.file.vo;

/**
 * @TableName FL_TYPE
 * @TableComment null
 * 파일 타입
 */
public class FlTypeVO {

    /**
     * @ColumnName FL_TYPE_ID
     * @ColumnType VARCHAR2(5)
     * @ColumnComment 파일 확장자명(기존 확장자)
     */
    private String flTypeId;

    /**
     * @ColumnName FL_MDFY_TYPE
     * @ColumnType VARCHAR2(5)
     * @ColumnComment 변환 가능한 파일 확장자
     */
    private String flMdfyType;

    /**
     * @ColumnName FL_MDFY_TYPE_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 변환 허용 여부 (하다가 변환이 안되면 N으로 설정할 예정
     */
    private String flMdfyTypeYn;

    public String getFlTypeId() {
        return this.flTypeId;
    }
    
    public void setFlTypeId(String flTypeId) {
        this.flTypeId = flTypeId;
    }
    
    public String getFlMdfyType() {
        return this.flMdfyType;
    }
    
    public void setFlMdfyType(String flMdfyType) {
        this.flMdfyType = flMdfyType;
    }
    
    public String getFlMdfyTypeYn() {
        return this.flMdfyTypeYn;
    }
    
    public void setFlMdfyTypeYn(String flMdfyTypeYn) {
        this.flMdfyTypeYn = flMdfyTypeYn;
    }
    
    @Override
    public String toString() {
        return "FlTypeVO(flTypeId: " + flTypeId + ", flMdfyType: " + flMdfyType + ", flMdfyTypeYn: " + flMdfyTypeYn + ", )";
    }
}