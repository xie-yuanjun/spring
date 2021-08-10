package demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author admin
 * @Title: Student
 * @ProjectName spring
 * @Description: TODO
 * @date 2021/6/1018:47
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int id;
    private String name;
    private Date age;
    private int sex;
}
