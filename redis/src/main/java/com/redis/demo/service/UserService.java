package com.redis.demo.service;

import com.redis.demo.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {


    List<User> queryAll();
    User findUserById(int id);
    User updateUser(@Param("user") User user);
    int deleteUserById(int id);


}
