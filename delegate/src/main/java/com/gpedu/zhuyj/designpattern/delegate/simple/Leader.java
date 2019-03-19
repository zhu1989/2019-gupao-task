package com.gpedu.zhuyj.designpattern.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/19 17:04
 * @Description:
 * @Version 1.0
 */
public class Leader implements IEmployee {

    private static Map<String,IEmployee> employees = new HashMap<>();

    static {
        employees.put("加密",new EmployeeA());
        employees.put("支付",new EmployeeB());
    }

    //领导自己不工作，安排员工工作
    @Override
    public void doing(String command) {
        employees.get(command).doing(command);
    }
}
