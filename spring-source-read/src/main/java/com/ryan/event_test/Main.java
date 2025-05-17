package com.ryan.event_test;

import com.ryan.ioc_test.mapper.UserMapper;
import com.ryan.ioc_test.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ryan Yuan
 * 2024-11-12 17:12
 **/
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        applicationContext.publishEvent(new CustomEvent(applicationContext, 1L, "Hello World"));
    }

}
