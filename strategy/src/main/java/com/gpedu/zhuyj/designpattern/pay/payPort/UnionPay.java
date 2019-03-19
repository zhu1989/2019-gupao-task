package com.gpedu.zhuyj.designpattern.pay.payPort;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/19 23:03
 * @Description:
 * @Version 1.0
 */
public class UnionPay extends Payment {
    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
    public double queryBalance(String uid) {
        return 1000;
    }
}
