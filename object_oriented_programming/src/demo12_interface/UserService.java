package demo12_interface;

// interface是定义接口的关键字，接口需要有实现类
public interface UserService {

    // 常量, 灰色全都是默认的类型或者是静态非静态
    public static final int age = 99;

    // 接口中所有的定义都是抽象的，public abstract
    // public abstract void run(String name);
    // 与下面的写法是等价的
    void adds(String name);
    void remove(String name);
    void update(String name);
    void query();

}
