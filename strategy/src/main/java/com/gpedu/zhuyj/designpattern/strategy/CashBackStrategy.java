package com.gpedu.zhuyj.designpattern.strategy;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/19 22:10
 * @Description: 现金返现
 * @Version 1.0
 */
public class CashBackStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("现金返现活动，现金返回到支付宝");
    }
}
