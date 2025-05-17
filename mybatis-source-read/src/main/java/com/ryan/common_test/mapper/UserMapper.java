package com.ryan.common_test.mapper;

import com.ryan.common_test.po.User;

import java.util.List;

/**
 * @author Ryan Yuan
 * 2025-05-17 12:38
 **/
public interface UserMapper {

    User selectUserById(int id);

    List<User> selectAllUsers();

    int insertUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

}
