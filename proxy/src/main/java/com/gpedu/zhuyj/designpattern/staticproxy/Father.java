package com.gpedu.zhuyj.designpattern.staticproxy;

import com.gpedu.zhuyj.designpattern.Person;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/14 22:23
 * @Description:
 * @Version 1.0
 */
public class Father implements Person {

    private Person son;

    public Father(Person son) {
        this.son = son;
    }

    @Override
    public void findLove() {
        before();
        son.findLove();
        after();
    }

    public void before(){
        System.out.println("开始给儿子物色对象");
    }

    public void after(){
        System.out.println("双方父母同意，开始准备结婚");
    }

}
