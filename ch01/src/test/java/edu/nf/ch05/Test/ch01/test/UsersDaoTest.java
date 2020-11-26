package edu.nf.ch05.Test.ch01.test;

import edu.nf.ch05.Test.ch01.dao.UsersDao;
import edu.nf.ch05.Test.ch01.dao.impl.UserDaoImpl;
import edu.nf.ch05.Test.ch01.entity.Users;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class UsersDaoTest {

    @Test
    public void testSave(){
        Users users = new Users();
        users.setUserName("user1");
        UsersDao dao = new UserDaoImpl();
        dao.save(users);
    }

    @Test
    public void testSave2(){
        Map<String,Object> map = new HashMap<>();
        //key对应映射配置文件中的#{uname}
        map.put("uname","zhangsang");
        UsersDao dao = new UserDaoImpl();
        dao.save2(map);
    }

    @Test
    public void testUpdate(){
        Users users = new Users();
        users.setUid(1);
        users.setUserName("quan1");
        UsersDao dao = new UserDaoImpl();
        dao.update(users);
    }

    @Test
    public void testUpdate2(){
        Users users = new Users();
        users.setUid(2);
        users.setUserName("李四");
        UsersDao dao = new UserDaoImpl();
        dao.update2(users.getUserName(),users.getUid());
    }

    @Test
    public void testDelete(){
        Users users = new Users();
        users.setUid(1);
        UsersDao dao = new UserDaoImpl();
        dao.delete(users.getUid());
    }


}
