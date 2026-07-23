package demo03_Map.practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class Test01 {
    public static void main(String[] args) {
        // 创建Student类对象
        Student s1 = new Student("ZhangSan", 18);
        Student s2 = new Student("ZhaoLiu", 19);
        Student s3 = new Student("WangWu", 20);

        // 创建HashMap集合
        HashMap<Student, String> map = new HashMap<>();
        map.put(s1, "ShangWei");
        map.put(s2, "LuFen");
        map.put(s3, "JiaDong");

        /*
            1、通过将键存到单列集合中keySet，再通过get方法来获取其中的值
            2、通过entry对象，也就是将键值对整体看作一个对象，创建entrySet集合，再通过get方法来获取
            3、通过lambda表达式的方法来遍历获取其中的值
         */

        // 法一
        Set<Student> set1 = map.keySet();
        for (Student student : set1) {
            System.out.println(student.getName() + " " + student.getAge());
        }
        System.out.println("================================");

        // 法二
        Set<Map.Entry<Student, String>> set2 = map.entrySet();
        for (Map.Entry<Student, String> entry : set2) {
            System.out.println("key:" + entry.getKey() + " value:" + entry.getValue());
        }
        System.out.println("================================");

        // 法三
        set1.forEach(new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                System.out.println(student.getName() + " " + student.getAge());
            }
        });
    }
}
