package demo11_abstract;

/*
    关于父类构造器
        理解：可以解释为，父类构造器负责初始化“大类”共有的属性，子类构造器负责初始化“细分”特有的属性。
            分工明确，一起完成子类对象的创建。在这个例子中，先命名（父类构造器），再划分种类（子类构造器）
        注意：子类构造器必须调用父类构造器
 */

public class Dog1 extends Animal {
    private String breed;   // 狗特有的品种

    public Dog1(String name , String breed) {
        super(name); // 调用父类构造器
        System.out.println("子类构造器 开始盖房子，品种设置为：" + breed);
    }


    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }
}
