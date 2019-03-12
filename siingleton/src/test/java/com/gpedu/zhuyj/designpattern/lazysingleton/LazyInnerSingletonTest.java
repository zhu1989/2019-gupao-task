package com.gpedu.zhuyj.designpattern.lazysingleton;

import com.gpedu.zhuyj.designpattern.singleton.lazysingleton.LazyInnerClassSingleton;
import com.sun.corba.se.impl.io.IIOPInputStream;
import com.sun.corba.se.impl.ior.OldJIDLObjectKeyTemplate;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/12 12:48
 * @Description:
 * @Version 1.0
 */
public class LazyInnerSingletonTest {

    /**
     * 测试内部类实现的单例模式的反射攻击
     */
    @Test
    public void testReflectLazyInnerSingleton(){
        try {
            Class<?> clas = LazyInnerClassSingleton.class;
            //通过反射拿到私有的构造方法
            Constructor constructor = clas.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            Object obj = constructor.newInstance();

            Object object = LazyInnerClassSingleton.getInstance();

            System.out.println(obj==object);//false

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    /**
     * 序列化方式破坏单例模式
     */
    @Test
    public void testSeriableLazyInnerSingleton(){
        LazyInnerClassSingleton singleton1 = null;
        LazyInnerClassSingleton singleton2 = LazyInnerClassSingleton.getInstance();
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("seriable.obj");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(singleton2);
            outputStream.flush();
            outputStream.close();

            FileInputStream fileInputStream = new FileInputStream("seriable.obj");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            singleton1 = (LazyInnerClassSingleton) inputStream.readObject();
            inputStream.close();

            System.out.println(singleton1);
            System.out.println(singleton2);
            System.out.println(singleton1 == singleton2);//false


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
