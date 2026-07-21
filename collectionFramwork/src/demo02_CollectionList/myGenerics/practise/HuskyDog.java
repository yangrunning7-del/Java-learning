package demo02_CollectionList.myGenerics.practise;

public class HuskyDog extends Dog{
    @Override
    public void eat() {
        System.out.println("一只叫作"+ getName() +"的，"+getAge() +"岁的哈士奇，正在吃骨头");
    }
}
