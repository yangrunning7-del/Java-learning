package demo12_interface;

/*
    抽象类的关键字：extends
    类可以实现接口 implements 接口
    实现了接口的类，就要重写接口中的方法
 */


// 接口的实现类一般在后面加Impl来规范命名
// 实现的关键字implements
public class UserServiceImpl implements UserService, TimeService {
    // 多继承，可以用接口来实现
    // 快捷键alt + insert

    @Override
    public void adds(String name) {

    }

    @Override
    public void remove(String name) {

    }

    @Override
    public void update(String name) {

    }

    @Override
    public void query() {

    }

    @Override
    public void run(String name) {

    }

    @Override
    public void sleep(String name) {

    }

    @Override
    public void eat(String name) {

    }
}
