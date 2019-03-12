package com.gpedu.zhuyj.designpattern.singleton.threadlocal;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/12 15:50
 * @Description: ThreadLocal单例
 * @Version 1.0
 */
public class ThreadLocalSingleton {

    private ThreadLocalSingleton(){}

    private static  final ThreadLocal<ThreadLocalSingleton> threadLocalSingleton = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton getInstance(){
        return threadLocalSingleton.get();
    }
}
