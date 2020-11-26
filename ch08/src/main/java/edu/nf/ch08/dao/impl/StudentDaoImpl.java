package edu.nf.ch08.dao.impl;

import edu.nf.ch08.dao.StuDao;
import edu.nf.ch08.entity.Student;
import edu.nf.ch08.util.MyUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * @author 0.0
 */
public class StudentDaoImpl implements StuDao {

    @Override
    public Student getStudentById(int id) {
        try(SqlSession sqlSession = MyUtil.getSqlSession(true)){
            return sqlSession.getMapper(StuDao.class).getStudentById(id);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Student getStudentById2(int id) {
        try(SqlSession sqlSession = MyUtil.getSqlSession(true)){
            return sqlSession.getMapper(StuDao.class).getStudentById2(id);
        } catch (Exception e) {
            throw e;
        }
    }
}
