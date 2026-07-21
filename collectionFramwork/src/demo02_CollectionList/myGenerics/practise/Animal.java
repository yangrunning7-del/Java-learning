package demo02_CollectionList.myGenerics.practise;

// 在不确定年龄和姓名的类别时候的写法
//public class Animal<I, T>{
//    I age;
//    T name;
//}
public abstract class Animal {
    // 父类要抽取所有子类共有的方法和对象
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 由于每个子类的eat()方法都不同，所以要写成抽象方法让子类去实现
    public abstract void eat();
}
