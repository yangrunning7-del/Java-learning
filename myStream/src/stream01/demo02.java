package stream01;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Stream;

public class demo02 {
    public static void main(String[] args) {
        // 单列集合获取stream流，----通过Collection来获取
        // 双列集合不能直接获取stream流，---通过转化为一个单列集合，如entry对象构成的集合，再通过Collection来获取
        // 数组获取stream流，---通过Arrays工具类的静态方法
        // 一堆零散的数据（要求数据类型相同）获取stream流，---通过Stream接口中的静态方法
        // TODO 其中，Stream.of方法传的数据类型只能是引用数据类型，不能传基本数据类型


        // 单列集合
        HashSet<String> hs = new HashSet<>();
        Collections.addAll(hs, "a", "b", "c");
        hs.stream().forEach(s -> System.out.println(s));
        System.out.println("======================================");

        // 双列集合
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "1");
        hm.put(2, "2");
        hm.put(3, "3");
        // 通过双列集合转化为单列集合来获取stream流
        hm.keySet().stream().forEach(s -> System.out.println(s));

        // 数组来获取stream流
        String[] arr = {"one", "two", "three"};
        // 通过Arrays静态方法来获取
        Arrays.stream(arr).forEach(s -> System.out.println(s));

        // 零散的数据，数据类型相同
        Stream.of(1,2,4).forEach(s -> System.out.println(s));

    }
}
