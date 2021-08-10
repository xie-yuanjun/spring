package com.xiaoxie.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author admin
 * @Title: demo
 * @ProjectName spring
 * @Description: TODO
 * @date 2021/1/2912:23
 */
public class demo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-bean.xml");
        StudentService studentService = (StudentService) context.getBean(StudentService.class);
        studentService.print();
    }
}
