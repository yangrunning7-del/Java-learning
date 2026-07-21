package demo02_CollectionList.myGenerics.practise;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        ArrayList<TeddyDog> teddDog = new ArrayList<>();
        ArrayList<HuskyDog> huskyDog = new ArrayList<>();
        ArrayList<LiHuaCat> lihua = new ArrayList<>();
        ArrayList<PersianCat> persian = new ArrayList<>();

        keepPet1(lihua);
        keepPet1(persian);

        System.out.println("====================================");

        keepPet2(teddDog);
        keepPet2(huskyDog);
        keepPet3(animals);
    }

    // 泛型方法，加通配符
    public static void keepPet1(ArrayList<? extends Cat> list){}

    public static void keepPet2(ArrayList<? extends Dog> list){}

    public static void keepPet3(ArrayList<? extends Animal> list){}
}
