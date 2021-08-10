package demo.mapper;

import demo.entity.Student;

/**
 * @author admin
 * @Title: StudentMapper
 * @ProjectName spring
 * @Description: TODO
 * @date 2021/6/1018:49
 */
public interface StudentMapper {
    Student select(int id);
}
