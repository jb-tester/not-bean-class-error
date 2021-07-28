package com.mytests.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
 public class MyBeanConfig {
    @Bean
    public MyBean myBean() {
        return new MyBeanImpl();
        
}

    @Bean
    public FooBean fooBean() {
        return new FooBean();
    }
}