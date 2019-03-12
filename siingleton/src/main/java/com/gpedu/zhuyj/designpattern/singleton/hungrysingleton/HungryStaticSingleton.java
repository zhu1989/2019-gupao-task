package com.gpedu.zhuyj.designpattern.singleton.hungrysingleton;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/12 11:06
 * @Description:
 * @Version 1.0
 */
public class HungryStaticSingleton {

    private static HungryStaticSingleton singleton;

    static {
        singleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){}

    public HungryStaticSingleton getInstance(){
        return singleton;
    }
}
