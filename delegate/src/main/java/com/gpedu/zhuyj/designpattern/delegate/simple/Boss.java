package com.gpedu.zhuyj.designpattern.delegate.simple;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/19 17:07
 * @Description:
 * @Version 1.0
 */
public class Boss {

    //老板安排领导工作
    public void comand(String comand,Leader leader){
        leader.doing(comand);
    }
}
