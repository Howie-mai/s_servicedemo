package com.zhku.mh.servicedemo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhku.mh.servicedemo.dao.UserMapper;
import com.zhku.mh.servicedemo.entities.User;
import com.zhku.mh.servicedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Service
public class UserImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User get(Integer id) {
        return userMapper.getUser(id);
    }
}
