package demo09;

public class Application {
    public static void main(String[] args) {

         Object object = new Student();


         // Object类型，但是实际是Student类，而如果是本类或者是子类的话就会返回true
         System.out.println(object instanceof Student);
         System.out.println(object instanceof Person);// object的实际的类是Student，而person是Student的父类，所以返回true
         System.out.println(object instanceof Object);// object的实际的类是Student，而所有的类都是Object的子类，故返回true

         System.out.println(object instanceof Teacher);// Student类和Teacher类没有关系
         System.out.println(object instanceof String);// Student类和String类没有关系

        System.out.println("=========================");
        Person person = new Student();
        System.out.println(person instanceof Student);
        System.out.println(person instanceof Person);
        System.out.println(person instanceof Object);

        System.out.println(person instanceof Teacher);

        // System.out.println(person instanceof String);编译就报错，因为类型不一样

        // 编译器检查了有没有某个对象是person又是String，也就是继承关系，但尽管都是Object的子类，但它们没有继承或者等同的关系，所以会一直false
        // 所以编译不通过
        /*
             那为什么这个也是一直false为什么可以编译通过？
             System.out.println(object instanceof String);// Student类和String类没有关系
             因为，object的对象完全可能写成这样
             Object object = new String();
             这样object对象就和String实际类型就是一样的。那上面那行代码就会返回true

             那是不是person对象也可以这样写呢
             Person person = new String();
             答案是不可以！new的类型或者类，必须是Person类或者是Person的子类（父类的引用指向子类的对象）
             上面的代码可以写是因为Object类是所有类的父类
         */

        /*
            1、父类的引用指向子类
            2、把子类转化成父类，向上转型，自动转
            3、把父类转化成子类，向下转型，强制转换

         */

    }
}
