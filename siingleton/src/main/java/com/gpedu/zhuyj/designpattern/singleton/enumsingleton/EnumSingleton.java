package com.gpedu.zhuyj.designpattern.singleton.enumsingleton;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/12 14:48
 * @Description:
 * @Version 1.0
 */
public enum  EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
