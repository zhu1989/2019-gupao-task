package com.gpedu.zhuyj.designpattern.strategy;

import org.apache.commons.lang3.StringUtils;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/19 22:17
 * @Description:
 * @Version 1.0
 */
public class PromotionActivityTest {

    public static void main(String[] args) {
        /*PromotionActivity activity1111 = new PromotionActivity(new GroupbuyStrategy());
        activity1111.excute();
        PromotionActivity activity618 = new PromotionActivity(new CashBackStrategy());
        activity618.excute();*/

        /*PromotionActivity promotionActivity = null;
        String promotionKey = "COUPON";

        if(StringUtils.equals(promotionKey,"COUPON")){
            promotionActivity = new PromotionActivity(new CouponStrategy());
        }else if(StringUtils.equals(promotionKey,"CASHBACK")){
            promotionActivity = new PromotionActivity(new CashBackStrategy());
        }//......
        promotionActivity.excute();*/

        //使用工厂
        String promotionKey = "COUPON";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getInstance(promotionKey));
        promotionActivity.excute();
    }
}
