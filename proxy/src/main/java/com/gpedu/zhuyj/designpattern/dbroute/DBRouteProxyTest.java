package com.gpedu.zhuyj.designpattern.dbroute;

import com.gpedu.zhuyj.designpattern.dbroute.proxy.OrderServiceStaticProxy;
import com.gpedu.zhuyj.designpattern.dbroute.proxy.OrderServiceDynamicProxy;

import java.util.Date;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/15 19:17
 * @Description:
 * @Version 1.0
 */
public class DBRouteProxyTest {
    public static void main(String[] args) {
        Order order = new Order();
        //order.setCreatTime(new Date().getTime());
        order.setCreatTime(2018L);

        //静态代理
        //int result = new OrderServiceStaticProxy(new OrderServiceImpl()).createOrder(order );

        //动态代理
        IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy().getInstance(new OrderServiceImpl());
        orderService.createOrder(order);

    }
}
