package com.ryan.aop_test.bean.impl;

import com.ryan.aop_test.bean.IUserService;
import com.ryan.aop_test.bean.UserMapper;
import lombok.Data;

/**
 * @author Ryan Yuan
 * 2024-11-13 15:20
 **/
@Data
public class UserService implements IUserService {

    private UserMapper mapper;

    @Override
    public void queryUserName(String uId) {
        System.out.println("查询用户名称为：ryan");
    }

    @Override
    public void queryUserId(String name) {
        System.out.println("查询用户ID为：10001");
    }

}
