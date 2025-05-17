package com.ryan.ioc_test;

import com.ryan.ioc_test.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ryan Yuan
 * 2024-09-10 18:01
 **/
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService service = applicationContext.getBean("userService", UserService.class);
        service.printName("10001");
    }

}