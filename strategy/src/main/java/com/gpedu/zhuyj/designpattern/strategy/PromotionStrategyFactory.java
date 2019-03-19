package com.gpedu.zhuyj.designpattern.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/19 22:20
 * @Description: 促销工厂
 * @Version 1.0
 */
public class PromotionStrategyFactory {

    private static Map<String,PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.COUPON,new CouponStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.CASHBACK,new CashBackStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.GROUPBUY,new GroupbuyStrategy());
    }

    private PromotionStrategyFactory(){}

    private static PromotionStrategy DEFAULT = new EmptyStrategy();

    public static PromotionStrategy getInstance(String promotionKey){
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ? DEFAULT : promotionStrategy;
    }

    public interface PromotionKey{
        public String COUPON = "COUPON";
        public String CASHBACK = "CASHBACK";
        public String GROUPBUY = "GROUPBUY";
    }
}
