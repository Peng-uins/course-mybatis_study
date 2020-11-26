package edu.nf.ch05.Test.ch03.dao;

import edu.nf.ch05.Test.ch03.entity.Users;

import java.util.List;
import java.util.Map;

public interface UsersDao {

    /**
     * 根据ID查询用户信息
     * @param uid
     * @return
     */
    Users getUserById(int uid);

    /**
     *根据ID查询用户信息
     * @return
     */
    Map<String,Object> getUserById2(int uid);

    /**
     * 查询所有用户
     * @return
     */
    List<Users> listUser();

    /**
     * 查询所有用户，返回list<Map<String,Object>>
     * @return
     */
    List<Map<String,Object>> listUser2();
}
