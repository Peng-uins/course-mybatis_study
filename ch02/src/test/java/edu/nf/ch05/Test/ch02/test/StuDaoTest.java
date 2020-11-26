package edu.nf.ch05.Test.ch02.test;

import edu.nf.ch05.Test.ch02.dao.StuDao;
import edu.nf.ch05.Test.ch02.dao.impl.StuDaoImpl;
import edu.nf.ch05.Test.ch02.entity.Student;
import edu.nf.ch05.Test.ch02.util.UUIDUtils;
import org.junit.Test;

public class StuDaoTest {

    @Test
    public void testSave(){
        Student s = new Student();
        s.setStuName("User2");
        StuDao stuDao = new StuDaoImpl();
        stuDao.save(s);
        System.out.println(s.getStuId()+s.getStuName());
    }

    @Test
    public void testSave2(){
        Student s = new Student();
        //在程序中生成uuid
        s.setStuId(UUIDUtils.createUUID());
        s.setStuName("User3");
        StuDao stuDao = new StuDaoImpl();
        stuDao.save2(s);
        System.out.println(s.getStuId()+s.getStuName());
    }
}
