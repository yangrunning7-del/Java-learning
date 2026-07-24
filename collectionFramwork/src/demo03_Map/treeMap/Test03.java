package demo03_Map.treeMap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;

public class Test03 {
    public static void main(String[] args) {
        String str = "aababcbdadfadd";

        TreeMap<Character,Integer> map = new TreeMap<Character,Integer>(
                new Comparator<Character>() {
                    @Override
                    public int compare(Character o1, Character o2) {
                        return o1 - o2;
                    }
                }
        );
        // 统计str里面出现的结果
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)){
                int count = map.get(c);
                count++;
                map.put(c,count);
            }else{
                map.put(c,1);
            }
        }
        System.out.println(map);
        // 字符串拼接，用StringBuilder
        System.out.println("==============================");
        StringBuilder sb = new StringBuilder();
        map.forEach((k,v)->{
            sb.append(k).append("(").append(v).append(")");
        });
        System.out.println(sb);


    }
}
