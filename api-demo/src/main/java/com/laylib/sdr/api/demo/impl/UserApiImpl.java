package com.laylib.sdr.api.demo.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.laylib.sdr.api.demo.api.UserApi;
import com.laylib.sdr.define.service.UserService;
import com.laylib.sdr.entity.User;
import com.laylib.sdr.model.Result;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;

/**
 * User Api impl
 *
 * @author Lay
 * @date 2019/01/02
 */
@Path("/user")
@Produces(ContentType.APPLICATION_JSON_UTF_8)
@Component
public class UserApiImpl implements UserApi {

    @Reference(version = "0.0.1",
            application = "${dubbo.application.id}")
    private UserService userService;

    @Path("login")
    @POST
    @Override
    public Result login(@FormParam("account") String account,
                        @FormParam("password") String password) {

        User user = userService.getUserByAccount(account);
        if (user != null && user.getPassword().equals(password)) {
            return new Result(user);
        }
        return new Result(401, "login failed");
    }

    @Path("getUser")
    @GET
    @Override
    public Result getUser(@QueryParam("id") long id) {
        User user = userService.getUserById(id);
        if (user != null) {
            return new Result(user);
        }
        return new Result(404, "user not found");
    }
}
