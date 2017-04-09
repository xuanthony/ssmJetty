package com.sky.controller;

import com.sky.pojo.User;
import com.sky.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @（#）:UserController
 * @description:
 * @author: xuxb 16/8/2
 * @version: Version 1.0
 */
@Controller
@RequestMapping("/users")
public class UserController {

    //添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userList")
    public ModelAndView userList(final HttpServletRequest request)throws Exception{
        String page = request.getParameter("page");
        String limit = request.getParameter("limit");
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
