package demo03_Map.treeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test01 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2 - o1;
                    }
                }
        );
        map.put(1, "fish");
        map.put(2, "beef");
        map.put(3, "sleep");

        Set<Map.Entry<Integer, String>> set1 = map.entrySet();
        for (Map.Entry<Integer, String> entry : set1) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
