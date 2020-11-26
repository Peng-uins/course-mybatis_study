package edu.nf.ch05.Test.ch03.entity;

public class Users {

    private int uid;
    private String uName;

    public Users() {
    }

    public Users(int uid, String uName) {
        this.uid = uid;
        this.uName = uName;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public int getUid() {
        return uid;
    }

    public String getuName() {
        return uName;
    }
}
