package com.sky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @（#）:BlogController
 * @description:
 * @author: xuxb 16/8/2
 * @version: Version 1.0
 */
@Controller
public class BlogController {

    /**
     * @return 处理完该请求后返回的页面，此请求返回 index.jsp页面
     * @RequestMapping()注解：用于定义一个请求映射，value为请求的url，值为 / 说明，该请求首页请求，method用以指定该请求类型，一般为get和post；
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        System.out.println("it's here");
        return "index";
    }

}
