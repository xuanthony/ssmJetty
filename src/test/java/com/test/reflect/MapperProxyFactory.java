package com.test.reflect;

import java.lang.reflect.Proxy;

/**
 * @（#）:MapperProxyFactory
 * @description:
 * @author: xuxb 16/8/2
 * @version: Version 1.0
 */
public class MapperProxyFactory<T> {

    private final Class<T> mapperInterface;

    public MapperProxyFactory(Class<T> mapperInterface) {
        this.mapperInterface = mapperInterface;
    }

    public Class<T> getMapperInterface() {
        return mapperInterface;
    }

    protected T newInstance(MapperProxy<T> mapperProxy) {
        return (T) Proxy.newProxyInstance(mapperInterface.getClassLoader(),
                new Class[] {mapperInterface}, mapperProxy);
    }
}
