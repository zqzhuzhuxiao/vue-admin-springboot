package com.qf.service;

import com.qf.Response.ResponseUser;
import com.qf.domain.User;

import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 张小米
 * \* Date: 2019/9/25
 * \* Time: 10:58
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public interface UserService {

    ResponseUser findAll(Integer page, Integer size);

    User addUser(User user);

    String delete(User user);

    User selectById(User user);

    User updateuser(User user);
}