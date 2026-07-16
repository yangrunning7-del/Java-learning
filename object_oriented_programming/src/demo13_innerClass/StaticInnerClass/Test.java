package demo13_innerClass.StaticInnerClass;

public class Test {
    public static void main(String[] args) {
        /*
            1、静态内部类也是成员内部类的一种
            2、只能访问外部类中的静态变量和静态方法
            3、访问非静态的需要创建外部类的对象

            创建静态内部类-对象-格式
                外部类.名内部类名 对象名 = new 外部类名.内部类名(); 这是调用内部类名的对象，注意有无括号的区别
                                                             与new 外部类名. new 内部类名的区别，
                                                             这是先调用外部类对象再调用外部类里面的内部类对象
            创建静态方法的格式
                外部类名.内部类名.方法名();

         */
        Outer.Inner inner = new Outer.Inner();
        inner.way2();// 调用非静态的方法

        Outer.Inner.way1();


    }

}
