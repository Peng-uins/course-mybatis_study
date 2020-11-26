package edu.nf.ch05.Test.ch04.entity;

public class Users {
    private int uid;
    private String userName;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getUid() {
        return uid;
    }

    public String getUserName() {
        return userName;
    }

    public Users() {
    }

    public Users(int uid, String userName) {
        this.uid = uid;
        this.userName = userName;
    }
}
