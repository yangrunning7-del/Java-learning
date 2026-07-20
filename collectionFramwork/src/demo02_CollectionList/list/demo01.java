package demo02_CollectionList.list;

import java.util.ArrayList;
import java.util.List;

public class demo01 {
    public static void main(String[] args) {

        // 创建一个集合
        List<String> list = new ArrayList<>();
        // 添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        // 在index位置添加索引，其他的依次后移
        list.add(1, "fuc");

        // 删除index处的元素，并返回该元素的值
        String remove = list.remove(1);
        list.remove("aaa");

        list.set(0, "what can i say");

        list.get(0);

    }
}
