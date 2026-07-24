package demo04_practise.practise02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Practise01 {
    public static void main(String[] args) {
        /*
         班级里有5个学生
         要求:
         会被点到的学生，不会再被点到。
         但是如果班级中所有的学生都点完了，需要重新开启第二轮点名。
        */

        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        Collections.addAll(list1, "范建", "范统", "杜子腾", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰", "尤永志", "沈京兵",
                "马统",
                "费彦",
                "杜紫藤",
                "吴子法",
                "杜琦燕",
                "袁明媛",
                "梅良心",
                "吴礼茂",
                "陶仁燕");
        // 随机点名
        Random r = new Random();
        int count = list1.size();


        for (int j = 0; j < 10; j++) {
            // 每次删除完一个元素后，再次循环时，list集合的长度就会减少一次，所以要固定循环的次数
            for (int i = 0; i < count; i++) {
                // 随机获取一个索引
                int index = r.nextInt(list1.size());
                String name = list1.remove(index);
                list2.add(name);
                System.out.println(name);
            }
            // 此时list1中无元素，将被删除的list2中的元素都传给list1
            list1.addAll(list2);
            list2.clear();
        }


    }
}
