package com.learn.bbs.eduad.flarch.vo;

import java.util.List;

import com.learn.bbs.file.vo.FlVO;

//TODO 회원 되면은 private MembersVO memberVO; 추가하기

/**
 * @TableName FL_ARCH
 * @TableComment null
 * 자료실
 */
public class FlArchVO {

    /**
     * @ColumnName FL_ARCH_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 자료실 게시글 아이디(FL_ARCH-YYYYMMDD-NNNNNN)
     */
    private String flArchId;

    /**
     * @ColumnName FL_ARCH_TTL
     * @ColumnType VARCHAR2(100)
     * @ColumnComment 자료실 게시글 제목
     */
    private String flArchTtl;

    /**
     * @ColumnName FL_ARCH_CTT
     * @ColumnType VARCHAR2(4000)
     * @ColumnComment 자료실 게시글 내용
     */
    private String flArchCtt;

    /**
     * @ColumnName FL_ARCH_VIEW_CNT
     * @ColumnType NUMBER(, )
     * @ColumnComment 자료실 게시글 조회수
     */
    private int flArchViewCnt;

    /**
     * @ColumnName FL_ARCH_ORG_TYPE
     * @ColumnType VARCHAR2(5)
     * @ColumnComment 원본 파일 확장자
     */
    private String flArchOrgType;

    /**
     * @ColumnName FL_ARCH_MDFY_TYPE
     * @ColumnType VARCHAR2(5)
     * @ColumnComment 변경된 확장자
     */
    private String flArchMdfyType;

    /**
     * @ColumnName FL_ARCH_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 게시글 등록 날짜
     */
    private String flArchRgstDt;

    /**
     * @ColumnName FL_ARCH_UPDT_DT
     * @ColumnType DATE
     * @ColumnComment 게시글 수정 날짜
     */
    private String flArchUpdtDt;

    /**
     * @ColumnName FL_ARCH_DEL_DT
     * @ColumnType DATE
     * @ColumnComment 게시글 삭제 날짜
     */
    private String flArchDelDt;

    /**
     * @ColumnName FL_ARCH_DEL_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 게시글 삭제 여부 (Y/N)
     */
    private String flArchDelYn;

    /**
     * @ColumnName INSTR_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 강사의 계정 아이디(이메일 형식)
     */
    private String instrId;
    

    /**
     * @ColumnName ARTC_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 게시판을 구분할 고유한 문자열
     */
    private String artcId;
    
    /**
     * 파일을 여러개 업로드 할 수 있도록 리스트로 받아온다.
     */
    private List<FlVO> flList;

    //TODO 멤버(회원) 추가하기
    
    
    
    
    public List<FlVO> getFlList() {
      return flList;
   }

   public void setFlList(List<FlVO> flList) {
      this.flList = flList;
   }

   public String getFlArchId() {
        return this.flArchId;
    }
    
    public void setFlArchId(String flArchId) {
        this.flArchId = flArchId;
    }
    
    public String getFlArchTtl() {
        return this.flArchTtl;
    }
    
    public void setFlArchTtl(String flArchTtl) {
        this.flArchTtl = flArchTtl;
    }
    
    public String getFlArchCtt() {
        return this.flArchCtt;
    }
    
    public void setFlArchCtt(String flArchCtt) {
        this.flArchCtt = flArchCtt;
    }
    
    public int getFlArchViewCnt() {
        return this.flArchViewCnt;
    }
    
    public void setFlArchViewCnt(int flArchViewCnt) {
        this.flArchViewCnt = flArchViewCnt;
    }
    
    public String getFlArchOrgType() {
        return this.flArchOrgType;
    }
    
    public void setFlArchOrgType(String flArchOrgType) {
        this.flArchOrgType = flArchOrgType;
    }
    
    public String getFlArchMdfyType() {
        return this.flArchMdfyType;
    }
    
    public void setFlArchMdfyType(String flArchMdfyType) {
        this.flArchMdfyType = flArchMdfyType;
    }
    
    public String getFlArchRgstDt() {
        return this.flArchRgstDt;
    }
    
    public void setFlArchRgstDt(String flArchRgstDt) {
        this.flArchRgstDt = flArchRgstDt;
    }
    
    public String getFlArchUpdtDt() {
        return this.flArchUpdtDt;
    }
    
    public void setFlArchUpdtDt(String flArchUpdtDt) {
        this.flArchUpdtDt = flArchUpdtDt;
    }
    
    public String getFlArchDelDt() {
        return this.flArchDelDt;
    }
    
    public void setFlArchDelDt(String flArchDelDt) {
        this.flArchDelDt = flArchDelDt;
    }
    
    public String getFlArchDelYn() {
        return this.flArchDelYn;
    }
    
    public void setFlArchDelYn(String flArchDelYn) {
        this.flArchDelYn = flArchDelYn;
    }
    
    public String getInstrId() {
        return this.instrId;
    }
    
    public void setInstrId(String instrId) {
        this.instrId = instrId;
    }
    
    public String getArtcId() {
        return this.artcId;
    }
    
    public void setArtcId(String artcId) {
        this.artcId = artcId;
    }
    
    @Override
    public String toString() {
        return "FlArchVO(flArchId: " + flArchId + ", flArchTtl: " + flArchTtl + ", flArchCtt: " + flArchCtt + ", flArchViewCnt: " + flArchViewCnt + ", flArchOrgType: " + flArchOrgType + ", flArchMdfyType: " + flArchMdfyType + ", flArchRgstDt: " + flArchRgstDt + ", flArchUpdtDt: " + flArchUpdtDt + ", flArchDelDt: " + flArchDelDt + ", flArchDelYn: " + flArchDelYn + ", instrId: " + instrId + ", artcId: " + artcId + ", )";
    }
}