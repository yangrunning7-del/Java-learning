package practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demo01 {
    public static void main(String[] args) {
        ArrayList<String> listMan = new ArrayList<>();
        ArrayList<String> listWoman = new ArrayList<>();

        Collections.addAll(listMan, "蔡坤坤,24", "叶齁咸,23", "刘不甜,22", "吴签,24", "谷嘉,30", "肖梁梁,27");
        Collections.addAll(listWoman, "赵小颖,35", "杨颖,36", "高元元,43", "张天天,31", "刘诗,35", "杨小幂,33");

        Stream<String> stream1 = listMan.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .limit(2);

        Stream<String> stream2 = listWoman.stream()
                .filter(s -> s.split(",")[0]
                        .startsWith("杨")).skip(1);

        /*List<Actor> list1 = Stream.concat(stream1, stream2).map(new Function<String, Actor>(){
            @Override
            public Actor apply(String s) {
                String[] split = s.split(",");
                String name = split[0];
                int age = Integer.parseInt(split[1]);
                return new Actor(name, age);
            }
        }).collect(Collectors.toList());*/

        // 简化的写法lambda表达式
        List<Actor> list2 = Stream.concat(stream1, stream2)
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                        .collect(Collectors.toList());


        System.out.println(list2);

    }
}
