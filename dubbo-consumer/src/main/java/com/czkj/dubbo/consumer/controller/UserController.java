package com.czkj.dubbo.consumer.controller;

import com.czkj.dubbo.api.entity.User;
import com.czkj.dubbo.api.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author steven.sheng
 * @Date 2020/3/17/01715:22
 */
@RestController
@Slf4j
public class UserController {

    @Autowired(required = false)
    private UserService userService;

    @GetMapping("user/{id}")
    public User getUser(@PathVariable("id")Integer id){
        User user = userService.getUserById(id);
        log.info("get user by ID:{} result:{}",id,user);
        return user;
    }

    @GetMapping("/")
    public User getUser1() throws Exception {
        User user = userService.getUserById(3);
        log.info("get user by ID:{} result:{}",3,user);
        return user;
    }
}
