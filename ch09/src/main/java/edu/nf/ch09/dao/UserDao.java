package edu.nf.ch09.dao;

import edu.nf.ch09.entity.Users;
import org.apache.ibatis.annotations.*;

/**
 * @author 0.0
 */
public interface UserDao {

    /**
     * 使用@Select注解来声明sql
     * 使用sql别名来映射实体的字段
     *
     * @ResultType注解用于将查询结果封装到指定的实体对象中
     *
     * 根据ID查询用户信息
     * @param uid
     * @return
     */
    @Select("select u_id as uid,u_name as userName,age,tel from user_info2 where u_id = #{id}")
    @ResultType(Users.class)
    Users getUserById(int uid);

    /**
     * 使用@Results注解来映射查询结果
     * 并通过@Result注解将实体字段和列名映射起来
     *
     * @param uid
     * @return
     */
    @Select("select u_id,u_name,age,tel from user_info2 where u_id = #{id}")
    @Results({
            @Result(id = true,property = "uid",column = "u_id"),
            @Result(property = "userName",column = "u_name"),
            @Result(property = "age",column = "age"),
            @Result(property = "tel",column = "tel")
    })
    Users getUserById2(int uid);

    /**
     * 使用@Resultmap映射查询结果
     * 可以引用mapper映射配置文件中的resultMap配置
     *
     * @param uid
     * @return
     */
    @Select("select u_id,u_name,age,tel from user_info2 where u_id = #{id}")
    //引用：namespace名称+resultMap的id
    @ResultMap("edu.nf.ch09.dao.UserDao.userMap")
    Users getUserById3(int uid);

    /**
     * 添加用户
     * @param user
     */
    @Insert("insert into user_info2(u_name,age,tel) values(#{userName},#{age},#{tel})")
    void save(Users user);

    /**
     * 修改用户
     * @param users
     */
    @Update("update user_info2 set u_name = #{userName} where u_id = #{uid}")
    void update(Users users);

    /**
     * 删除用户
     * @param uid
     */
    @Delete("delete from user_info2 where u_id = #{uid}")
    void delete(int uid);
}
