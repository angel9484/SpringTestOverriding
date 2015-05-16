package es.nangel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by nangel on 16/5/15.
 */

@Service
@ComponentScan
public class TestSpring {
    @Autowired
    private Greeter greeter;
    @Autowired
    private AnnotationBasedGreeter annotationBasedGreeter;

    public static void main(String[] args) {
        ApplicationContext run = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
        TestSpring testSpring = run.getBean("testSpring", TestSpring.class);

        System.out.println(testSpring.greeter.sayHello());
        testSpring.annotationBasedGreeter.sayHello();
    }
}
