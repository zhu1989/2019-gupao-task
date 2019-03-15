package com.gpedu.zhuyj.designpattern.dynamicproxy.cglibproxy;

import com.gpedu.zhuyj.designpattern.Person;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/15 10:13
 * @Description:
 * @Version 1.0
 */
public class WomanCustomer implements Person {

    @Override
    public void findLove() {
        System.out.println("女性客户要求：高富帅");
    }
}
