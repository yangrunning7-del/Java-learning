package demo03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class demo01 {
    public static void main(String[] args) {
        /*
            方法引用(类名引用成员方法)
            格式：
                类名::成员方法
            需求：
                集合里面一些字符串，要求变成大写后进行输出

            方法引用的规则：
                1、需要有函数式接口
                2、被引用的方法必须已经存在
                3、被引用方法的形参，需要跟抽象方法的第二个到最后一个形参保持一致，返回值需要保持一致
                4、被引用方法的功能需要满足当前的要求

         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa", "bbb", "ccc", "ddd", "eee");

        // 变成大写后输出：String -> String(lambada表达式)
        // 拿着流里面的每一个数据，去调用String类中的toUpperCase方法，方法的返回值就是转化之后的结果
        list.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
        System.out.println("==================================================");
        // 匿名内部类的形式
        list.stream().map(new Function<String,String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).forEach(System.out::println);

    }
}
