package immutableCollection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class demo02 {
    public static void main(String[] args) {
        Map<String, String> map = Map.of("a", "1", "b", "2", "c", "3");

        // 遍历map集合
        // 通过单列集合来获取键值对
        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.println(key + " : " + map.get(key));
        }

        // 通过迭代器来遍历
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 通过entry对象来访问
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
