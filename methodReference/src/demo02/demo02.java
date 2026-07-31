package demo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Collectors;

public class demo02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌,15","周芷若,14","赵敏,13","张强,20","张三丰,100","张翠山,40","张良,35");

        list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                return new Student(s.split(",")[0], Integer.parseInt(s.split(",")[1]));
            }
        }).collect(Collectors.toList()).forEach(System.out::println);

        //方法引用
        // Student::new,转化并创建一个Student对象
        list.stream().map(Student::new).forEach(System.out::println);
    }
}
