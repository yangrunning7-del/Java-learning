package demo02_CollectionList.myGenerics.practise;

public class PersianCat extends Cat{
    @Override
    public void eat() {
        System.out.println("一只叫作"+ getName() +"的，"+getAge() +"岁的波斯猫，正在吃饼干");
    }
}
