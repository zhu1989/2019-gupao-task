package com.gpedu.zhuyj.designpattern.pay;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/19 22:40
 * @Description: 支付完成以后的结果状态
 * @Version 1.0
 */
public class MsgResult {

    private int code;

    private Object data;

    private String msg;

    public MsgResult(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "支付状态[" + code + "]," + msg + ",交易情况：" + data;
    }
}
