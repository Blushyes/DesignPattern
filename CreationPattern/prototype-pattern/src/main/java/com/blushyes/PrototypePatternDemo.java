package com.blushyes;

import com.blushyes.pojo.Student;
import com.blushyes.pojo.Teacher;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        Student studentA = new Student("张三", 13, new Teacher("王五", 10, "数学"));
        Student studentB = studentA.clone();
        studentB.getTeacher().setName("左某");
        System.out.println(studentA);
        System.out.println(studentB);
    }
}
