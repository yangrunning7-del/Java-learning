package demo01_ArrayList;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayList01 {
    /*
        ArrayList  是一个集合类型，如何去创建一个集合类型
     */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("a");
        list.add("b");
        list.add("c");

        list.add(1, "kao");

        list.remove("a");
        list.remove(2);

        list.size();

        System.out.println("======================");
        // 写法一：面向具体实现类（拥有索引删除能力）
        ArrayList<String> list1 = new ArrayList<>();
        String remove = list1.remove(0);// ✅ 可以！因为 ArrayList 自己定义了 remove(int index)

        // 写法二：面向 Collection 接口（失去索引删除能力）
        Collection<String> list2 = new ArrayList<>();
        list2.remove(0); // ❌ 编译报错！Collection 接口里没有 remove(int index) 这个方法
        list2.remove("abc"); // ✅ 可以！这是 Collection 接口定义的共有方法

    }
}
