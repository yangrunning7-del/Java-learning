package demo02;

public class Person {

    // 一个类即使什么都不写，也会存在一个方法
    // 显示定义的构造器

    // 属性
    String name;
    int age;

    // 无参构造，实例化的初始值
    // 在main里面的Person person = new Person(),实例化初始值
    public Person() {
        this.name = "effort";
        this.age = 100;
    }

    // 有参构造：一旦定义了有参构造，无参定义必须要显示定义
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
    构造器：
        1、和类名相同
        2、没有返回值
    作用：
        1、new 本质是在调用构造方法，调用类里面的构造方法
        2、初始化对象的值
    注意：
        1、定义了有参构造之后，如果想使用无参构造，则必须显示的定义一个无参的构造
    快捷键：
        1、alt+Insert，自动填写无参构造或者有参构造由自己选择

     */


}
