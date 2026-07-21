package demo02_CollectionList.myGenerics;

import java.util.Arrays;

public class GenericsDemo01 {
    public static void main(String[] args) {
        /*
            关于泛型的理解：
                1、为了规范集合里面的类型，方便后续的操作
                2、写法为在类名后面加<>，里面写该集合里面的元素是什么类型
                3、ArrayList<String> list = ArrayList<>();里面的过程是创建一个集合，要装进去，其元素必须是String

            关于泛型类的理解
                1、创建泛型类如ArrayList<String> list = ArrayList<>()
                   在添加元素的时，会检查是不是String，是的话，就进入该集合，
                   但是还是通过Object类型的数组来增添元素，在最后输出时，再强制转换为String类
                2、底层还是一个object类型的数组，只是在添加数组的时候加了一个限制，在输出数组的时候做了一个强制转化。

            关于ArrayList为什么不能限制增添的数据为基本数据类型,因为在底层是通过obj数组，然后再强制转化的，Object类不能直接与基本数据类型进行转化
         */

        MyArrayList<String> myArrayList = new MyArrayList<>();

        myArrayList.add("a");
        myArrayList.add("b");

        myArrayList.get(1);
        System.out.println("myArrayList.get(1): " + myArrayList.get(1));
        System.out.println("myArrayList.toString(): " + myArrayList.toString());

    }

}

class MyArrayList<E> {
    // 底层是一个数组,所以创建一个数组对象设置容量为10
    Object[] obj =  new Object[10];
    int size = 0;

    public boolean add(E e){
        obj[size] = e;
        size++;;
        return true;
    }

    public E get(int index){
        return (E) obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
