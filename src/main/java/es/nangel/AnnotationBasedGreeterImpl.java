package es.nangel;

import org.springframework.stereotype.Component;

/**
 * Created by nangel on 16/5/15.
 */
@Component
public class AnnotationBasedGreeterImpl implements AnnotationBasedGreeter {
    public void sayHello() {
        System.out.println("Annotation Hello!");
    }
}
