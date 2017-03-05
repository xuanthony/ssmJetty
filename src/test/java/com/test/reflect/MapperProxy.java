package com.test.reflect;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * @（#）:MapperProxy
 * @description:
 * @author: xuxb 16/8/2
 * @version: Version 1.0
 */
public class MapperProxy<T> implements InvocationHandler, Serializable {

    private Map<Object, Object> map = null;

    public static Object newInstance(Class[] interfaces) {
        return Proxy.newProxyInstance(MapperProxy.class.getClassLoader(),
                interfaces, new MapperProxy());
    }

    private MapperProxy() {
        map = new HashMap<Object, Object>();
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        String methodName = method.getName();
        if (methodName.startsWith("get")) {
            return map.get("user");
        } else if (methodName.startsWith("set")) {
            map.put("user", args[0]);
        }

        return null;
    }

}
