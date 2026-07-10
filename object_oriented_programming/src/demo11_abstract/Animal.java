package demo11_abstract;

public abstract class Animal {
    private String name;    // 所有动物的名字

    public Animal(String name) {
        System.out.println("父类构造器，开始打地基，名字为：" + name);
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public abstract void eat();

}
