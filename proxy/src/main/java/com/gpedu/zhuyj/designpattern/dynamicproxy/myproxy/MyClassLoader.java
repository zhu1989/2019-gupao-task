package com.gpedu.zhuyj.designpattern.dynamicproxy.myproxy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/15 16:02
 * @Description:
 * @Version 1.0
 */
public class MyClassLoader extends ClassLoader {

    private File classPathFile;

    public MyClassLoader() {
        String classpath = MyClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classpath);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        String className = MyClassLoader.class.getPackage().getName() + "." + name;
        if (classPathFile != null) {
            File classFile = new File(classPathFile, name.replace("\\.", "/") + ".class");
            if (classFile.exists()) {
                FileInputStream inputStream = null;
                ByteArrayOutputStream outputStream = null;
                try {
                    inputStream = new FileInputStream(classFile);
                    outputStream = new ByteArrayOutputStream();
                    byte[] buff = new byte[1024];
                    int len;
                    while ((len = inputStream.read(buff)) != -1) {
                        outputStream.write(buff,0,len);
                    }
                    return defineClass(className,outputStream.toByteArray(),0,outputStream.size());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
