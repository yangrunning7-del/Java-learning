package demo02_CollectionList;

import java.util.Objects;

public class Student {
    private String naem;
    private int age;

    public Student(String naem, int age) {
        this.naem = naem;
        this.age = age;
    }

    public Student() {

    }


    public String getNaem() {
        return naem;
    }

    public void setNaem(String naem) {
        this.naem = naem;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(naem, student.naem);
    }


}
