package com.xiaoxie.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author admin
 * @Title: StudentServiceTest
 * @ProjectName spring
 * @Description: TODO
 * @date 2020/4/1519:01
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-bean.xml")
public class StudentServiceTest {
    @Autowired
    private StudentService service;

    @Test
    public void print(){
        service.print();
    }
}
