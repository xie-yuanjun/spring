package com.xiaoxie.entity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author admin
 * @Title: StudentBeanTest
 * @ProjectName spring
 * @Description: TODO
 * @date 2020/3/2718:57
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-bean.xml")
public class StudentBeanTest {
    @Autowired
    private Student student;

    @Test
    public void test(){
        student.study();
        System.out.println(student);
    }
}
