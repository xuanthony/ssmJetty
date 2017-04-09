package com.test.reflect;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @（#）:TestProxy
 * @description:
 * @author: xuxb 16/8/2
 * @version: Version 1.0
 */
public class TestProxy {
    public static void main(String[] args) {
        System.out.println(Fruit.APPLE.toString());
        Map<String, Object> map = Maps.newHashMap();
//        UserService userService = (UserService) MapperProxy.newInstance(new Class[] {UserService.class});
//
//        User user = new User();
//        user.setFirstName("xu");
//        userService.setUser(user);
//
//        User user1 = userService.getOneUser();
//        System.out.println(user1.getFirstName());

//        MapperProxy<UserService> mapperProxy = null;
//        UserService userService1 = MapperProxyFactory.class.newInstance(new MapperProxy<UserService>());
    }
}
