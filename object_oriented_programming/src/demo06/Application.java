package demo06;


// 关于super()的学习
public class Application {

    public static void main(String[] args) {
        Student stu1 = new Student();
        /*
        输出结果为以下：
        person的无参构造
        student类的无参构造
         */
        System.out.println("==============");

        stu1.test1("yangrunning");

        System.out.println("==============");

        stu1.print("yangrunning");

        System.out.println("==============");
        Student stu2 = new Student("yangrunning");
    }
}
