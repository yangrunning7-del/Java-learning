package demo04_practise.practise01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Practise {
    public static void main(String[] args) {
        /*
            有N个学生，生成随机数生成器用于点名
            并且，70%选到男生，30%选到女生
         */

        // 创建集合用于存放name
        ArrayList<String> list = new ArrayList<>();

        // 利用Collections工具类
        Collections.addAll(list, "范建", "范统", "杜子腾", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰", "尤永志", "沈京兵",
                "马统",
                "费彦",
                "杜紫藤",
                "吴子法",
                "杜琦燕",
                "袁明媛",
                "梅良心",
                "吴礼茂",
                "陶仁燕");

        Random r = new Random();
        int index = r.nextInt(list.size());

        /*
         法二，利用collections集合工具类中的shuffle进行打乱
         Collections.shuffle(list);
         System.out.println(list.get(1));
        */

        // 创建一个集合，里面存入7个1，和3个0
        ArrayList<Integer> numList = new ArrayList<>();
        Collections.addAll(numList, 1, 1, 1, 1, 1, 1, 1);
        Collections.addAll(numList, 0, 0, 0);
        // 打乱数据（多余）
        Collections.shuffle(numList);
        ArrayList<String> boyList = new ArrayList<>();
        Collections.addAll(boyList,
                "范建",
                "范统",
                "杜子腾",
                "宋合泛",
                "侯笼藤",
                "朱益群",
                "朱穆朗玛峰",
                "尤永志",
                "沈京兵",
                "马统",
                "费彦",
                "杜紫藤",
                "吴子法");

        ArrayList<String> girlList = new ArrayList<>();
        Collections.addAll(girlList,
                "杜琦燕",
                "袁明媛",
                "梅良心",
                "吴礼茂",
                "陶仁燕"
        );

        int num = r.nextInt(numList.size());
        if (num == 1) {
            System.out.println(boyList.get(r.nextInt(boyList.size())));
        } else {
            System.out.println(girlList.get(r.nextInt(girlList.size())));
        }


    }
}
