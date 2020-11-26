package edu.nf.ch05.Test.ch01.dao.impl;

import edu.nf.ch05.Test.ch01.dao.UsersDao;
import edu.nf.ch05.Test.ch01.entity.Users;
import edu.nf.ch05.Test.ch01.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.Map;

/**
 * @author 0.0
 */
public class UserDaoImpl implements UsersDao {

    @Override
    public void save(Users user) {
        //获取SqlSession对象，并设置true，表示自动提交事务
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            //手动
            //sqlSession.commit();
            //通过getMapper方法返回一个UsersDao的代理实现类
            UsersDao usersDao = sqlSession.getMapper(UsersDao.class);
            //调用代理对象的save方法进行保存
            usersDao.save(user);
        }catch(RuntimeException e){
            throw  e;
        }
    }

    @Override
    public void save2(Map<String, Object> map) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            UsersDao usersDao = sqlSession.getMapper(UsersDao.class);
            usersDao.save2(map);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public void update(Users user) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            UsersDao usersDao = sqlSession.getMapper(UsersDao.class);
            usersDao.update(user);
        }catch (RuntimeException e){
            throw  e;
        }
    }

    @Override
    public void delete(int uid) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            UsersDao usersDao = sqlSession.getMapper(UsersDao.class);
            usersDao.delete(uid);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public void update2(String userName, int uid) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            UsersDao usersDao = sqlSession.getMapper(UsersDao.class);
            usersDao.update2(userName,uid);
        }catch (RuntimeException e){
            throw e;
        }
    }

}
