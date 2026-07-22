package demo02_CollectionList.mySet.hashSet01;

import java.util.HashSet;

public class HashSetDemo01 {
    public static void main(String[] args) {
        /*
            哈希值：
                对象的整数表现形式
                1、如果没有重写hashCode方法，不同对象计算出的哈希值是不同的
                2、如果已经重写了hashCode方法，不同对象只有属性值相同，计算出的哈希值也就相同
                3、但是小部分情况下，用不同的属性值或地址值计算出来的哈希值也有可能相同

         */
        // 1.创建对像
        Student s1 = new Student("ZhangSan", 18);
        Student s2 = new Student("LiShi", 19);
        Student s3 = new Student("WangWU", 20);
        Student s4 = new Student("LiShi", 19);

        // 1.无重写hashCode
        // 2.已经在Student类里面重写了hashCode
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        // 2.创建集合
        HashSet<Student> hashSet = new HashSet<>();
        // 3.添加元素
        System.out.println(hashSet.add(s1));
        System.out.println(hashSet.add(s2));
        System.out.println(hashSet.add(s3));
        System.out.println(hashSet.add(s4));    // 返回false

        // 4.打印集合
        System.out.println(hashSet);

    }


}
