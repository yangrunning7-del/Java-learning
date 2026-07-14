package demo01;

public class Java03_Object {

    // TODO , getClass返回此object的运行时类
    public static void main(String[] args) {
        Car car = new Car();
        Object o = new Car();

        Class c1 = car.getClass();
        Class c2 = o.getClass();

        System.out.println(c1.getName()); // TODO 打印出的结果 demo01.Car
        System.out.println(c2.getName());
    }
}

class Car{

}
