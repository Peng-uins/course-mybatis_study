package edu.nf.ch05.Test.ch02.entity;

/**
 * @author 0.0
 */
public class Student {

    private String stuId;
    private String stuName;

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuId() {
        return stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public Student() {
    }

    public Student(String stuId, String stuName) {
        this.stuId = stuId;
        this.stuName = stuName;
    }
}
