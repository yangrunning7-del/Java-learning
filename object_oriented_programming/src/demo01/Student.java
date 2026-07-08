package demo01;

// 学生类， 一个类有属性和方法，可以跟c语言的结构体类比的理解，不过java的类还包括方法
public class Student {

    // 属性
    String name;
    int age;

    // 方法
    public void study() {
        System.out.println(this.name + " is studying and passionate about life");
    }

}
