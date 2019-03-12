package com.gpedu.zhuyj.designpattern.singleton.lazysingleton;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/12 11:17
 * @Description:
 * @Version 1.0
 */
public class SimpleLazySingleton {

    private static SimpleLazySingleton singleton;

    private SimpleLazySingleton(){}

    public static synchronized SimpleLazySingleton getInstance(){
        if(singleton == null ){
            singleton = new SimpleLazySingleton();
        }
        return singleton;
    }
}
