package com.gpedu.zhuyj.designpattern.singleton.lazysingleton;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/12 12:22
 * @Description:
 * @Version 1.0
 */
public class LazyDoubleCheckSingleton {

    private static LazyDoubleCheckSingleton singleton;

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance(){

        if(singleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
