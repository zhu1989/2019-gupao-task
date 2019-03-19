package com.gpedu.zhuyj.designpattern.delegate.simple;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/19 17:03
 * @Description:
 * @Version 1.0
 */
public class EmployeeA implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工A，现在开始干" + command + "工作");
    }
}
