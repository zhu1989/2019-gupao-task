package com.gpedu.zhuyj.designpattern.pay.payPort;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/19 23:02
 * @Description:
 * @Version 1.0
 */
public class WeChatPay extends Payment {
    @Override
    public String getName() {
        return "微信钱包";
    }

    @Override
    public double queryBalance(String uid) {
        return 100;
    }
}
