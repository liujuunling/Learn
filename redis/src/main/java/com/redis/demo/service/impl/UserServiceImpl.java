package com.redis.demo.service.impl;

import com.redis.demo.dao.UserDao;
import com.redis.demo.entity.User;
import com.redis.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    //将方法的运行结果进行缓存，以后再要相同的数据，可以直接从缓存中获取不需要调用方法
    @Cacheable(value="my-redis-cache1", key="allusers")
    @Override
    public List<User> queryAll() {
        return userDao.queryAll();
    }

    @Cacheable(value="my-redis-cache1", key="'user_'+#id")
    @Override
    public User findUserById(int id) {
        return userDao.findUserById(id);
    }

    @CachePut(value = "my-redis-cache1" ,key="'user_'+#user.uid")
    @Override
    public User updateUser(User user) {
        userDao.updateUser(user);
        return user;
    }

    @CacheEvict(value="my-redis-cache1",key="'user_'+#id")
    @Override
    public int deleteUserById(int id) {
        return userDao.deleteUserById(id);
    }
}
