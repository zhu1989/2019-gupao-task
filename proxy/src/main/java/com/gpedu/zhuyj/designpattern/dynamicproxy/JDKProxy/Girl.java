package com.gpedu.zhuyj.designpattern.dynamicproxy.JDKProxy;

import com.gpedu.zhuyj.designpattern.Person;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/14 22:35
 * @Description:
 * @Version 1.0
 */
public class Girl implements Person {

    @Override
    public void findLove() {
        System.out.println("女孩子择偶标准：高富帅");
    }
}
