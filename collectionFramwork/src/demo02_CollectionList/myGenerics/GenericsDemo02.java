package demo02_CollectionList.myGenerics;

import java.util.ArrayList;

public class GenericsDemo02 {
    public static void main(String[] args) {
        // 需要传入一个集合对象类型为String
        ArrayList<String> list = new ArrayList<>();
        add(list, "a" );
        add(list, "b" );
        System.out.println(list);

    }

    // 静态的泛型方法:可以添加一个不确定的类
    // ArrayList<E>为类型
    // 在通配符前加<类型>
    public static <E> void add(ArrayList<E> list, E e) {
        list.add(e);
    }
}
