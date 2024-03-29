package com.jerrmy.studymybatis.service;


import com.jerrmy.studymybatis.entity.User;
import com.jerrmy.studymybatis.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * DateTime : 2019/6/26  10:52
 * Author: Jermmy.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    @Override
    public List<User> getUserById(String id) {
        return userMapper.getUserById(id);
    }

    @Override
    public List<User> getUserByName(String name) {
        return userMapper.getUserByName(name);
    }

    @Override
    public List<User> getUserByPhone(String phone) {
        return userMapper.getUserByPhone(phone);
    }

    @Override
    public int create(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public void deleteUser(Long id) {
        userMapper.deleteUser(id);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public void getUserCount(Map map) {
         userMapper.getUserCount(map);
    }
}
