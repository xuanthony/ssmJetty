package com.sky.controller;

import com.sky.pojo.User;
import com.sky.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @（#）:UserController
 * @description:
 * @author: xuxb 16/8/2
 * @version: Version 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findUser")
    public ModelAndView findUser()throws Exception{
        ModelAndView modelAndView = new ModelAndView();

        //调用service方法得到用户列表
        List<User> users = userService.getUser();
        //将得到的用户列表内容添加到ModelAndView中
        modelAndView.addObject("users",users);
        //设置响应的jsp视图
        modelAndView.setViewName("getUser");

        return modelAndView;
    }
}
