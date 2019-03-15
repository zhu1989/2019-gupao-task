package com.gpedu.zhuyj.designpattern.staticproxy;

import com.gpedu.zhuyj.designpattern.Person;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/14 22:29
 * @Description:
 * @Version 1.0
 */
public class FatherProxyTest {

    public static void main(String[] args) {

        Person father = new Father(new Son());
        father.findLove();

    }
}
