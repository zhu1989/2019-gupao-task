package com.gpedu.zhuyj.designpattern.EnumSingleton;

import com.gpedu.zhuyj.designpattern.singleton.enumsingleton.EnumSingleton;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/12 14:48
 * @Description:
 * @Version 1.0
 */
public class EnumSingletonTest {

    @Test
    public void testSeriableEnumSingleton(){
        EnumSingleton singleton1 = null;
        EnumSingleton singleton2 = EnumSingleton.getInstance();
        singleton2.setData(new Object());

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("enumsingleton.obj");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(singleton2);
            objectOutputStream.flush();
            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("enumsingleton.obj");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            singleton1 = (EnumSingleton) objectInputStream.readObject();
            objectInputStream.close();

            System.out.println(singleton1.getData());
            System.out.println(singleton2.getData());
            System.out.println(singleton1.getData() == singleton2.getData());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testReflectEnumSingleton(){
        try {
            Class<?> clas = EnumSingleton.class;
            Constructor constructor = clas.getDeclaredConstructor(String.class, int.class);
            constructor.setAccessible(true);
            EnumSingleton singleton = (EnumSingleton) constructor.newInstance("lisi",12);
            System.out.println(singleton.getData());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
