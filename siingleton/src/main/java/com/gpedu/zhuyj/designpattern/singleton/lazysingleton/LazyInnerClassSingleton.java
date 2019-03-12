package com.gpedu.zhuyj.designpattern.singleton.lazysingleton;

import java.io.Serializable;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/12 12:27
 * @Description:
 * @Version 1.0
 */
public class LazyInnerClassSingleton implements Serializable {

    private LazyInnerClassSingleton(){
        if(SingletonHodle.SINGLETON != null){
            throw new RuntimeException("不允许构建多个实例");
        }
    }

    private Object readResolve(){
        return SingletonHodle.SINGLETON;
    }


    /**
     * 懒汉式
     * 内部类SingletonHodle里面逻辑需要等外部方法调用时才执行
     * 利用JVM底层执行逻辑避免线程安全问题
     * @return
     */
    public static final LazyInnerClassSingleton getInstance(){
        return SingletonHodle.SINGLETON;
    }

    private static class SingletonHodle{
        private static final LazyInnerClassSingleton SINGLETON = new LazyInnerClassSingleton();
    }

}
