package edu.nf.ch07.dao;

import edu.nf.ch07.entity.Users;

import java.util.List;

/**
 * @author 0.0
 */
public interface UserDao {

    /**
     * 批量添加用户
     */
    void addBatch(List<Users> user);

    /**
     * 批量删除
     * @param ids
     */
    void delBatch(int[] ids);

}
