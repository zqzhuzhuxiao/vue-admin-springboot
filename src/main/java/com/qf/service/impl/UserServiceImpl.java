package com.qf.service.impl;

import com.qf.Response.ResponseUser;
import com.qf.dao.UserRestory;
import com.qf.domain.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 张小米
 * \* Date: 2019/9/25
 * \* Time: 11:00
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRestory userRestory;



    @Override
    public ResponseUser findAll(Integer page,Integer size) {

        Pageable pages= PageRequest.of(page-1,size);
        Page<User> all = userRestory.findAll(pages);
        ResponseUser res=new ResponseUser();

        res.setList(all.getContent());
        res.setTotal(all.getTotalElements());


        return res;
    }

    @Override
    public User addUser(User user) {

        return userRestory.save(user);
    }

    @Override
    public String delete(User user) {
        userRestory.deleteById(user.getId());

        return "删除成功";
    }

    @Override
    public User selectById(User user) {
        Optional<User> byId = userRestory.findById(user.getId());

        if (byId.isPresent()){
            User user1 = byId.get();
            return user1;
        }
        return null;
    }

    @Override
    public User updateuser(User user) {

        return userRestory.saveAndFlush(user);
    }
}