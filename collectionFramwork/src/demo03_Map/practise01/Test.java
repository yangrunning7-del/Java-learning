package demo03_Map.practise01;

import java.security.Key;
import java.sql.SQLOutput;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        /*
            问题：
                班级80个人，组织秋游，可选择4个景点，
                每人至多可选一个景点，统计班级投票最高的景点
         */

        // 统计获取投票结果
        String[] arr = {"A", "B", "C", "D"};
        // 创建一个集合用于统计选择的结果
        ArrayList<String> list = new ArrayList<String>();
        // 利用随机数生成
        Random r = new Random();
        for(int i = 0; i < 80; i++){
            // 随机从arr的四个选择一个，也就是从0~3选择一个数
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }

        // 创建一个键值对，用于统计投票结果，键为景点，值为统计的数量
        HashMap<String, Integer> map = new HashMap<>();
        for (String name : list) {

            if (map.containsKey(name)) {
                // 存在，先获取当前已经被投票的次数
                int count = map.get(name);
                count ++;
                map.put(name, count);
            }else{
                map.put(name, 1);
            }
        }

        // 遍历map集合，有三种方式，通过第二种利用entrySet的方式
        int max = 0;
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Map.Entry<String, Integer> entry : set) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        System.out.println("=============================");
        System.out.println(map);
        System.out.println(max);
        for (Map.Entry<String, Integer> entry : set) {
            if (entry.getValue() == max){
                System.out.println(entry.getKey());
            }
        }

    }
}
