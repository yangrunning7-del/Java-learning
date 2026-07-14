package demo01;

public class Java04_Object {
    public static void main(String[] args) {
    People p1 = new People("zhangshan", 3);
    People p2 = new People("wangwu", 4);
    People p3 = new People("lishi", 5);

    // TODO 调用toString
    System.out.println(p1.toString());
    System.out.println(p2.toString());
    System.out.println(p3.toString());

    System.out.println(p1.equals(p2));
    System.out.println(p1.equals(p3));

    // TODO
    System.out.println(p1.equals(new People("yangrunning", 3)));
    }
}

class People{
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }




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

    /*
        重写equals方法，不重写就和普通的 == 区别不是很大
            我们可以重新定义两个对象的name和age
            p1.equals(p2)

     */



    @Override
    public String toString() {
        return "people{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
        // 返回的name是这个方法里面的name和age
        // 所以这两行代码尤为关键
        // this.name = name;
        // this.age = age;
    }

    @Override
    public boolean equals(Object obj){
        try {
            if (obj instanceof People){
                People one1 = (People)obj;
                if (this.name.equals(one1.getName()) && this.age == one1.getAge()){
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            System.out.println(e);
            System.out.println("请检查一下");
            return false;
        }
    }

    /*
        另一个更好的写法
        @Override
public boolean equals(Object obj) {
    // 1. 如果比较的是自己，直接返回 true（性能优化）
    if (this == obj) return true;
    // 2. 如果传入 null，或者类型不一致，返回 false
    if (obj == null || getClass() != obj.getClass()) return false;

    // 3. 安全强转
    People one1 = (People) obj;
    // 4. 比较核心字段（用 Objects.equals 防止 name 为 null）
    return Objects.equals(this.name, one1.name) && this.age == one1.age;
}

     */


}
