package com.xdpg.service;

import com.xdpg.pojo.User;

import java.util.List;

public interface UserService {

    //获取所有信息
    List<User> getUserList();

    User getUserByUserName(String userName);

    int SaveUser(User user);

    int UpdateUser(User user);

    int delUser(int id);
}
