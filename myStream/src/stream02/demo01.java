package stream02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class demo01 {
    /*
        stream流里面的终结方法
        toArray()方法

     */
    public static void main(String[] args) {
        // toArray()方法，收集流中的数据，放到数组中
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-15","周芷芳-14","赵敏-13","张强-20","张玉书-100","张果老-40");

        // 将list中的数据放到流中

        // 没指定类型时默认转化为object类型的数组
        Object[] array1 = list.stream().toArray();
        System.out.println(Arrays.toString(array1));

        // 指定数据类型
        String[] array2 = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            // int value表示流的里面元素的数量
            public String[] apply(int value) {
                // 返回一个数组类型，数组的长度为value
                return new String[value];
            }
        });
        // 更简洁的写法
        list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(array2));

    }
}
