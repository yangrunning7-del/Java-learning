package demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class demo02 {
    public static void main(String[] args) {
        /*
            将以下集合中的数字转化为int型
            "1", "2", "3", "4", "5"
         */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5");

        list.stream().map(Integer::parseInt).forEach(System.out::println);

    }
}
