package com.gpedu.zhuyj.designpattern.deep;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;
import java.util.Date;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/13 16:30
 * @Description:
 * @Version 1.0
 */
public class MrSun extends Monkey implements Cloneable, Serializable {

    public JinGuBang jinGuBang;

    public MrSun(){
        this.height = 12;
        this.height = 12;
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    /**
     * 深克隆
     * @return
     */
    private MrSun deepClone(){
        try {
            ByteOutputStream byteOutputStream = new ByteOutputStream();
            ObjectOutputStream outputStream = new ObjectOutputStream(byteOutputStream);
            outputStream.writeObject(this);

            ByteArrayInputStream byteInputStream = new ByteArrayInputStream(byteOutputStream.toByteArray());
            ObjectInputStream inputStream = new ObjectInputStream(byteInputStream);
            MrSun sun = (MrSun) inputStream.readObject();
            sun.birthday = new Date();

            return sun;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 浅克隆
     * @return
     */
    public MrSun shallowClone( MrSun target){
        MrSun sun = new MrSun();
        sun.height = target.height;
        sun.weight = target.weight;
        sun.birthday = new Date();
        sun.jinGuBang = target.jinGuBang;

        return sun;
    }

}
