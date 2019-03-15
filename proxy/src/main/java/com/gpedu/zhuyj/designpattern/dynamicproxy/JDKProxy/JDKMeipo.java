package com.gpedu.zhuyj.designpattern.dynamicproxy.JDKProxy;

import com.gpedu.zhuyj.designpattern.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/14 22:36
 * @Description:
 * @Version 1.0
 */
public class JDKMeipo implements InvocationHandler {

    private Object target;

    public Object getInstance(Object person) {
        this.target = person;
        Class<?> clas = target.getClass();
        return Proxy.newProxyInstance(clas.getClassLoader(), clas.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target, args);
        after();
        return obj;
    }

    public void before() {
        System.out.println("我是媒婆，已经获取你的择偶标准");
        System.out.println("开始给你物色对象");
    }

    public void after() {
        System.out.println("如果觉得合适的话，准备办事吧");
    }

}
