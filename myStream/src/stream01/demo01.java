package stream01;

import java.util.ArrayList;

public class demo01 {
    public static void main(String[] args) {

        /*创建集合添加元素，完成以下需求：
        把所有以 “张” 开头的元素存储到新集合中
        把 “张” 开头的，长度为 3 的元素再存储到新集合中
                遍历打印最终结果*/

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        list1.add("张无忌");
        list1.add("周芷若");
        list1.add("赵敏");
        list1.add("张强");
        list1.add("张三丰");
        // stream流，过滤器filter
        list1.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 3).forEach(name -> list3.add(name));
        System.out.println(list3);
    }
}
