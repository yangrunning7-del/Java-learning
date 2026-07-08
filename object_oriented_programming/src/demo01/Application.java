package demo01;

// 在一个项目中一个只有一个main方法
// 面向对象：以类的方式来组织代码，以对象的封装数据
public class Application {

    // 类是抽象化的，用来实例化，student.name就是一个实例化的过程
    // 实例化之后会返回一个自己的对象
    // student对象就是一个Student类的具体案例

    public static void main(String[] args) {
        Student student = new Student();

        student.name = "梦栈";
        student.age = 18;
        student.study();


        student.name = "光头强";
        student.age = 19;
        student.study();

    }
}
