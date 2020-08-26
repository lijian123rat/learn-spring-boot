package com.xdpg;

import com.xdpg.mapper.UserMapper;
import com.xdpg.pojo.User;
import com.xdpg.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XdpgApplicationTests {
    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        User u = new User();
        u.setId(4);
        u.setUserName("sddddd");
        u.setPassWord("23d4");
        userService.delUser(5);

    }

}
