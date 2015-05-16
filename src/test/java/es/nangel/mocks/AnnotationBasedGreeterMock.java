package es.nangel.mocks;

import es.nangel.AnnotationBasedGreeterImpl;
import org.springframework.stereotype.Component;

/**
 * Created by nangel on 16/5/15.
 */
public class AnnotationBasedGreeterMock extends AnnotationBasedGreeterImpl {
    public void sayHello(){
        System.out.println("Annotation Hello from test!");
    }
}
