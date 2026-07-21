package demo02_CollectionList.myGenerics;

import java.util.ArrayList;

public class GenericsDemo04 {
    public static void main(String[] args) {
        /*
            泛型不具备继承性，但是数据具备继承性
         */
        ArrayList<Ye> ye = new ArrayList<>();
        ArrayList<Fu> fu = new ArrayList<>();
        ArrayList<Ye> zi = new ArrayList<>();
        ArrayList<Student> stu = new ArrayList<>();

        Hello(ye);
        Hello(fu);
        Hello(zi);

        Hello(stu);

    }


    // 一个泛型方法，要求方法里的类型只能是Ye
    public static <Ye> void Hello(ArrayList<Ye> list) {
    }

    // 泛型通配符"?"
    public static  void Hello1(ArrayList<? extends Ye> list, Ye e) {}

}


class Ye {
}
class Fu extends Ye {}
class Zi extends Fu {}

class Student {
}
