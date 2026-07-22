package demo02_CollectionList.mySet.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Practise01 {
    public static void main(String[] args) {

        // Todo 比较器排序
        // 创建集合
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>(){
            // 自定义比较规则
            // o1表示当前要添加的元素，o2表示已经在红黑树存在的元素
            // o1.length() - o2.length()的返回值
            // 正数就表明，当前元素比已经存红黑树的元素大，存右边
            @Override
            public int compare(String o1, String o2) {
                int i = o1.length() - o2.length();
                i = i == 0 ? o1.compareTo(o2) : i;
                return i;
            }
//          lambda表达式的写法
//            @Override
//            public int compare(String o1, String o2) {
//                int i = o1.length() - o2.length();
//                i = i == 0 ? o1.compareTo(o2) : i;
//                return i;
//            }
        });

        // 添加元素
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        //
    }
}
