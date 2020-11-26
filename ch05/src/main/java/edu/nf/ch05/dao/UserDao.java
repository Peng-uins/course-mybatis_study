package edu.nf.ch05.dao;

import edu.nf.ch05.entity.Users;

import java.util.List;

/**
 * @author 0.0
 */
public interface UserDao {
    /**
     * 统计总人数
     * @return
     */
    int count();

    /**
     * 模糊查询方法
     * @param likename
     * @return
     */
    List<Users> like(String likename);
}
