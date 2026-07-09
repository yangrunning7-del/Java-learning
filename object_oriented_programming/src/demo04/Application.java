package demo04;

/*
    追求高内聚、低耦合。
    属性私有，get、set

    关于封装的原因
    主要是对属性来封装，通过方法来使用属性

    1、提高程序的安全性
    2、隐藏代码的实现细节
    3、统一接口
    4、系统的可维护性提高了

 */

public class Application {
    public static void main(String[] args){
        Student stu1 = new Student();
        System.out.println(stu1.getName("heyhey"));
        System.out.println(stu1.getName("heyhey"));

        stu1.setAge(18);
        System.out.println(stu1.getAge());

        stu1.setId(2024110);
        System.out.println(stu1.getId());

    }
}
