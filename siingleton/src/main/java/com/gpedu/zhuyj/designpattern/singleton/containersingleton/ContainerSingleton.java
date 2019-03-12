package com.gpedu.zhuyj.designpattern.singleton.containersingleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/12 15:26
 * @Description: 容器式单例
 * 适用于创建实例非常多的情况，便于管理
 * 是非线程安全的
 * @Version 1.0
 */
public class ContainerSingleton {

    private ContainerSingleton() {
    }

    private static Map<String, Object> map = new ConcurrentHashMap<String, Object>();

    public static Object getInstance(String className) {
        synchronized (map) {
            if (!map.containsKey(className)) {
                Object object = null;
                try {
                    object = Class.forName(className).newInstance();
                    map.put(className, object);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return object;
            } else {
                return map.get(className);
            }
        }
    }
}
