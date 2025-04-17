package com.learn.insttn.menu.vo;

/**
 * @TableName MENU
 * @TableComment null
 * 학원 메뉴
 */
public class InsttnMenuVO {

    /**
     * @ColumnName MENU_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 메뉴를 구별하는 고유한 번호(CLSS_CD-YYYYMMDD-NNNNNN)
     */
    private String menuId;

    /**
     * @ColumnName MENU_NM
     * @ColumnType VARCHAR2(100)
     * @ColumnComment 메뉴 이름
     */
    private String menuNm;

    /**
     * @ColumnName MENU_URL
     * @ColumnType VARCHAR2(100)
     * @ColumnComment 메뉴 URL
     */
    private String menuUrl;

    /**
     * @ColumnName MENU_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 메뉴 등록 날짜
     */
    private String menuRgstDt;

    /**
     * @ColumnName MENU_UPDT_DT
     * @ColumnType DATE
     * @ColumnComment 메뉴 수정 날짜
     */
    private String menuUpdtDt;

    /**
     * @ColumnName MENU_DEL_DT
     * @ColumnType DATE
     * @ColumnComment 메뉴 삭제 날짜
     */
    private String menuDelDt;

    /**
     * @ColumnName MENU_DEL_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 메뉴 삭제 여부
     */
    private String menuDelYn;

    /**
     * @ColumnName CMCD_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 메뉴 대분류를 구별하는 번호 (메모 확인)(CM-YYYYMMDD-NNNNNN)
     */
    private String cmcdId;

    /**
     * @ColumnName INSTTN_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 기관(학원) 정보의 고유한 아이디(INSTTN-YYYYMMDD-NNNNNN)
     */
    private String insttnId;

    public String getMenuId() {
        return this.menuId;
    }
    
    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }
    
    public String getMenuNm() {
        return this.menuNm;
    }
    
    public void setMenuNm(String menuNm) {
        this.menuNm = menuNm;
    }
    
    public String getMenuUrl() {
        return this.menuUrl;
    }
    
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }
    
    public String getMenuRgstDt() {
        return this.menuRgstDt;
    }
    
    public void setMenuRgstDt(String menuRgstDt) {
        this.menuRgstDt = menuRgstDt;
    }
    
    public String getMenuUpdtDt() {
        return this.menuUpdtDt;
    }
    
    public void setMenuUpdtDt(String menuUpdtDt) {
        this.menuUpdtDt = menuUpdtDt;
    }
    
    public String getMenuDelDt() {
        return this.menuDelDt;
    }
    
    public void setMenuDelDt(String menuDelDt) {
        this.menuDelDt = menuDelDt;
    }
    
    public String getMenuDelYn() {
        return this.menuDelYn;
    }
    
    public void setMenuDelYn(String menuDelYn) {
        this.menuDelYn = menuDelYn;
    }
    
    public String getCmcdId() {
        return this.cmcdId;
    }
    
    public void setCmcdId(String cmcdId) {
        this.cmcdId = cmcdId;
    }
    
    public String getInsttnId() {
        return this.insttnId;
    }
    
    public void setInsttnId(String insttnId) {
        this.insttnId = insttnId;
    }
    
    @Override
    public String toString() {
        return "MenuVO(menuId: " + menuId + ", menuNm: " + menuNm + ", menuUrl: " + menuUrl + ", menuRgstDt: " + menuRgstDt + ", menuUpdtDt: " + menuUpdtDt + ", menuDelDt: " + menuDelDt + ", menuDelYn: " + menuDelYn + ", cmcdId: " + cmcdId + ", insttnId: " + insttnId + ", )";
    }
}