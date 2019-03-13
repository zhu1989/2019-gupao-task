package com.gpedu.zhuyj.designpattern.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: zhuYanjun
 * @Date: 2019/3/13 16:15
 * @Description:
 * @Version 1.0
 */
public class PrototypeTest {

    public static void main(String[] args) {
        Student studentA = new Student();
        studentA.setName("zhangsan");
        studentA.setAge(18);

        List<String> course = new ArrayList<>();
        course.add("英语");
        course.add("物理");
        course.add("化学");
        course.add("数学");
        studentA.setCourse(course);

        Student studentB = (Student) studentA.clone();

        System.out.println(studentA.getCourse());
        System.out.println(studentB.getCourse());
        System.out.println(studentA.getCourse() == studentB.getCourse());
    }
}
