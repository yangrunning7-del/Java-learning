package demo03_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class demo01 {
    public static void main(String[] args) {
        /*
             双列集合的特点：
                    1、存入的对象是一对一对的，包含键和值
                    2、键可以重复，值不可以重复
                    3、每个键都有自己的唯一的值
                    4、在Java中一般把键值对对象叫做Entry对象

         */
        // TODO遍历集合方法一：通过键找值
        Map<String, String> map = new HashMap<>();

        // 添加元素，利用put方法，put方法有添加、覆盖的内容，如果是覆盖则会返回被覆盖的值
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        // 把键抽取出来放入一个单列集合，再通过单列集合去获取对应的值
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(map.get(s));
        }

        System.out.println("==================================");

        // 迭代器
        Iterator<String> it = set.iterator();
        while(it.hasNext()) {
            String str = map.get(it.next());
            System.out.println(str);
        }
        System.out.println("==================================");

        // lambda表达式
        set.forEach(s-> System.out.println(map.get(s)));
        System.out.println("==================================");
        set.forEach(new Consumer<String>(){
            @Override
            public void accept(String s) {
                System.out.println(map.get(s));
            }
        });


    }
}
