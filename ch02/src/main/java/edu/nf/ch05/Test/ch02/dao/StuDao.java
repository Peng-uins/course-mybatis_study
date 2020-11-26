package edu.nf.ch05.Test.ch02.dao;

import edu.nf.ch05.Test.ch02.entity.Student;

public interface StuDao {
    /**
     * 添加学生
     * @param student
     */
    void save(Student student);

    /**
     * 添加学生
     * @param student
     */
    void save2(Student student);
}
