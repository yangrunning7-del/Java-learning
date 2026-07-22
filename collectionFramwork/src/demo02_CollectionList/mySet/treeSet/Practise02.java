package demo02_CollectionList.mySet.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Practise02 {
    public static void main(String[] args) {
        // 创建集合,由于要用到排序，还有去重，所以选择TreeSet集合
        // 集合对象里，为空参构造，那么就使用默认的排序，
        // 也可以使用，有参构造如下，可自定义排序规则
        // TreeSet传了参数，参数为式接口Comparator的实现类，用于自定义排序规则，当往集合TreeSet里添加元素时Java底层会默认执行它进行排序
        TreeSet<Student02> ts = new TreeSet<>(new Comparator<Student02>(){
            @Override
            /*
                o1:表示当前要添加的元素
                o2:表示已经在红黑树中的元素

             */
            public int compare(Student02 o1, Student02 o2) {
                int sum1 = o1.getChinese() + o1.getMath() + o1.getEnglish();
                int sum2 = o2.getChinese() + o2.getMath() + o2.getEnglish();

                int i = sum1 - sum2;
                i = i == 0 ? o1.getChinese() - o2.getChinese() : i;
                i = i == 0 ? o1.getMath() - o2.getMath() : i;
                i = i == 0 ? o1.getEnglish() - o2.getEnglish() : i;
                i = i == 0 ? o1.getAge() - o2.getAge() : i;
                i = i == 0 ? o1.getName().compareTo(o2.getName()) : i;

                return i;
            }
        });

        // 创建集合对象
        Student02 s1 = new Student02("ZhangShan", 18, 66, 99, 1);
        Student02 s2 = new Student02("LiShi", 19, 55, 66, 2);
        Student02 s3 = new Student02("WangWU", 20, 66, 77, 3);

        // 将对象添加到集合中
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        /*
            排序的方式
                1.默认排序/自然排序，在对应的类中去继承函数式接口Comparable,再重写里面的compareTo方法（方法里写新的排序规则）即可
                2.比较器排序，在创建集合的时候可以去new comparator(){}，在里面重写方法（方法里写新的排序规则）
         */
        for (Student02 t : ts) {
            System.out.println(t);
        }

    }
}
