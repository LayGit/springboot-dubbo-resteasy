package com.laylib.sdr.api.demo.api;

import com.laylib.sdr.model.Result;

/**
 * User Api
 *
 * @author Lay
 * @date 2019/01/02
 */
public interface UserApi {
    /**
     * User Login
     * @param account
     * @param password
     * @return
     */
    Result login(String account, String password);

    /**
     * Get User
     * @param id
     * @return
     */
    Result getUser(long id);
}
