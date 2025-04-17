package com.learn.bbs.eduad.todo.vo;

/**
 * @TableName TODO
 * @TableComment null
 * 투두리스트
 */
public class TodoVO {

    /**
     * @ColumnName TODO_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 투두 리스트의 고유한 아이디
     */
    private String todoId;

    /**
     * @ColumnName TODO_CTT
     * @ColumnType VARCHAR2(4000)
     * @ColumnComment 사용자(강사)가 추가하거나 강의 계획서 파일에서 읽어온 투두 내용
     */
    private String todoCtt;

    /**
     * @ColumnName TODO_FINISH_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 투두 수행 완료 여부 (Y/N)
     */
    private String todoFinishYn;

    /**
     * @ColumnName TODO_RGST_DT
     * @ColumnType DATE
     * @ColumnComment 투두 리스트 등록 날짜
     */
    private String todoRgstDt;

    /**
     * @ColumnName TODO_UPDT_DT
     * @ColumnType DATE
     * @ColumnComment 투두 리스트 수정 날짜
     */
    private String todoUpdtDt;

    /**
     * @ColumnName TODO_DEL_DT
     * @ColumnType DATE
     * @ColumnComment 투두 리스트 삭제 날짜
     */
    private String todoDelDt;

    /**
     * @ColumnName TODO_DEL_YN
     * @ColumnType CHAR(1)
     * @ColumnComment 투두 리스트 삭제 여부 (Y/N)
     */
    private String todoDelYn;

    /**
     * @ColumnName CRS_INF_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 강좌 정보를 구분할 고유한 문자열(CRS_INF-YYYYMMDD-NNNNNN)
     */
    private String crsInfId;

    /**
     * @ColumnName SBJ_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 과목을 구별하는 고유한 번호
     */
    private String sbjId;

    /**
     * @ColumnName ARTC_ID
     * @ColumnType VARCHAR2(50)
     * @ColumnComment 게시판을 구분할 고유한 문자열
     */
    private String artcId;

    public String getTodoId() {
        return this.todoId;
    }
    
    public void setTodoId(String todoId) {
        this.todoId = todoId;
    }
    
    public String getTodoCtt() {
        return this.todoCtt;
    }
    
    public void setTodoCtt(String todoCtt) {
        this.todoCtt = todoCtt;
    }
    
    public String getTodoFinishYn() {
        return this.todoFinishYn;
    }
    
    public void setTodoFinishYn(String todoFinishYn) {
        this.todoFinishYn = todoFinishYn;
    }
    
    public String getTodoRgstDt() {
        return this.todoRgstDt;
    }
    
    public void setTodoRgstDt(String todoRgstDt) {
        this.todoRgstDt = todoRgstDt;
    }
    
    public String getTodoUpdtDt() {
        return this.todoUpdtDt;
    }
    
    public void setTodoUpdtDt(String todoUpdtDt) {
        this.todoUpdtDt = todoUpdtDt;
    }
    
    public String getTodoDelDt() {
        return this.todoDelDt;
    }
    
    public void setTodoDelDt(String todoDelDt) {
        this.todoDelDt = todoDelDt;
    }
    
    public String getTodoDelYn() {
        return this.todoDelYn;
    }
    
    public void setTodoDelYn(String todoDelYn) {
        this.todoDelYn = todoDelYn;
    }
    
    public String getCrsInfId() {
        return this.crsInfId;
    }
    
    public void setCrsInfId(String crsInfId) {
        this.crsInfId = crsInfId;
    }
    
    public String getSbjId() {
        return this.sbjId;
    }
    
    public void setSbjId(String sbjId) {
        this.sbjId = sbjId;
    }
    
    public String getArtcId() {
        return this.artcId;
    }
    
    public void setArtcId(String artcId) {
        this.artcId = artcId;
    }
    
    @Override
    public String toString() {
        return "TodoVO(todoId: " + todoId + ", todoCtt: " + todoCtt + ", todoFinishYn: " + todoFinishYn + ", todoRgstDt: " + todoRgstDt + ", todoUpdtDt: " + todoUpdtDt + ", todoDelDt: " + todoDelDt + ", todoDelYn: " + todoDelYn + ", crsInfId: " + crsInfId + ", sbjId: " + sbjId + ", artcId: " + artcId + ", )";
    }
}