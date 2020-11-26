package edu.nf.ch05.Test.ch02.dao.impl;

import edu.nf.ch05.Test.ch02.dao.StuDao;
import edu.nf.ch05.Test.ch02.entity.Student;
import edu.nf.ch05.Test.ch02.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * @author 0.0
 */
public class StuDaoImpl implements StuDao {


    @Override
    public void save(Student student) {
        //SqlSession访问数据库的
        try(SqlSession sqlSession  = MybatisUtils.getSqlSession(true)){
            sqlSession.getMapper(StuDao.class).save(student);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public void save2(Student student) {
        //SqlSession访问数据库的
        try(SqlSession sqlSession  = MybatisUtils.getSqlSession(true)){
            sqlSession.getMapper(StuDao.class).save2(student);
        }catch (RuntimeException e){
            throw e;
        }
    }
}
