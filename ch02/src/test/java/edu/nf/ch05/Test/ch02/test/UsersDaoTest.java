package edu.nf.ch05.Test.ch02.test;

import edu.nf.ch05.Test.ch02.dao.UserDao;
import edu.nf.ch05.Test.ch02.dao.impl.UserDaoImpl;
import edu.nf.ch05.Test.ch02.entity.Users;
import org.junit.Test;

public class UsersDaoTest {

    @Test
    public void testSave(){
        Users users = new Users();
        users.setUserName("lisi");
        UserDao dao = new UserDaoImpl();
        dao.save(users);
        System.out.println(users.getUid());
    }
}
