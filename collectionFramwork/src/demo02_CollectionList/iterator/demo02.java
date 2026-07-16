package demo02_CollectionList.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class demo02 {
    public static void main(String[] args) {

        Collection<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");

        // 迭代器，通过集合对象里面的iterator方法调用迭代对象
        Iterator<String> it = list.iterator();
        /*
            注意事项：
                1、关于迭代器的报错NOSuchElementException
                2、迭代器遍历完，指针不会复位
                3、每次循环只能用一次next()
                4、迭代器在遍历时，不能以集合的方法进行增添，或者删除。但是可以使用构造器的方法进行删除

         */
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);

            if("bbb".equals(str)){
                // list.remove(); 会报错
                it.remove();
            }
        }

        System.out.println(list);
    }
}
