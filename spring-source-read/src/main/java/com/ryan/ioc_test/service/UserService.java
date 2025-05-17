package com.ryan.ioc_test.service;

import com.ryan.ioc_test.mapper.UserMapper;
import lombok.Data;

import javax.annotation.PostConstruct;

/**
 * @author Ryan Yuan
 * 2024-09-10 18:00
 **/
@Data
public class UserService {

    private UserMapper mapper;

    @PostConstruct
    public void init(){
        System.out.println("UserService init");
    }

    public void printName(String id){

        System.out.println(mapper.queryUserName(id));
    }

}
