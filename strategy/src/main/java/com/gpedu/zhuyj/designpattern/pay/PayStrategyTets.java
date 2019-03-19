package com.gpedu.zhuyj.designpattern.pay;

import com.gpedu.zhuyj.designpattern.pay.payPort.PayStrategy;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/19 23:11
 * @Description:
 * @Version 1.0
 */
public class PayStrategyTets {

    public static void main(String[] args) {
        Order order = new Order("1","201903190020",200);
        String result = order.pay(PayStrategy.JD_PAY).toString();
        System.out.println(result);
    }
}
