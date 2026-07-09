package demo04;

// 类  private：私有
public class Student {

    // 属性私有
    private String name;
    private int age;
    private int id;



    // 属性私有，不可以直接操作属性
    // 但是可以有一些来操作属性的方法
    // 如public的get, set方法


    // getName获得这个数据
    public String getName(String name) {
        return name;
    }
    // setName设置这个数据
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0 || age>125){
            this.age = 3;
        }else {
            this.age = age;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
