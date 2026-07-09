package demo06;

public class Student extends Person {

    private String name = "yang";

    public void test1(String name) {

        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);

    }

    public void print(String name) {
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }


    // 无参构造器
    public Student() {

        // 会先默认调用父类的无参构造，也就是Person的无参构造
        // 如果父类是有参构造，则子类也要是有参构造
        System.out.println("student类的无参构造");
    }

    // 有参构造
    public Student(String name){
        this.name = name;
    }

}
