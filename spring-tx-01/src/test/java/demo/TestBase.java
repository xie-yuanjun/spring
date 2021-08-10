package demo;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author admin
 * @Title: TestBase
 * @ProjectName spring
 * @Description: TODO
 * @date 2021/6/1018:12
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-bean.xml"})
public class TestBase {

}
