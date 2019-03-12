package com.gpedu.zhuyj.designpattern.threadlocal;

import com.gpedu.zhuyj.designpattern.singleton.threadlocal.ThreadLocalSingleton;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/12 16:17
 * @Description:
 * @Version 1.0
 */
public class ExcutorThread implements Runnable {

    @Override
    public void run() {
        ThreadLocalSingleton localSingleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+localSingleton);
    }
}
