package com.gpedu.zhuyj.designpattern.strategy;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/19 17:56
 * @Description: 优惠券
 * @Version 1.0
 */
public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("领取优惠券,课程的价格直接减优惠券面值抵扣");
    }
}
