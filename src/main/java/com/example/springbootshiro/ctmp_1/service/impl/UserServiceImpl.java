package com.example.springbootshiro.ctmp_1.service.impl;

import com.example.springbootshiro.ctmp_1.mapper.UserMapper;
import com.example.springbootshiro.ctmp_1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserMapper userMapper;
    @Override
    public int findUser(String username, String password) {
       int flag =  userMapper.findUser(username,password);
        return flag;
    }
}
