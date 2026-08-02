package exception.practice;

public class GirlFriend {
    private String name;
    private int age;

    public GirlFriend() {}
    public GirlFriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() < 3 || name.length() > 10){
            //抛出异常后下面的代码不再执行
            throw new MyException("Name must be between 3 and 10 characters");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 18 || age > 40 ){
            throw new AgeOutOfBoundsException("Age must be between 18 and 40 characters");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
