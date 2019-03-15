package com.gpedu.zhuyj.designpattern.dynamicproxy.myproxy;

import com.gpedu.zhuyj.designpattern.Person;
import com.gpedu.zhuyj.designpattern.dynamicproxy.JDKProxy.Girl;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/15 16:26
 * @Description:
 * @Version 1.0
 */
public class MyProxyTest {
    public static void main(String[] args) {
        Person person = (Person) new MyproxyMeipo().getInstance(new Girl());
        person.findLove();
    }
}
