package com.redis.demo.controller;

import com.redis.demo.entity.User;
import com.redis.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController  {

    @Autowired
    private UserServiceImpl userService;

    @ResponseBody
    @RequestMapping(value = "/findUserById", method = RequestMethod.GET)
    public Map<String ,Object> findUserById(@RequestParam int id){
        User user = userService.findUserById(id);
        Map<String ,Object> result = new HashMap<>();
        result.put("uid",user.getUid());
        result.put("uname",user.getUserName());
        result.put("pass",user.getPassWord());
        result.put("salary",user.getSalary());
        return result;

    }

    @ResponseBody
    @RequestMapping(value = "/deleteUserById", method = RequestMethod.GET)
    public int deleteUserById(@RequestParam int id){
        return userService.deleteUserById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public User updateUser(@RequestBody  User user){
        return userService.updateUser(user);
    }



}
