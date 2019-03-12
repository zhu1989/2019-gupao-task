package com.gpedu.zhuyj.designpattern.lazysingleton;

import com.gpedu.zhuyj.designpattern.singleton.lazysingleton.LazyInnerClassSingleton;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/12 11:20
 * @Description:
 * @Version 1.0
 */
public class ExcutorThread implements Runnable {
    @Override
    public void run() {
        //SimpleLazySingleton singleton = SimpleLazySingleton.getInstance();
        //LazyDoubleCheckSingleton singleton = LazyDoubleCheckSingleton.getInstance();
        LazyInnerClassSingleton singleton = LazyInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+singleton);
    }
}
