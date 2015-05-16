package es.nangel.base;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by nangel on 16/5/15.
 */
@Configuration
@ImportResource({"classpath:applicationContext.xml","classpath:applicationContextTest.xml"})
public class TestConfig {
}
