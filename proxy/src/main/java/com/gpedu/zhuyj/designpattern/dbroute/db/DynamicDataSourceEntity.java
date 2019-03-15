package com.gpedu.zhuyj.designpattern.dbroute.db;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/15 19:00
 * @Description:
 * @Version 1.0
 */
public class DynamicDataSourceEntity {

    public static final String DEFAULT_DB = null;

    private static final ThreadLocal<String> local = new ThreadLocal<>();

    private DynamicDataSourceEntity(){}

    public static void reset(){
        local.set(DEFAULT_DB);
    }

    public static String getDb(){
        return local.get();
    }

    public static void setDb(String db){
        local.set(db);
    }

    public static void setDB(int year){
        local.set("DB_"+year);
    }

}
