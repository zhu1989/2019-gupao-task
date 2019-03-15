package com.gpedu.zhuyj.designpattern.dbroute.proxy;

import com.gpedu.zhuyj.designpattern.dbroute.db.DynamicDataSourceEntity;
import com.gpedu.zhuyj.designpattern.dynamicproxy.myproxy.MyClassLoader;
import com.gpedu.zhuyj.designpattern.dynamicproxy.myproxy.MyInvocationHandler;
import com.gpedu.zhuyj.designpattern.dynamicproxy.myproxy.MyProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/15 19:22
 * @Description:
 * @Version 1.0
 */
public class OrderServiceDynamicProxy implements MyInvocationHandler {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");

    private Object target;

    public Object getInstance(Object obj){
        this.target = obj;
        Class<?> clazz = target.getClass();
        return MyProxy.newProxyInstance(new MyClassLoader(),clazz.getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object obj = method.invoke(target,args);
        after();
        return obj;
    }

    public void before(Object target){
        System.out.println("Proxy before method");
        try {
            //规定getCreateTime为方法规范，获取分库数据
            Long time = (Long) target.getClass().getMethod("getCreatTime").invoke(target);
            int year = Integer.valueOf(dateFormat.format(time));
            DynamicDataSourceEntity.setDB(year);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void after(){
        System.out.println("after proxy method");
        DynamicDataSourceEntity.reset();
    }
}
