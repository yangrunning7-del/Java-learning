package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class Practise01 {
    public static void main(String[] args) {
        /*
           需求：
                创建集合添加学生对象
                对象属性为：name,age
           要求：
                获取姓名并放到数组中
                使用方法引用
            方法引用的技巧
                1、思考有无这样的方法满足当前的要求
                2、如果有，该方法是否满足引用的规则
                关于静态类里面的方法   类名::方法名
                    成员方法        本类 this::方法名 父类 super::方法名
                    构造方法        类名::new
         */

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zhangShan", 23));
        list.add(new Student("lisi", 24));
        list.add(new Student("wangWang", 25));

        //获取姓名放到数组中
        String[] array = list.stream().map(new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName();
            }
        }).toArray(String[]::new);

        //用方法引用，由于Student类里面有getName方法，类名::方法名，要满足抽象方法第二个形参到最后一个形参与引用方法相同
        String[] array1 = list.stream().map(Student::getName).toArray(String[]::new);

        System.out.println(Arrays.toString(array));
        System.out.println("=====================================");
        System.out.println(Arrays.toString(array1));
    }
}
