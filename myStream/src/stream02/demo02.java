package stream02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class demo02 {
    public static void main(String[] args) {
        // stream流终结方法里面的collect 中的Collectors静态类中的方法，收集流中的数据放到集合中

        /*
            collect(Collectors.toSet)   收集流中的数据放到集合中
            collect(Collectors.toMap)   如果要收集到Map集合中，键是不能重复的
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-15","周芷芳-14","赵敏-13","张强-20","张玉书-100","张果老-40");

        /*
            把所有的人的名字收集起来，名字作为键，年龄作为值
            还是先将集合中的数据元素添加到stream流当中
         */
        Map<String, Integer> map = list.stream().collect(Collectors.toMap(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.split("-")[0];
            }
        }, new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s.split("-")[1]);
            }
        }));
        /**
         *  toMap: 参数1表示键的生成规则
         *         参数2表示值的生成规则
         *
         *  键里面的Function泛型一：表示流中的每一个数据的类型
         *                泛型二：表示Map集合中每一个键的的数据类型
         *        方法apply:
         *          形参：表示流中的每一个数据
         *          方法体：生成键的代码
         *          返回值：已经生成键的代码
         *
         *  值里面的Function泛型一：表示流中的每一个数据的类型
         *               泛型二：表示Map集合中每一个值的的数据类型
         *       方法apply:
         *         形参：表示流中的每一个数据
         *         方法体：生成值的代码
         *         返回值：已经生成值的代码
         */


        Map<String, Integer> map1 = list.stream().collect(Collectors.toMap(s -> s.split("-")[0], s -> Integer.parseInt(s.split("-")[1])));

        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Map.Entry<String, Integer> entry : set) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+":"+value);
        }

        System.out.println(map1);


    }
}
