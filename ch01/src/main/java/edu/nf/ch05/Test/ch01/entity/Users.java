package edu.nf.ch05.Test.ch01.entity;

/**
 * @author 0.0
 */
public class Users {

    private Integer uid;
    private String userName;

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUid() {
        return uid;
    }

    public String getUserName() {
        return userName;
    }

    public Users() {
    }

    public Users(Integer uid, String userName) {
        this.uid = uid;
        this.userName = userName;
    }
}
