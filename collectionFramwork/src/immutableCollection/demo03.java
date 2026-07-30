package immutableCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo03 {
    public static void main(String[] args) {
        /*
            创建Map的不可变集合时，如果不可变的键值对超过10该怎么创建
         */

        // 创建一个普通的Map集合
        HashMap<String, String> hm = new HashMap<>();
        hm.put("key1", "value1");
        hm.put("key2", "value2");
        hm.put("key3", "value3");
        hm.put("key4", "value4");
        hm.put("key5", "value5");
        hm.put("key6", "value6");
        hm.put("key7", "value7");
        hm.put("key8", "value8");
        hm.put("key9", "value9");
        hm.put("key10", "value10");
        hm.put("key11", "value11");
        hm.put("key12", "value12");

        // 将Map集合里的entry对象当成一个整体，
        // 获取entry
        // 创建一个以entry对象为数组的集合
        Set<Map.Entry<String, String>> set = hm.entrySet();
        // 将该以entry对象构成的集合转化为数组
        Map.Entry[] entryArray;
        entryArray = set.toArray(new Map.Entry[0]);

        // 打印输出
        for (Map.Entry entry : entryArray) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
