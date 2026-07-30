package immutableCollection;

import java.util.List;

public class demo01 {
    public static void main(String[] args) {
        /*
            创建不可变的List集合
            创建之后是不可以修改的，只能查询
         */
        List<String> list = List.of("what", "can", "i", "say");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("=================================");
        list.forEach(s -> System.out.println(s));
    }
}
