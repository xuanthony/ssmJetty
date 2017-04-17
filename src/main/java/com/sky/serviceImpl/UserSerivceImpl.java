package com.sky.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sky.dao.CustBaseInfoMapper;
import com.sky.dao.UserMapper;
import com.sky.pojo.CustBaseInfo;
import com.sky.pojo.CustBaseInfoExample;
import com.sky.pojo.User;
import com.sky.service.UserService;

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
    @Autowired
    private CustBaseInfoMapper custBaseInfoMapper;

    @Override
    public List<User> getUser() {
        return userMapper.selectByExample(null);
    }

    @Override
    public List<CustBaseInfo> selectPaginateCustBaseInfo(CustBaseInfoExample example) {
        return custBaseInfoMapper.selectPaginateCustBaseInfo(example);
    }

    @Override
    public Integer countByExample(CustBaseInfoExample example) {
        return custBaseInfoMapper.countByExample(example);
    }

}
