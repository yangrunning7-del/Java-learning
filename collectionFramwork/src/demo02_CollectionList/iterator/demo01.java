package demo02_CollectionList.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class demo01 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aa");
        coll.add("bb");
        coll.add("cb");


        // 创建一个迭代器，刚开始指向0，迭代器遍历不需要通过索引
        // 通过调用coll类里面的iterator方法来创建一个迭代对象，命名为it，这个迭代器面向String类
        Iterator<String> it = coll.iterator();
        while(it.hasNext()) {
            // 获取当前迭代器所在对象，并移动指针
            String str = it.next();
            System.out.println(str);
        }   // 循环结束后，迭代器的指针没有指向对象，再次调用则会报错
        System.out.println(it.next());  // NoSuchElementException

        // 迭代器遍历的时候不能以集合的方方法进行增加或者删除，是什么意思呢？

    }
}
