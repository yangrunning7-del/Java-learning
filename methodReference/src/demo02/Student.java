package demo02;

public class Student {
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 可用于方法引用，不用再填写返回值，构造方法中
    // this.name = name
    // this.age = age,就会把值返回到Student类中
    public Student(String str){
        String name = str.split("-")[0];
        int age = Integer.parseInt(str.split("-")[1]);
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
