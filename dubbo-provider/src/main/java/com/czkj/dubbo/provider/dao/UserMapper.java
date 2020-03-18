package com.czkj.dubbo.provider.dao;

import com.czkj.dubbo.api.entity.User;

public interface UserMapper {

    User selectByPrimaryKey(Integer id);
}