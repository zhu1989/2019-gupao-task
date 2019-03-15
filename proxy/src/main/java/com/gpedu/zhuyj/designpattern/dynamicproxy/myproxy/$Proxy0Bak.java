package com.gpedu.zhuyj.designpattern.dynamicproxy.myproxy;
import java.lang.reflect.*;
public class $Proxy0Bak implements com.gpedu.zhuyj.designpattern.Person{
    MyInvocationHandler h;
    public $Proxy0Bak(MyInvocationHandler h){
        this.h = h;
    }
    public void findLove(){
        try{
            Method m = com.gpedu.zhuyj.designpattern.Person.class.getMethod("findLove",new Class[]{});
            this.h.invoke(this,m,new Object[]{});
        }catch(Error _ex) { }catch(Throwable e){
            throw new UndeclaredThrowableException(e);
        }}
}