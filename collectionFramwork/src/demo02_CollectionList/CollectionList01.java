package demo02_CollectionList;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionList01 {
    public static void main(String[] args) {
        /*
            关于Collection，它是一个接口，无法直接创建它的对象，只能通过创建它的实现类来学习它里面的方法
            list的特点：
            set的特点：


         */

        // 创建一个collection类型的，但是是通过它的实现类ArrayList
        Collection<String> list = new ArrayList<>();

        // add方法是Collection里面共性的方法
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);

        // remove方法，无法通过索引来删除，Collection里面没有用索引删除的方法，只能通过对象来删除
        list.remove("a");
        System.out.println(list);

        // contains方法，由于contains底层依赖的是equals方法，故当用自定义的对象去使用contains时，系统会默认去调用Object类的
        // equals方法，不是比较的内容，而是比较的地址
        System.out.println("========================");
        System.out.println(list.contains("a"));


        System.out.println("========================");
        Collection<Student> students = new ArrayList<Student>();

        Student s1 = new Student("zhangsan", 22);
        Student s2 = new Student("lishi", 23);
        Student s3 = new Student("wangwu", 24);
        students.add(s1);
        students.add(s2);
        students.add(s3);

        Student s4 = new Student("zhangsan", 22);
        boolean a =  students.contains(s4); // 结果为true
        System.out.println(a);
    }
}
