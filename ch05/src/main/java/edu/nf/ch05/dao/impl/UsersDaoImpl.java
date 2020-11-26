package edu.nf.ch05.dao.impl;

import edu.nf.ch05.dao.UserDao;
import edu.nf.ch05.entity.Users;
import edu.nf.ch05.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author 0.0
 */
public class UsersDaoImpl implements UserDao {

    @Override
    public int count() {
        try(SqlSession sqlSession = MybatisUtil.getSqlSession(true)){
           return sqlSession.getMapper(UserDao.class).count();
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public List<Users> like(String likename) {
        try(SqlSession sqlSession = MybatisUtil.getSqlSession(true)){
           return sqlSession.getMapper(UserDao.class).like(likename);
        }catch (RuntimeException e){
            throw e;
        }
    }
}
