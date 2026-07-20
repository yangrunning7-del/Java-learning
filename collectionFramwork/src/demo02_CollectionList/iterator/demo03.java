package demo02_CollectionList.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class demo03 {
    public static void main(String[] args) {
        // 增强for循环
        Collection<String> coll = new ArrayList<String>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");


        // 关于s，它是一个第三方变量，不管在循环中它的值有没有被改变，数据遍历输出的值都不会变
        for (String s : coll) {
            System.out.println(s);
        }

        // 匿名内部类的方式来进行遍历
        // 格式：集合for Each
        // 过程，forEach需要传递一个Consumer函数式接口的实现对象，
        // 对象为{}里面的内容，{}里面实现函数式接口Consumer，重写的方法会去遍历集合coll的所有元素
        coll.forEach(new Consumer<String>() {
            @Override
            // 获得单个元素后执行的行为
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("=======================");
        // coll.forEach(s -> {System.out.println();});
        // lambda表达式的情况,忽略参数的写法
        coll.forEach(System.out::println);


    }
}
