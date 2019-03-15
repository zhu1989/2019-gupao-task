package com.gpedu.zhuyj.designpattern.dynamicproxy.myproxy;

import java.lang.reflect.Method;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/15 11:14
 * @Description:
 * @Version 1.0
 */
public interface MyInvocationHandler {

    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}