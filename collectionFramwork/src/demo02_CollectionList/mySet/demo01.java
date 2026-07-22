package demo02_CollectionList.mySet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class demo01 {
    public static void main(String[] args) {
        /*
            1.HashSet:
                --无序，不重复，无索引
            2.LinkSet:
                --有序，不重复，无索引
            3.TreeSet:
                --可排序，不重复，无索引
         */

        // 创建一个set集合
        // 由于set集合是一个接口，所以不能直接创建它的对象，只能创建它的实现类的对象
        Set<String> s = new HashSet<>();

        // 添加元素
        s.add("shut");
        s.add("the");
        s.add("fuck");
        s.add("up");

        // 利用迭代器遍历
        Iterator<String> it = s.iterator();
        while(it.hasNext()){
            // it.hasNext()，获取当前元素和移动指针
             String str = it.next();
            System.out.print(str + " ");
        }

        System.out.println("===========================");

        // 利用增强for
        for (String str : s) {
            System.out.print(str + " ");
        }
        System.out.println("===========================");

        // 利用匿名内部类的forEach
        s.forEach(new Consumer<String>() {
            @Override
            // 外面的forEach在遍历s集合的每一个元素，而里面的accept依次接收，再打印
            public void accept(String s) {
                System.out.print(s + " ");
            }
        });
        System.out.println("===========================");
        // lambda表达式的形式遍历
        s.forEach((String s1) ->{System.out.print(s1 + " ");});
        // 简略写法：s.forEach(s1 ->System.out.print(s1 + " "));

    }
}
