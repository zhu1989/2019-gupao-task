package com.gpedu.zhuyj.designpattern.dbroute.proxy;

import com.gpedu.zhuyj.designpattern.dbroute.IOrderService;
import com.gpedu.zhuyj.designpattern.dbroute.Order;
import com.gpedu.zhuyj.designpattern.dbroute.db.DynamicDataSourceEntity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/15 19:08
 * @Description:
 * @Version 1.0
 */
public class OrderServiceStaticProxy implements IOrderService {

    private IOrderService orderService;

    public OrderServiceStaticProxy(IOrderService service){
        this.orderService = service;
    }

    private SimpleDateFormat format = new SimpleDateFormat("yyyy");

    @Override
    public int createOrder(Order order) {
        Long time = order.getCreatTime();
        int year = Integer.valueOf(format.format(new Date(time)));
        System.out.println("静态代理类自动分配到【DB_" +  year + "】数据源处理数据");
        DynamicDataSourceEntity.setDB(year);

        orderService.createOrder(order);
        DynamicDataSourceEntity.reset();

        return 1;
    }
}
