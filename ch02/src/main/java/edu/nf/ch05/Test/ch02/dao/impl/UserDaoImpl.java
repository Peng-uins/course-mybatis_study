package edu.nf.ch05.Test.ch02.dao.impl;

import edu.nf.ch05.Test.ch02.dao.UserDao;
import edu.nf.ch05.Test.ch02.entity.Users;
import edu.nf.ch05.Test.ch02.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * @author 0.0
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void save(Users users) {
        //SqlSession访问数据库的
        try(SqlSession sqlSession  = MybatisUtils.getSqlSession(true)){
            sqlSession.getMapper(UserDao.class).save(users);
        }catch (RuntimeException e){
            throw e;
        }

    }
}
