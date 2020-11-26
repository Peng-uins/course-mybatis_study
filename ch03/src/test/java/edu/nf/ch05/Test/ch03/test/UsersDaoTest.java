package edu.nf.ch05.Test.ch03.test;

import edu.nf.ch05.Test.ch03.dao.UsersDao;
import edu.nf.ch05.Test.ch03.dao.impl.UserDaoImpl;
import edu.nf.ch05.Test.ch03.entity.Users;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class UsersDaoTest {

    @Test
    public void testGetUserById(){
        UsersDao dao = new UserDaoImpl();
        Users users = dao.getUserById(2);
        System.out.println(users.getUid());
        System.out.println(users.getuName());
    }

    @Test
    public void testGetUserById2(){
        UsersDao dao = new UserDaoImpl();
        Map<String,Object> obj = dao.getUserById2(2);

        for(String stu : obj.keySet()){
            System.out.println(obj.get(stu));
        }
        //输出键值对
        obj.forEach((k,v) -> System.out.println(k+":"+v));
    }

    @Test
    public void testGetlistUser(){
        UsersDao dao = new UserDaoImpl();
        List<Users> list = dao.listUser();
        list.forEach(users -> System.out.println(users.getUid()+":"+users.getuName()));
    }

    @Test
    public void testGetlistUser2(){
        UsersDao dao = new UserDaoImpl();
        List<Map<String,Object>> list = dao.listUser2();
        list.forEach(map -> {
            map.forEach((k,v)-> System.out.println(k+":"+v));
        });
    }
}
