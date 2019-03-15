package com.gpedu.zhuyj.designpattern.dbroute;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/15 18:47
 * @Description:
 * @Version 1.0
 */
public class Order {

    private String id;

    private Object orderInfo;

    //订单创建时间，根据时间按年分库
    private Long creatTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Long getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Long creatTime) {
        this.creatTime = creatTime;
    }
}
