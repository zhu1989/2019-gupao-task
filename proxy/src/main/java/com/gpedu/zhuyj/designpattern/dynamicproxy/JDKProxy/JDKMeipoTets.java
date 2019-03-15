package com.gpedu.zhuyj.designpattern.dynamicproxy.JDKProxy;

import com.gpedu.zhuyj.designpattern.Person;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import sun.misc.ProxyGenerator;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/14 22:44
 * @Description:
 * @Version 1.0
 */
public class JDKMeipoTets {

    public static void main(String[] args) throws Exception{
        Person person = (Person) new JDKMeipo().getInstance(new Girl());
        person.findLove();

        //获取代理类代码
        byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
        FileOutputStream outputStream = new FileOutputStream("E://delete//$Proxy.class");
        outputStream.write(bytes);
        outputStream.close();

    }
}
