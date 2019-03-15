package com.gpedu.zhuyj.designpattern.dynamicproxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/15 10:15
 * @Description:
 * @Version 1.0
 */
public class CglibMeipo implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) {
        //相当于Proxy，代理的工具类
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object obj = methodProxy.invokeSuper(o,objects);
        after();
        return obj;
    }

    public void before(){
        System.out.println("获取相亲对象要求");
        System.out.println("开始物色合适对象");
    }

    public void after(){
        System.out.println("双方如果觉得合适，就开始交往吧");
    }
}
