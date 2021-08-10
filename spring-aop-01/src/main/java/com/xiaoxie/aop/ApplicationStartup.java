package com.xiaoxie.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author admin
 * @Title: ApplicationStartup
 * @ProjectName spring
 * @Description: TODO
 * @date 2021/7/40:16
 */
public class ApplicationStartup {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-beans.xml");

    }
}
