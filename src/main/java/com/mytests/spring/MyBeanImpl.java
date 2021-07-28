package com.mytests.spring;

import org.springframework.beans.factory.annotation.Autowired;
 // https://youtrack.jetbrains.com/issue/IDEA-150717
public class MyBeanImpl implements MyBean {
    
    @Autowired
    FooBean fooBean;
}