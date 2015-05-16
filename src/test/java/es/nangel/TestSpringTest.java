package es.nangel;

import es.nangel.base.TestBase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by nangel on 16/5/15.
 */

public class TestSpringTest extends TestBase {
        @Autowired
        private Greeter greeter;
        @Autowired
        private AnnotationBasedGreeter annotationBasedGreeter;
        @Test
        public void testThings(){
                System.out.println(greeter.sayHello());
            annotationBasedGreeter.sayHello();
        }

}