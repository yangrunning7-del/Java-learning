package demo07;
// 方法的重写
public class Application {
    public static void main(String[] args) {

        // 静态的方法，调用时只和左边的数据类型有关，所以第二个输出为B类方法的内容
        // 静态的方法和非静态的方法的区别
        A a = new A();
        a.test();

        B b = new A();
        b.test();

        System.out.println("==========");


        // 动态的方法的重写
        A a1 = new A();
        a1.print();


        B b1 = new A(); // 现在是动态的方法，子类A的方法，把父类的方法重写了，他们方法的名字相同
        b1.print();

        // 现在两输出的都是A-->print
    }
    /*

     */


}
