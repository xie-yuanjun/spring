package com.xiaoxie.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author admin
 * @Title: Student
 * @ProjectName spring
 * @Description: 学生实体类
 * @date 2020/3/27 18:43
 */
@NoArgsConstructor
@Component
public class Student {

    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 学习
     */
    public void study(){
        System.out.println("学生正在学习！");
    }
}
