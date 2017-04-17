package com.sky.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sky.common.ResponseResult;
import com.sky.pojo.CustBaseInfo;
import com.sky.pojo.CustBaseInfoExample;
import com.sky.service.UserService;
import com.sky.util.Paginator;

/**
 * @（#）:UserController
 * @description:
 * @author: xuxb 16/8/2
 * @version: Version 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userList")
    @ResponseBody
    public ResponseResult userList(final HttpServletRequest request) throws Exception{
        ResponseResult result = new ResponseResult();

        CustBaseInfoExample example = new CustBaseInfoExample();
        String offIndex = request.getParameter("_offIndex");
        String pageSize = request.getParameter("_pageSize");
        if (StringUtils.isNotEmpty(pageSize) && StringUtils.isNotEmpty(offIndex)) {
            Paginator paginator = new Paginator(Integer.valueOf(offIndex), Integer.valueOf(pageSize));
            example.setPaginator(paginator);
        }

        List<CustBaseInfo> users = userService.selectPaginateCustBaseInfo(example);
        Integer total = userService.countByExample(example);
        result.putData("data", users);
        result.putData("total", total);
        return result;
    }

    //@RequestMapping(value = "/getUser")
    //public ModelAndView getUser(final HttpServletRequest request)throws Exception{
    //    ModelAndView modelAndView = new ModelAndView();
    //    //调用service方法得到用户列表
    //    List<User> users = userService.getUser();
    //    //将得到的用户列表内容添加到ModelAndView中
    //    modelAndView.addObject("users",users);
    //    //设置响应的jsp视图
    //    modelAndView.setViewName("getUser");
    //
    //    return modelAndView;
    //}
}
