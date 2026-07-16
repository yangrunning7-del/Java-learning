package demo02_CollectionList.iterator;

import java.util.ArrayList;
import java.util.Collection;

public class demo03 {
    public static void main(String[] args) {
        // 增强for循环
        Collection<String> coll = new ArrayList<String>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");


        // 关于s，它是一个第三方变量，不管在循环中它的值有没有被改变，数据遍历输出的值都不会变
        for (String s : coll) {
            System.out.println(s);
        }
    }
}
