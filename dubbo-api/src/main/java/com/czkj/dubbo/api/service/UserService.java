package com.czkj.dubbo.api.service;

import com.czkj.dubbo.api.entity.User;

/**
 * @Author steven.sheng
 * @Date 2020/3/17/01715:11
 */
public interface UserService {

    /**
     * 获取用户
     * @param id
     * @return
     */
    User getUserById(Integer id);
}
