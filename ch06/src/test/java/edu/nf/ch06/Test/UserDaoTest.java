package edu.nf.ch06.Test;

import edu.nf.ch06.dao.UserDao;
import edu.nf.ch06.dao.impl.UserDaoimpl;
import edu.nf.ch06.entity.Users;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void testlistUser(){
        //创建Users实例，封装页面提交的参数
        Users users = new Users();
        users.setUserName("user1");
        users.setAge(21);
        UserDao dao = new UserDaoimpl();
        List<Users> list = dao.listUser(users);
        list.forEach(u -> System.out.println(u.getUserName()));
    }

    @Test
    public void testlistUser2(){
        //创建Users实例，封装页面提交的参数
        Users users = new Users();
        users.setUserName("user1");
        users.setAge(21);
        UserDao dao = new UserDaoimpl();
        List<Users> list = dao.listUser2(users);
        list.forEach(u -> System.out.println(u.getUserName()));
    }

    @Test
    public void testlistUser3(){
        Integer[] uids = new Integer[]{1,2,3,4,5,6};
        UserDao dao = new UserDaoimpl();
        List<Users> list = dao.listUser3(uids);
        list.forEach(u -> System.out.println(u.getUserName()));
    }

    @Test
    public void testUpdate(){
       Users users = new Users();
       users.setUid(1);
       users.setAge(10);
       users.setTel("10000000000");
       UserDao dao = new UserDaoimpl();
       dao.update(users);

    }
}
