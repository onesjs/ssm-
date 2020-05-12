package dpdd.test;

import dpdd.entity.Student;
import dpdd.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sjs
 * @date 2020/5/11 15:25
 */
public class testSpring {
    @Test
    public void test(){
        ApplicationContext config = new ClassPathXmlApplicationContext("applicationContext.xml");
         StudentServiceImpl studentService = (StudentServiceImpl)config.getBean("studentServiceImpl");
         studentService.findAll();
    }
}
