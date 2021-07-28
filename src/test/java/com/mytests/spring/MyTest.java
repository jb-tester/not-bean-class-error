package com.mytests.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * *
 * <p>Created by irina on 28.07.2021.</p>
 * <p>Project: not-bean-class-error</p>
 * https://youtrack.jetbrains.com/issue/IDEA-274668
 * *
 */
@RunWith(SpringRunner.class)
//@SpringJUnitConfig
public class MyTest {
    @Configuration
	static class Config {
        @Bean
        public FooBean foo() {
            return new FooBean();
        }
	}
    // This one is reported by the inspection
    @Autowired
    FooBean foo;

    @Test
    public void fooTest() {
        Assert.assertNotNull(foo);
    }
}
