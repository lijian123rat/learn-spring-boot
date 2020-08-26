package com.xdpg.service.impl;

import com.xdpg.mapper.UserMapper;
import com.xdpg.pojo.User;
import com.xdpg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public User getUserByUserName(String userName) {
        return userMapper.getUserByUserName(userName);
    }

    @Override
    public int SaveUser(User user) {
        return userMapper.SaveUser(user);
    }

    @Override
    public int UpdateUser(User user) {
        return userMapper.UpdateUser(user);
    }

    @Override
    public int delUser(int id) {
        return userMapper.delUser(id);
    }
}
