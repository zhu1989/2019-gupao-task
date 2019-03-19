package com.gpedu.zhuyj.designpattern.delegate.simple;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/19 17:10
 * @Description:
 * @Version 1.0
 */
public class DelegateTest {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.comand("加密" ,new Leader());
        boss.comand("支付" ,new Leader());
    }
}
