package com.gpedu.zhuyj.designpattern.pay.payPort;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/19 23:00
 * @Description:
 * @Version 1.0
 */
public class AliPay extends Payment {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    public double queryBalance(String uid) {
        return 440;
    }
}
