package com.gpedu.zhuyj.designpattern.pay.payPort;

import com.gpedu.zhuyj.designpattern.pay.MsgResult;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/19 22:50
 * @Description: 支付渠道
 * @Version 1.0
 */
public abstract class Payment {

    //支付类型
    public abstract String getName();

    //查询余额
    public abstract double queryBalance(String uid);

    //支付扣款
    public MsgResult pay(String uid,double amount){
        if(queryBalance(uid)<amount){
            return new MsgResult(500,"余额不足","支付失败");
        }else{
            return new MsgResult(200,"支付金额"+amount,"支付成功");
        }
    }
}
