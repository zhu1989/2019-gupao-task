package com.gpedu.zhuyj.designpattern.strategy;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/19 22:09
 * @Description: 无优惠
 * @Version 1.0
 */
public class EmptyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无优惠活动");
    }
}
