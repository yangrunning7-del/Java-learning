package demo01;

import java.util.Arrays;
import java.util.Comparator;

public class demo01 {
    // 方法引用
    public static void main(String[] args) {
        // 创建一个数组进行倒序排列
        Integer[] arr = {1,2,3,4,5};
        // 匿名内部类
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        Arrays.sort(arr, (Integer o1, Integer o2) -> o2 - o1);

        System.out.println(Arrays.toString(arr));

        /*
            方法引用：
                1、引用处必须是函数式接口
                2、被引用的方法需要已经存在
                3、被引用方法的形参和返回值需要跟抽象方法的形参和返回值保持一致
                4、被引用方法的功能需要满足当前的要求

         */


        //表示引用demo01类里面的subtraction方法，该方法满足排序的类型
        Arrays.sort(arr, demo01::subtraction);


    }
    public static int subtraction(int num1, int num2) {
        return num2 - num1;
    }
}
