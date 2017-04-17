package com.sky.service;

import java.util.List;

import com.sky.pojo.CustBaseInfo;
import com.sky.pojo.CustBaseInfoExample;
import com.sky.pojo.User;

/**
 * @（#）:UserService
 * @description:
 * @author: xuxb 16/8/2
 * @version: Version 1.0
 */
public interface UserService {

    List<User> getUser();

    List<CustBaseInfo> selectPaginateCustBaseInfo(CustBaseInfoExample example);

    Integer countByExample(CustBaseInfoExample example);
}
