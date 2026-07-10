package demo10;

public class Person {

    //2 赋初值每次都执行
    {
        System.out.println("匿名代码块");
    }


    //1 只执行一次
    static {
        System.out.println("静态代码块");
    }

    //3
    public Person() {
        System.out.println("构造方法");
    }
}
