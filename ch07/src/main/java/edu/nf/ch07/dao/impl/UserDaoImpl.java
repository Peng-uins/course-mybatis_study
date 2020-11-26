package edu.nf.ch07.dao.impl;

import edu.nf.ch07.dao.UserDao;
import edu.nf.ch07.entity.Users;
import edu.nf.ch07.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author 0.0
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void addBatch(List<Users> user) {
        try(SqlSession sqlSession = MybatisUtil.getSqlSession(true)){
            sqlSession.getMapper(UserDao.class).addBatch(user);
        }catch(RuntimeException e){
            throw e;
        }
    }

    @Override
    public void delBatch(int[] ids) {
        try(SqlSession sqlSession = MybatisUtil.getSqlSession(true)){
            sqlSession.getMapper(UserDao.class).delBatch(ids);
        }catch(RuntimeException e){
            throw e;
        }
    }
}
