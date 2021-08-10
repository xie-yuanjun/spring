package com.xiaoxie.aop;

import org.springframework.stereotype.Component;

/**
 * @author admin
 * @Title: QieMian
 * @ProjectName spring
 * @Description: 切面
 * @date 2020/4/1518:50
 */
//@Component("aspect")
public class QieMian {

    /**
     * 前置通知
     */
    public void before(){
        System.out.println("执行了前置通知！");
    }

    /**
     * 后置通知
     */
    public void afterReturning(){
        System.out.println("执行了后置通知！");
    }

    /**
     * 异常通知
     */
    public void afterThrowing(){
        System.out.println("执行了异常通知！");
    }

    /**
     * 最终通知
     */
    public void after(){
        System.out.println("执行了最终通知！");
    }
}
