package edu.nf.ch05.Test.ch03.dao.impl;

import edu.nf.ch05.Test.ch03.dao.UsersDao;
import edu.nf.ch05.Test.ch03.entity.Users;
import edu.nf.ch05.Test.ch03.util.MyBataisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

public class UserDaoImpl implements UsersDao {
    @Override
    public Users getUserById(int uid) {
        try(SqlSession sqlSession = MyBataisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UsersDao.class).getUserById(uid);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public Map<String, Object> getUserById2(int uid) {
        try(SqlSession sqlSession = MyBataisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UsersDao.class).getUserById2(uid);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public List<Users> listUser() {
        try(SqlSession sqlSession = MyBataisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UsersDao.class).listUser();
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public List<Map<String, Object>> listUser2() {
        try(SqlSession sqlSession = MyBataisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UsersDao.class).listUser2();
        }catch (RuntimeException e){
            throw e;
        }
    }
}
