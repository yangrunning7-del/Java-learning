package demo02;

public class Application {
    public static void main(String[] args) {
        Person student1 = new Person("guangtouqiang", 18);
        System.out.println(student1.name);
        System.out.println(student1.age);

        Person student2 = new Person();
        System.out.println(student2.name);
        System.out.println(student2.age);
    }
}
