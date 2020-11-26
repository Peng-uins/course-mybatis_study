package edu.nf.ch08.dao;

import edu.nf.ch08.entity.Student;

/**
 * @author 0.0
 */
public interface StuDao {

    Student getStudentById(int id);

    /**
     * 根据id查询学生学习
     * @param id
     * @return
     */
    Student getStudentById2(int id);
}
