package demo03_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class demo02 {
    public static void main(String[] args) {
        // TODO遍历map集合方法二：通过键值对对象entry，在调用get方法来获取
        // 创建集合Map
        Map<String, String> map = new HashMap<>();
        // 添加元素
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        System.out.println("==================================");
        // 创建entrySet集合，里面存放entry对象，键值对整体看作是一个对象
        // entrySet返回的是一个Set集合
        Set<Map.Entry<String, String>> set = map.entrySet();
        // 增强for
        for (Map.Entry<String, String> entry : set) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("==================================");
        // 迭代器
        Iterator<Map.Entry<String, String>> it = set.iterator();
        while (it.hasNext()) {
            // it.next()，是获取当前位置的对象也就是entry对象，并移动到下一个
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("==================================");
        // lambda表达式
        set.forEach(s -> System.out.println(s.getKey() + " " + s.getValue()));


    }
}
