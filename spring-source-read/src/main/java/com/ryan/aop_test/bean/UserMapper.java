package com.ryan.aop_test.bean;

import com.ryan.ioc_test.service.UserService;
import lombok.Data;

/**
 * @author Ryan Yuan
 * 2024-11-16 10:39
 **/
@Data
public class UserMapper {

    private IUserService service;

    public void query() {
        System.out.println("query");
    }
}