package com.gpedu.zhuyj.designpattern.deep;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/13 16:46
 * @Description:
 * @Version 1.0
 */
public class DeepCloneTest {

    public static void main(String[] args) {
        MrSun sun1 = new MrSun();
        try {
            MrSun sun2 = (MrSun) sun1.clone();
            System.out.println("深度克隆："+(sun1.jinGuBang == sun2.jinGuBang));
        } catch (Exception e) {
            e.printStackTrace();
        }

        MrSun sun3 = sun1.shallowClone(sun1);
        System.out.println("浅克隆："+(sun1.jinGuBang == sun3.jinGuBang));
    }
}
