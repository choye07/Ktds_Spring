package com.learn.bbs.usr.vo;

/**
 * @TableName USR
 * @TableComment null
 * 사용자
 */
public class UsrVO {

    /**
     * @ColumnName USR_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 회원을 구분할 고유한 문자열(USER-YYYYMMDD-NNNNNN)
     */
    private String usrId;

    /**
     * @ColumnName USR_PW
     * @ColumnType VARCHAR2(20)
     * @ColumnComment 회원 비밀번호
     */
    private String usrPw;

    /**
     * @ColumnName USR_NM
     * @ColumnType VARCHAR2(100)
     * @ColumnComment 회원 이름
     */
    private String usrNm;

    /**
     * @ColumnName USR_PN
     * @ColumnType VARCHAR2(20)
     * @ColumnComment 회원 전화번호
     */
    private String usrPn;

    /**
     * @ColumnName USR_ADRS
     * @ColumnType VARCHAR2(200)
     * @ColumnComment 회원 주소
     */
    private String usrAdrs;

    /**
     * @ColumnName USR_ML
     * @ColumnType VARCHAR2(320)
     * @ColumnComment 회원 이메일
     */
    private String usrMl;

    /**
     * @ColumnName USR_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 회원 아이디 등록 날짜
     */
    private String usrRgstDt;

    /**
     * @ColumnName USR_UPDT_DT
     * @ColumnType DATE
     * @ColumnComment 회원 아이디 수정 날짜
     */
    private String usrUpdtDt;

    /**
     * @ColumnName USR_DEL_DT
     * @ColumnType DATE
     * @ColumnComment 회원 아이디 삭제 날짜
     */
    private String usrDelDt;

    /**
     * @ColumnName USR_DEL_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 회원 아이디 삭제 여부
     */
    private String usrDelYn;

    /**
     * @ColumnName USR_RCRT_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 회원 채용 여부
     */
    private String usrRcrtYn;

    /**
     * @ColumnName USR_SLT
     * @ColumnType VARCHAR2(32)
     * @ColumnComment 회원의 비밀번호 암호화를 위한 문자열
     */
    private String usrSlt;

    /**
     * @ColumnName USR_LGN_IP
     * @ColumnType VARCHAR2(39)
     * @ColumnComment 회원의 최근 접속 IP
     */
    private String usrLgnIp;

    /**
     * @ColumnName USR_LST_PW_MDFY_DT
     * @ColumnType DATE
     * @ColumnComment 회원의 최근 비밀번호 변경 날짜
     */
    private String usrLstPwMdfyDt;

    /**
     * @ColumnName USR_LST_LGN_DT
     * @ColumnType DATE
     * @ColumnComment 회원의 최근 로그인 날짜
     */
    private String usrLstLgnDt;

    /**
     * @ColumnName USR_LST_LGN_FAIL_DT
     * @ColumnType DATE
     * @ColumnComment 회원의 최근 로그인 실패 날짜
     */
    private String usrLstLgnFailDt;

    /**
     * @ColumnName USR_LGN_FAIL_CNT
     * @ColumnType NUMBER(1, 0)
     * @ColumnComment 회원이 로그인에 실패한 횟수
     */
    private int usrLgnFailCnt;

    /**
     * @ColumnName USR_LGN_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 회원 로그인 여부
     */
    private String usrLgnYn;

    /**
     * @ColumnName USR_BLK_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 회원 계정 잠금 여부
     */
    private String usrBlkYn;

    /**
     * @ColumnName CMCD_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 코드를 구별하는 고유한 번호(CM-YYYYMMDD-NNNNNN)
     */
    private String cmcdId;

    /**
     * @ColumnName INSTTN_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 기관(학원) 정보의 고유한 아이디(INSTTN-YYYYMMDD-NNNNNN)
     */
    private String insttnId;

