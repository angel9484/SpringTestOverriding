package es.nangel.base;

import es.nangel.mocks.AnnotationBasedGreeterMock;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by nangel on 16/5/15.
 */
/*
@ContextConfiguration
    (
        locations =
                    {       "classpath:applicationContext.xml",
                        "classpath:applicationContextTest.xml"
                    }
    )
    */
@RunWith(SpringJUnit4ClassRunner.class)
//http://stackoverflow.com/questions/4943475/can-spring-framework-override-annotation-based-configuration-with-xml-based-conf
@ContextConfiguration(
        classes = {
                TestConfig.class,
                AnnotationBasedGreeterMock.class

        })
public class TestBase {
}
