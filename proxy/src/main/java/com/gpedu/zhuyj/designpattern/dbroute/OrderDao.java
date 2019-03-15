package com.gpedu.zhuyj.designpattern.dbroute;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/15 18:49
 * @Description:
 * @Version 1.0
 */
public class OrderDao {

    /**
     * 创建订单
     * @return
     */
    public int insert(Order order){
        System.out.println("OrderDao创建订单Order成功");

        return 1;
    }
}
