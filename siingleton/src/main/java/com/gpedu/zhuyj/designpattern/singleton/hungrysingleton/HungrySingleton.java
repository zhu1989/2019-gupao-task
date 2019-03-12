package com.gpedu.zhuyj.designpattern.singleton.hungrysingleton;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/12 11:02
 * @Description:
 * @Version 1.0
 */
public class HungrySingleton {

    private static  final HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton() { }

    public static HungrySingleton getInstance(){
        return singleton;
    }
}
