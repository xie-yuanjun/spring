package demo.mapper;

import demo.TestBase;
import demo.entity.Student;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author admin
 * @Title: StudentMapperTest
 * @ProjectName spring
 * @Description: TODO
 * @date 2021/6/1019:01
 */
public class StudentMapperTest extends TestBase {
    @Autowired
    private StudentMapper studentMapper;

    @Test
    public void selectTest(){
        Student student = studentMapper.select(1);
        System.out.println(student);
    }
}
