package demo01;

public class Java02_Object {

    public static void main(String[] args) {

        // hashCode的使用，返回的是地址值
        /*
        关于比较运算符的==，
            比较基本数据类型，比较的是数值是否相等
            比较引用数据类型，比较的是变量中存在的地址值
         */
        Person1 user1 = new Person1();
        Person1 user2 = new Person1();
        Person1 user3 = new Person1();

        System.out.println(user1.hashCode());
        System.out.println(user1.hashCode());

        System.out.println("=============");

        System.out.println(user2.hashCode());
        System.out.println(user2.hashCode());

        System.out.println("=============");

        System.out.println(user3.hashCode());
        System.out.println(user3.hashCode());

        System.out.println("=============");

        // == 比较基本数据类型
        System.out.println(user1 == user2); // 返回false
        Person1 user4 = user3;
        System.out.println(user4 == user3); // 返回true


    }
}
class Person1 {

    // TODO 构造方法
    public Person1() {
        super();
    }
}

class Student extends Person1 {

    public String name;

    public Student() {}
    public void study(){

    }
}