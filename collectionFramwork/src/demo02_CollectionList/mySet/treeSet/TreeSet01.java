package demo02_CollectionList.mySet.treeSet;

import demo02_CollectionList.mySet.hashSet01.Student;

import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {

        /*
            TreeSet底层的排序规则
            @Override
            public int compareTo(Student o) {
                // 指定排序规则
                // 只看年龄进行升序排列
                return this.getAge - o.getAge
            }
                this：表示当前要添加的元素
                o：表示已经在红黑树的元素
                返回值：
                    --为负数：认为当前添加的元素小，存左边
                    --为正数：认为当前添加的元素大，存右边
                    --为0：认为当前添加的元素重复，舍弃
         */

        // 创建3个学生对象
        Student s1 = new Student("LiShi", 19);
        Student s2 = new Student("WangWU", 20);
        Student s3 = new Student("LiShi", 19);
        Student s4 = new Student("WangWU", 19);

        // 创建集合
        TreeSet<Student> tr = new TreeSet<>();

        // 当调用 treeSet.add(对象) 时，底层会自动调用该对象的 compareTo() 方法进行比较大小。
        tr.add(s1);
        tr.add(s2);
        tr.add(s3);
        tr.add(s4);

    }
}
