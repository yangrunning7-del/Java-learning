package demo01;

public class Java01_Object {
    public static void main(String[] args) {
        //TODO 常见类
        // java.lang.Object: 对象

        Object obj = new Person();

        // 对象转化为字符串
        // toString默认打印的是对象的内存地址，所以，为了更直观的理解对象的内容，一般会重写这个方法
        String s = obj.toString();  // 调用Person类里面的toString()
        System.out.println(s);

        // TODO 获取对象的内存地址
        int i = obj.hashCode();
        System.out.println(i);

        // TODO 判断两个对象是否相等，如果相等，则返回true，否则返回false
        obj.equals(new Person());
        System.out.println(obj.equals(new Person()));
    }

}

class Person {

    public String name = "zhangsan";

    // 重写toString
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class User extends Person {

}