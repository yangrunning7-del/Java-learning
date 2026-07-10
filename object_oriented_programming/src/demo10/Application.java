package demo10;

// 静态导入包
import static java.lang.Math.random;
import static java.lang.Math.PI;

public class Application {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println("=================");

        Person person1 = new Person();

        System.out.println(PI);
        System.out.println(random());
    }
}
