package com.gpedu.zhuyj.designpattern.dbroute;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/15 18:53
 * @Description:
 * @Version 1.0
 */
public class OrderServiceImpl implements IOrderService {

    private OrderDao orderDao;

    public OrderServiceImpl(){
        //Spring会自动自动注入
        //这里通过构造方法注入
        this.orderDao = new OrderDao();
    }

    @Override
    public int createOrder(Order order) {
        System.out.println("OrderServiceImpl开始调用OrderDao创建订单");
        return orderDao.insert(order);
    }
}
