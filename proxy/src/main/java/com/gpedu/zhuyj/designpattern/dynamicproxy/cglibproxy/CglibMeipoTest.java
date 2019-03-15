package com.gpedu.zhuyj.designpattern.dynamicproxy.cglibproxy;

import com.gpedu.zhuyj.designpattern.Person;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/15 10:24
 * @Description:
 * @Version 1.0
 */
public class CglibMeipoTest {
    public static void main(String[] args) {

        Person person = (Person) new CglibMeipo().getInstance(WomanCustomer.class);
        person.findLove();
    }
}
