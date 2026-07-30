package stream01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class demo03 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-15","周芷芳-14","赵敏-13","张强-20","张玉书-100","张果老-40");

        /*
            需求：只要获取里面的年龄并打印
                也就是String类型 -> Integer类型
         */

        /*
            里面stream流里面的map方法，该方法里面的参数是一个函数式接口
            接口的第一个参数：stream流里面的类型，
                 第二个参数：转化的类型

            重写里面的方法，方法里面的参数s，表示流里面的每一个元素
         */
        list.stream().map(new Function<String, Integer>(){
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s.split("-")[1]);
            }
        } );
    }
}
