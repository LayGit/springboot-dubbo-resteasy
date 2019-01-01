package com.laylib.sdr.service.demo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.laylib.sdr.define.service.UserService;
import com.laylib.sdr.entity.User;

/**
 * User Service impl
 *
 * @author Lay
 * @date 2019/01/02
 */
@Service(version = "0.0.1",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}")
public class UserServiceImpl implements UserService {
    @Override
    public User getUserById(long userId) {
        User user = fetchUser();
        if (user.getId() == userId) {
            return user;
        }
        return null;
    }

    @Override
    public User getUserByAccount(String account) {
        User user = fetchUser();
        if (user.getAccount().equals(account)) {
            return user;
        }
        return null;
    }

    private User fetchUser() {
        User user = new User();
        user.setId(10000L);
        user.setName("admin");
        user.setAccount("admin");
        user.setPassword("123456");
        return user;
    }
}
