package com.gpedu.zhuyj.designpattern.strategy;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/19 22:14
 * @Description: 促销活动类
 * @Version 1.0
 */
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy){
        this.promotionStrategy = promotionStrategy;
    }

    public void excute(){
        this.promotionStrategy.doPromotion();
    }

}
