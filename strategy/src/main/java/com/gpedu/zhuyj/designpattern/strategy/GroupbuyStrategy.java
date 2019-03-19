package com.gpedu.zhuyj.designpattern.strategy;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/19 22:12
 * @Description: 拼团优惠
 * @Version 1.0
 */
public class GroupbuyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("拼团优惠，满20人成团，团中每个人都享受团购价格");
    }
}
