package demo02_CollectionList.mySet.treeSet;

public class Student02 implements Comparable<Student02> {
    private String name;
    private int age;
    private int chinese;
    private int Math;
    private int english;

    public Student02(String name, int age, int chinese, int math, int english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        Math = math;
        this.english = english;
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

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    @Override
    public int compareTo(Student02 o) {
        int sum1 = this.chinese + this.english + this.Math;
        int sum2 = o.chinese + o.english + o.Math;

        int i = sum1 - sum2;
        // 如果总分一样按照语文成绩排序，this.getChinese() - o.getChinese() 有返回值
        // 正数，则表明添加元素大于已存在红黑树的元素，存在右边
        // 负数，则表明添加元素小于已存在红黑树的元素，存在左边
        // 0，则表明不添加
        // this：表明是当前要添加的元素
        // o: 则表明是已存在红黑树的元素
        i = i == 0 ? this.getChinese() - o.getChinese() : i;
        i = i == 0 ? this.getMath() - o.getMath() : i;
        i = i == 0 ? this.getEnglish() - o.getEnglish() : i;
        i = i == 0 ? this.getAge() - o.getAge() : i;
        // 如果比较的是字符串String，则用默认的compareTo方法，在添加元素时都在Java底层默认执行这些代码
        i = i == 0 ? this.getName().compareTo(o.getName()) : i;
        return i;
    }

    @Override
    public String toString() {
        return "Student02{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", chinese=" + chinese +
                ", Math=" + Math +
                ", english=" + english +
                ", sum=" + sumScore() +
                '}';
    }

    public int sumScore(){
        return Math + english + Math;
    }
}
