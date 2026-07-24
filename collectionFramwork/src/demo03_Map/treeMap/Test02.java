package demo03_Map.treeMap;

import java.sql.SQLOutput;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test02 {
    public static void main(String[] args) {
        // 创建学生对象
        Student s1 = new Student("KoBaby", 24);
        Student s2 = new Student("ZhangTeacher", 44);
        Student s3 = new Student("WhatCanIII", 26);

        // 创建集合
        TreeMap<Student, String> map = new TreeMap<>();
        map.put(s1, "KoBaby");
        map.put(s2, "ZhangTeacher");
        map.put(s3, "WhatCanIII");

        // 遍历集合
        // 法一
        Set<Student> set1 = map.keySet();
        for (Student student : set1) {
            System.out.println(student.getName() + " " + student.getAge());
        }
        // 法二
        Set<Map.Entry<Student, String>> set2 = map.entrySet();
        for (Map.Entry<Student, String> entry : set2) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}
