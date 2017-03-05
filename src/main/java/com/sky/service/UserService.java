package com.sky.service;

import com.sky.pojo.User;

import java.util.List;

/**
 * @（#）:UserService
 * @description:
 * @author: xuxb 16/8/2
 * @version: Version 1.0
 */
public interface UserService {

    List<User> getUser();

    void setUser(User users);

    User getOneUser();
}
