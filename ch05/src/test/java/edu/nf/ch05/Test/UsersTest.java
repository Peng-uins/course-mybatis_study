package edu.nf.ch05.Test;

import edu.nf.ch05.dao.UserDao;
import edu.nf.ch05.dao.impl.UsersDaoImpl;
import org.junit.Test;

public class UsersTest {

    @Test
    public void testCount(){
        UserDao dao = new UsersDaoImpl();
        System.out.println(dao.count());
    }

    @Test
    public void testLike(){
        UserDao dao = new UsersDaoImpl();
        System.out.println(dao.like("us"));
    }
}
