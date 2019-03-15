package com.gpedu.zhuyj.designpattern.staticproxy;

import com.gpedu.zhuyj.designpattern.Person;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/14 22:22
 * @Description:
 * @Version 1.0
 */
public class Son implements Person {

    @Override
    public void findLove() {
        System.out.println("儿子要求：美女一枚");
    }
}
