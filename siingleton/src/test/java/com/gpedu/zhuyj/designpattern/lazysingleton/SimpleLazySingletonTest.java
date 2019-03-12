package com.gpedu.zhuyj.designpattern.lazysingleton;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/12 11:20
 * @Description:
 * @Version 1.0
 */
public class SimpleLazySingletonTest {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ExcutorThread());
        Thread thread2 = new Thread(new ExcutorThread());
        thread1.start();
        thread2.start();
    }
}
