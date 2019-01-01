package com.laylib.sdr.define.service;

import com.laylib.sdr.entity.User;

/**
 * User Service
 *
 * @author Lay
 * @date 2019/01/02
 */
public interface UserService {

    /**
     * get user by ID
     * @param userId
     * @return
     */
    User getUserById(long userId);

    /**
     * get user by account
     * @param account
     * @return
     */
    User getUserByAccount(String account);
}
