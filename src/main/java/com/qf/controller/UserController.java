package com.qf.controller;

import com.qf.Response.ResponseUser;
import com.qf.domain.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Id;
import java.util.List;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 张小米
 * \* Date: 2019/9/25
 * \* Time: 11:01
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/findAll/{page}/{size}")
    public ResponseUser findAll(@PathVariable("page")Integer page, @PathVariable("size")Integer size){
        return userService.findAll(page,size);
    }

    @RequestMapping("/addUser")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(@RequestBody User user){

        return userService.delete(user);
    }

    @RequestMapping("/selectById")
    public User selectById(@RequestBody User user){
        return userService.selectById(user);
    }

    @RequestMapping("/updateuser")
    public User updateuser(@RequestBody User user){

        return userService.updateuser(user);
    }





}