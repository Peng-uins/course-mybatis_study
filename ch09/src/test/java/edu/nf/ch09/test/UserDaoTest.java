package edu.nf.ch09.test;

import edu.nf.ch09.dao.UserDao;
import edu.nf.ch09.dao.impl.UserDaoImpl;
import edu.nf.ch09.entity.Users;
import org.junit.Test;

public class UserDaoTest {

    @Test
    public void testGetUserById(){
        UserDao dao = new UserDaoImpl();
        Users user = dao.getUserById(1);
        System.out.println(user.getUserName());
        System.out.println(user.getAge());
        System.out.println(user.getTel());
    }

    @Test
    public void testGetUserById2(){
        UserDao dao = new UserDaoImpl();
        Users user = dao.getUserById2(1);
        System.out.println(user.getUserName());
        System.out.println(user.getAge());
        System.out.println(user.getTel());
    }

    @Test
    public void testGetUserById3(){
        UserDao dao = new UserDaoImpl();
        Users user = dao.getUserById3(1);
        System.out.println(user.getUserName());
        System.out.println(user.getAge());
        System.out.println(user.getTel());
    }

    @Test
    public void testSave(){
        Users users = new Users();
        users.setUserName("user7");
        users.setAge(21);
        users.setTel("12345678911");
        UserDao dao = new UserDaoImpl();
        dao.save(users);
    }

    @Test
    public void testUpdate(){
        Users users = new Users();
        users.setUid(9);
        users.setUserName("user9");
        UserDao dao = new UserDaoImpl();
        dao.update(users);
    }

    @Test
    public void testDelete(){
        Users users = new Users();
        UserDao dao = new UserDaoImpl();
        dao.delete(9);
    }
}
