package com.xdpg.mapper;
import com.xdpg.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    //获取所有信息
    List<User> getUserList();

    User getUserByUserName(String userName);

    int SaveUser(User user);

    int UpdateUser(User user);

    int delUser(int id);
}
