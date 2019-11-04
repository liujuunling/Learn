package com.redis.demo.dao;

import com.redis.demo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface UserDao {

    @Select("select * from user")
    List<User> queryAll();

    @Select("select * from user where uid = #{id}")
    User findUserById(int id);

    @Update("UPDATE user SET username = #{user.userName},password = #{user.passWord},salary = #{user.salary} where uid = #{user.uid}")
    int updateUser(@Param("user")User user);

    @Delete("delete from user where uid = #{id}")
    int deleteUserById(int id);

}
