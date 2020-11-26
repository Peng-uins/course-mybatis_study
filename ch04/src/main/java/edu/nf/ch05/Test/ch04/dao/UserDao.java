package edu.nf.ch05.Test.ch04.dao;

import edu.nf.ch05.Test.ch04.entity.Users;

import java.util.List;

public interface UserDao {

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    Users getUserById(int id);

    /**
     * 查询用户列表
     * @return
     */
    List<Users> listUser();
}
