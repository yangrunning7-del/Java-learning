package demo01;

public class ObjectClone {
    public static void main(String[] args) throws CloneNotSupportedException {
       Clone s1 = new Clone("zhang", 3);
       Clone s2 = (Clone)s1.clone();
       System.out.println(s1 == s2);
       System.out.println(s1.equals(s2));

       System.out.println(s2);

    }

}

// 必须实现这个Cloneable接口，才能去调用这个类里面的clone方法，或者说去克隆里面的东西
class Clone implements Cloneable {

    private String name;
    private int age;


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

    // 有参构造器
    public Clone(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Clone{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // TODO 重写 clone() 方法，扩大访问权限为 public时（就可以在不同的包调用这个clone），并调用 super.clone()
    // TODO 不重写的话，object里面的clone方法由protected修饰，在不同的包就不可以调用
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // 调用 Object 的本地方法完成浅拷贝
    }
    // TODO 在非父类包下，想要不重写地调用 Object 的 clone()，调用者的引用变量类型，必须和当前类本身完全一致（或者是它的子类），绝对不能是其他兄弟类。
    // TODO 如把第5行和第6行的类都改成ObjectClone类

}
