package com.czkj.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.czkj.dubbo.api.service.UserService;
import com.czkj.dubbo.api.entity.User;
import com.czkj.dubbo.provider.dao.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author steven.sheng
 * @Date 2020/3/17/01715:15
 */
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    /**
     * 获取用户
     *
     * @param id
     * @return
     */
    @Override
    public User getUserById(Integer id) {
        User user = userMapper.selectByPrimaryKey(id);
        log.info("request : {} ,result :{}",id,user);
        return user;
    }
}
