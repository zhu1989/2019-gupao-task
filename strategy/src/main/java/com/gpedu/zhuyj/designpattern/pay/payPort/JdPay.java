package com.gpedu.zhuyj.designpattern.pay.payPort;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/19 23:01
 * @Description:
 * @Version 1.0
 */
public class JdPay extends Payment {
    @Override
    public String getName() {
        return "京东钱包";
    }

    @Override
    public double queryBalance(String uid) {
        return 300;
    }
}
