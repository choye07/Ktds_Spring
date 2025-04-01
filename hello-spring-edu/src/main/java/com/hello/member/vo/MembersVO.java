package com.hello.member.vo;

/**
 * @TableName MEMBERS
 * @TableComment null
 */
public class MembersVO {

    /**
     * @ColumnName EMAIL
     * @ColumnType VARCHAR2(100)
     * @ColumnComment null
     */
    private String email;

    /**
     * @ColumnName NAME
     * @ColumnType VARCHAR2(100)
     * @ColumnComment null
     */
    private String name;

    /**
     * @ColumnName PASSWORD
     * @ColumnType VARCHAR2(100)
     * @ColumnComment null
     */
    private String password;

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "MembersVO(email: " + email + ", name: " + name + ", password: " + password + ", )";
    }
}