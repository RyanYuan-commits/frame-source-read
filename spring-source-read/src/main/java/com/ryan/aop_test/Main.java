package com.ryan.aop_test;

import com.ryan.aop_test.bean.IUserService;
import com.ryan.aop_test.bean.UserMapper;
import org.springframework.beans.factory.Aware;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author Ryan Yuan
 * 2024-11-13 09:45
 **/
@Component
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aop.xml");
        IUserService service = applicationContext.getBean("userService", IUserService.class);
        System.out.println(service.getClass());
        service.queryUserName("10001");

        System.out.println("======");

        UserMapper userMapper = applicationContext.getBean("userMapper", UserMapper.class);
        System.out.println(userMapper.getClass());
        userMapper.query();
    }

}
