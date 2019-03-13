package com.gpedu.zhuyj.designpattern.deep;

import java.io.Serializable;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/13 16:27
 * @Description:
 * @Version 1.0
 */
public class JinGuBang implements Serializable {

    //长度
    public float length;

    //宽度
    public float width;

    public void big(){
        this.length = this.length * 2;
        this.width = this.width * 2;
    }

    public void small(){
        this.length = this.length / 2;
        this.width = this.width / 2;
    }

}
