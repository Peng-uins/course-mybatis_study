package edu.nf.ch05.Test.ch04.dao.impl;

import edu.nf.ch05.Test.ch04.dao.UserDao;
import edu.nf.ch05.Test.ch04.entity.Users;
import edu.nf.ch05.Test.ch04.util.Myutil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDaoimpl implements UserDao {

    @Override
    public Users getUserById(int id) {
        try(SqlSession sqlSession = Myutil.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).getUserById(id);
        }catch (RuntimeException e){
            throw  e;
        }
    }

    @Override
    public List<Users> listUser() {
        try(SqlSession sqlSession = Myutil.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).listUser();
        }catch (RuntimeException e){
            throw  e;
        }
    }
}
