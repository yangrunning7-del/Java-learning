package demo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class demo01 {
    public static void main(String[] args) {
        /*
            引用成员方法：
                格式：对象::成员方法
                1、其他类：其他类对象::方法名
                2、本类：this::方法名 （引用处不能是静态方法，只能通过new对象再来::方法）
                3、父类：super::方法名 （引用处不能是静态方法，只能通过new对象再来::方法）
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰");

        list.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3).forEach(System.out::println);

        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张") && s.length() == 3;
            }
        });
        // 方法引用
        StringOperation so = new StringOperation();
        list.stream().filter(so::stringJudge).forEach(System.out::println);


    }
}
