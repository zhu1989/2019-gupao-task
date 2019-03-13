package com.gpedu.zhuyj.designpattern.simple;

import java.util.List;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/13 16:08
 * @Description:
 * @Version 1.0
 */
public class Student implements Prototype {

    //姓名
    private String name;

    //年龄
    private int age;

    //课程
    private List course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List getCourse() {
        return course;
    }

    public void setCourse(List course) {
        this.course = course;
    }

    @Override
    public Prototype clone() {
        Student student = new Student();
        student.setName(this.name);
        student.setAge(this.age);
        student.setCourse(this.course);
        return student;
    }
}
