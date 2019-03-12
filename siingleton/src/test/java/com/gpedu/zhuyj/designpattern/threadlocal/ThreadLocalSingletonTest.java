package com.gpedu.zhuyj.designpattern.threadlocal;

import org.junit.Test;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/12 15:50
 * @Description: ThreadLocal单例
 * @Version 1.0
 */
public class ThreadLocalSingletonTest {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ExcutorThread());
        Thread thread2 = new Thread(new ExcutorThread());

        thread1.start();
        thread2.start();
    }
}
