package edu.nf.ch07.Test;

import edu.nf.ch07.dao.UserDao;
import edu.nf.ch07.dao.impl.UserDaoImpl;
import edu.nf.ch07.entity.Users;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UserDaoTest {

    @Test
    public void testAddBath(){
        List<Users> list = new ArrayList<>();
        Users users1 = new Users("user7",55,"12587495412");
        Users users2 = new Users("user8",33,"13955788031");
        list.add(users1);
        list.add(users2);
        UserDao dao = new UserDaoImpl();
        dao.addBatch(list);
    }

    @Test
    public void testdelBath(){
       int[] ids = {7,8};
        UserDao dao = new UserDaoImpl();
        dao.delBatch(ids);
    }
}
