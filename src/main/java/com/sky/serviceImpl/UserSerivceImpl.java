package com.sky.serviceImpl;

import com.sky.dao.UserMapper;
import com.sky.pojo.User;
import com.sky.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @（#）:UserSerivceImpl
 * @description:
 * @author: xuxb 16/8/2
 * @version: Version 1.0
 */
@Service
public class UserSerivceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    public List<User> getUser() {
        int i = 1;

        return userMapper.selectByExample(null);
    }

    @Override
    public void setUser(User users) {

    }

    @Override
    public User getOneUser() {
        return null;
    }

}
