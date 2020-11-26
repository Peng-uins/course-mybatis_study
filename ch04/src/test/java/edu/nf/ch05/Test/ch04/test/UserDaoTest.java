package edu.nf.ch05.Test.ch04.test;

import edu.nf.ch05.Test.ch04.dao.UserDao;
import edu.nf.ch05.Test.ch04.dao.impl.UserDaoimpl;
import edu.nf.ch05.Test.ch04.entity.Users;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void getUserById(){
        UserDao dao = new UserDaoimpl();
        Users users = dao.getUserById(2);
        System.out.println(users.getUserName());
    }

    @Test
    public void listUser(){
        UserDao dao = new UserDaoimpl();
        List<Users> list = dao.listUser();
        list.forEach(u -> System.out.println(u.getUid()+":"+u.getUserName()));
    }
}
