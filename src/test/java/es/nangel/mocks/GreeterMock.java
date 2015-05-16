package es.nangel.mocks;

import es.nangel.Greeter;

/**
 * Created by nangel on 16/5/15.
 */
public class GreeterMock extends Greeter {
    @Override
    public String sayHello() {
        return "Hello from test!";
    }
}