    public String getUsrId() {
        return this.usrId;
    }
    
    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }
    
    public String getUsrPw() {
        return this.usrPw;
    }
    
    public void setUsrPw(String usrPw) {
        this.usrPw = usrPw;
    }
    
    public String getUsrNm() {
        return this.usrNm;
    }
    
    public void setUsrNm(String usrNm) {
        this.usrNm = usrNm;
    }
    
    public String getUsrPn() {
        return this.usrPn;
    }
    
    public void setUsrPn(String usrPn) {
        this.usrPn = usrPn;
    }
    
    public String getUsrAdrs() {
        return this.usrAdrs;
    }
    
    public void setUsrAdrs(String usrAdrs) {
        this.usrAdrs = usrAdrs;
    }
    
    public String getUsrMl() {
        return this.usrMl;
    }
    
    public void setUsrMl(String usrMl) {
        this.usrMl = usrMl;
    }
    
    public String getUsrRgstDt() {
        return this.usrRgstDt;
    }
    
    public void setUsrRgstDt(String usrRgstDt) {
        this.usrRgstDt = usrRgstDt;
    }
    
    public String getUsrUpdtDt() {
        return this.usrUpdtDt;
    }
    
    public void setUsrUpdtDt(String usrUpdtDt) {
        this.usrUpdtDt = usrUpdtDt;
    }
    
    public String getUsrDelDt() {
        return this.usrDelDt;
    }
    
    public void setUsrDelDt(String usrDelDt) {
        this.usrDelDt = usrDelDt;
    }
    
    public String getUsrDelYn() {
        return this.usrDelYn;
    }
    
    public void setUsrDelYn(String usrDelYn) {
        this.usrDelYn = usrDelYn;
    }
    
    public String getUsrRcrtYn() {
        return this.usrRcrtYn;
    }
    
    public void setUsrRcrtYn(String usrRcrtYn) {
        this.usrRcrtYn = usrRcrtYn;
    }
    
    public String getUsrSlt() {
        return this.usrSlt;
    }
    
    public void setUsrSlt(String usrSlt) {
        this.usrSlt = usrSlt;
    }
    
    public String getUsrLgnIp() {
        return this.usrLgnIp;
    }
    
    public void setUsrLgnIp(String usrLgnIp) {
        this.usrLgnIp = usrLgnIp;
    }
    
    public String getUsrLstPwMdfyDt() {
        return this.usrLstPwMdfyDt;
    }
    
    public void setUsrLstPwMdfyDt(String usrLstPwMdfyDt) {
        this.usrLstPwMdfyDt = usrLstPwMdfyDt;
    }
    
    public String getUsrLstLgnDt() {
        return this.usrLstLgnDt;
    }
    
    public void setUsrLstLgnDt(String usrLstLgnDt) {
        this.usrLstLgnDt = usrLstLgnDt;
    }
    
    public String getUsrLstLgnFailDt() {
        return this.usrLstLgnFailDt;
    }
    
    public void setUsrLstLgnFailDt(String usrLstLgnFailDt) {
        this.usrLstLgnFailDt = usrLstLgnFailDt;
    }
    
    public int getUsrLgnFailCnt() {
        return this.usrLgnFailCnt;
    }
    
    public void setUsrLgnFailCnt(int usrLgnFailCnt) {
        this.usrLgnFailCnt = usrLgnFailCnt;
    }
    
    public String getUsrLgnYn() {
        return this.usrLgnYn;
    }
    
    public void setUsrLgnYn(String usrLgnYn) {
        this.usrLgnYn = usrLgnYn;
    }
    
    public String getUsrBlkYn() {
        return this.usrBlkYn;
    }
    
    public void setUsrBlkYn(String usrBlkYn) {
        this.usrBlkYn = usrBlkYn;
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
        return "UsrVO(usrId: " + usrId + ", usrPw: " + usrPw + ", usrNm: " + usrNm + ", usrPn: " + usrPn + ", usrAdrs: " + usrAdrs + ", usrMl: " + usrMl + ", usrRgstDt: " + usrRgstDt + ", usrUpdtDt: " + usrUpdtDt + ", usrDelDt: " + usrDelDt + ", usrDelYn: " + usrDelYn + ", usrRcrtYn: " + usrRcrtYn + ", usrSlt: " + usrSlt + ", usrLgnIp: " + usrLgnIp + ", usrLstPwMdfyDt: " + usrLstPwMdfyDt + ", usrLstLgnDt: " + usrLstLgnDt + ", usrLstLgnFailDt: " + usrLstLgnFailDt + ", usrLgnFailCnt: " + usrLgnFailCnt + ", usrLgnYn: " + usrLgnYn + ", usrBlkYn: " + usrBlkYn + ", cmcdId: " + cmcdId + ", insttnId: " + insttnId + ", )";
    }
}