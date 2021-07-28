package com.mytests.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class MyBeanImpl implements MyBean {
    
    @Autowired
    FooBean fooBean;
}