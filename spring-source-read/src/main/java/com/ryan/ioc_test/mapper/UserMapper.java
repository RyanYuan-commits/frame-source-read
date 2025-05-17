package com.ryan.ioc_test.mapper;

import com.ryan.ioc_test.service.UserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * @author Ryan Yuan
 * 2024-09-10 18:00
 **/
@Data
public class UserMapper {

    private UserService service;

    public String queryUserName(String uId){
        switch (uId) {
            case "10001":
                return "user1";
            case "10002":
                return "user2";
            default:
                return "unknown";
        }
    }

}
