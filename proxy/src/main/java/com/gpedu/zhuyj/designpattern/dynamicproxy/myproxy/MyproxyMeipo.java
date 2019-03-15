package com.gpedu.zhuyj.designpattern.dynamicproxy.myproxy;

import com.gpedu.zhuyj.designpattern.Person;

import java.lang.reflect.Method;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/15 15:49
 * @Description:
 * @Version 1.0
 */
public class MyproxyMeipo implements MyInvocationHandler {

    private Object target;

    public Object getInstance(Object person){
        this.target = person;
        Class<?> clazz = target.getClass();
        return MyProxy.newProxyInstance(new MyClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);
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
