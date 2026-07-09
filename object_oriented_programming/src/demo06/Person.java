package demo06;

public class Person {

    protected String name = "sleep";


    // 方法
    public void print(){
        System.out.println("person");
    }

    // 无参构造
    public Person() {
        System.out.println("person的无参构造");
    }

    // 有参构造
    public Person(String name){
        this.name = name;
    }
}
