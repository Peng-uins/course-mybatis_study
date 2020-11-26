package edu.nf.ch05.Test.ch04.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Myutil {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try{
            InputStream is = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            sqlSessionFactory = builder.build(is);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession(boolean a){
        return sqlSessionFactory.openSession(a);
    }
}
